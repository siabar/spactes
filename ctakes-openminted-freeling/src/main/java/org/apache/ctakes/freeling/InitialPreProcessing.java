package org.apache.ctakes.freeling;

import static com.github.pemistahl.lingua.api.Language.DANISH;
import static com.github.pemistahl.lingua.api.Language.DUTCH;
import static com.github.pemistahl.lingua.api.Language.ENGLISH;
import static com.github.pemistahl.lingua.api.Language.FRENCH;
import static com.github.pemistahl.lingua.api.Language.GERMAN;
import static com.github.pemistahl.lingua.api.Language.SPANISH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.uima.jcas.JCas;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

import de.tudarmstadt.ukp.dkpro.core.api.resources.MappingProvider;
import edu.upc.Jfreeling.ChartParser;
import edu.upc.Jfreeling.DepTreeler;
import edu.upc.Jfreeling.DepTxala;
import edu.upc.Jfreeling.HmmTagger;
import edu.upc.Jfreeling.LangIdent;
import edu.upc.Jfreeling.ListSentence;
import edu.upc.Jfreeling.ListSentenceIterator;
import edu.upc.Jfreeling.ListWord;
import edu.upc.Jfreeling.ListWordIterator;
import edu.upc.Jfreeling.Maco;
import edu.upc.Jfreeling.MacoOptions;
import edu.upc.Jfreeling.SWIGTYPE_p_splitter_status;
import edu.upc.Jfreeling.Splitter;
import edu.upc.Jfreeling.Tokenizer;
import edu.upc.Jfreeling.Util;
import edu.upc.Jfreeling.Word;

public class InitialPreProcessing {

	public final String language = "es";
	public final Boolean dictionary_parser = false;
	public Boolean lemmaForm = false;
	public final Boolean doDependency = true;
	public final Boolean useTxala = false;
	public final Boolean autodetect = false;

	private static final String FREELINGDIR = "/usr/local/";
	private static final String DATA = FREELINGDIR + "share/freeling/";
	// this could be taken from config files...
	private static Set<String> TreelerLangs = new HashSet<String>(Arrays.asList("ca", "de", "en", "es", "pt", "sl"));
	private static Set<String> TxalaLangs = new HashSet<String>(Arrays.asList("ca", "en", "es", "as", "gl")); // removed
																												// "as"
																												// and
																												// "gl"
	
	final LanguageDetector detector = LanguageDetectorBuilder.fromLanguages(ENGLISH, FRENCH, GERMAN, SPANISH, DANISH, DUTCH).build();
	final List<Language> NotAcceptedLang = Arrays.asList(ENGLISH, FRENCH, GERMAN, DANISH, DUTCH);
	
	private LangIdent lgid;

//	private HashMap<String, Tokenizer> tks = new HashMap<>();
//	private HashMap<String, Splitter> sps = new HashMap<>();
//	private HashMap<String, SWIGTYPE_p_splitter_status> sids = new HashMap<>();
//	private HashMap<String, Maco> mfs = new HashMap<>();
//	private HashMap<String, HmmTagger> tgs = new HashMap<>();
//	private HashMap<String, ChartParser> parsers = new HashMap<>();
//	private HashMap<String, DepTxala> depTs = new HashMap<>();
//	private HashMap<String, DepTreeler> deps = new HashMap<>();
//	private ListSentence ls;

	private HashMap<String, Tokenizer> tks;
	private HashMap<String, Splitter> sps;
	private HashMap<String, SWIGTYPE_p_splitter_status> sids;
	private HashMap<String, Maco> mfs;
	private HashMap<String, HmmTagger> tgs;
	private HashMap<String, ChartParser> parsers;
	private HashMap<String, DepTxala> depTs;
	private HashMap<String, DepTreeler> deps;
	private ListSentence ls;

	private MappingProvider posMappingProvider;
	private MappingProvider depMappingProvider;
	private JCas aJCas;

	public static void listf(String directoryName, List<File> files) {
		File directory = new File(directoryName);

		// Get all files from a directory.
		File[] fList = directory.listFiles();
		if (fList != null)
			for (File file : fList) {
				if (file.isFile()) {
					files.add(file);
				} else if (file.isDirectory()) {
					listf(file.getAbsolutePath(), files);
				}
			}
	}

	public void freeling(List<File> files) throws Exception {
		System.loadLibrary("Jfreeling");
		Util.initLocale("default");
		init(language);

		for (File file : files) {

		
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String fileName = file.toString().replace("/Original", "/Tokenized_Freeling");
			
			File new_file = new File(fileName);

			boolean textt = new_file.getParentFile().mkdirs();
			

			
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			
//		    writer.write(str);

			String st;
			String[] LineList = null;
			List<String> listStr = new ArrayList<String>();

			while ((st = br.readLine()) != null) {
				LineList = st.split("\n");
				for (String text : LineList) {
					tokenizer(text, writer);
//					boolean b = text.startsWith("CONTROL");
//					if (b == true){
//						System.out.println("checkpoint");
//					}
//					Language detectedLanguage = detector.detectLanguageOf(text);	
//					if (!NotAcceptedLang.contains(detectedLanguage)){
////						detectedLanguage = detector.detectLanguageOf(text);	
////						if (detectedLanguage.equals(SPANISH)){
//						tokenizer(text, writer);
////						}else {
////							System.out.println("----------------"+ detectedLanguage.toString() + "-Text: " + text);
////						}
//					}
//					else {
//						System.out.println(detectedLanguage.toString() + "-Text: " + text);
//					}
					
//					System.out.println("checkpoint");
				}
			}
			writer.close();
		}
	}

	public void tokenizer(String line, BufferedWriter writer) throws IOException {
		ListWord l = tks.get(language).tokenize(line);
		// Split the tokens into distinct sentences.
		// getLogger().info(" sentence split" );
		ls = sps.get(language).split(sids.get(language), l, true);
		// Perform morphological analysis
		// getLogger().info(" morpho" );
		mfs.get(language).analyze(ls);
		// Perform part-of-speech tagging.
		// getLogger().info(" POS" );
		tgs.get(language).analyze(ls);

		ListSentenceIterator sIt = new ListSentenceIterator(ls);

//		final StringBuilder sb = new StringBuilder();
		
		int begin;
		int end = 0;
		while (sIt.hasNext()) {
			edu.upc.Jfreeling.Sentence s = sIt.next();
			ListWordIterator wIt = new ListWordIterator(s);
			// iterate over tokens

			List<String> listStr = new ArrayList<String>();
			
			
			Boolean first = true;
			int sBegin = 0;

			while (wIt.hasNext()) {
				Word w = wIt.next();
				begin = (int) w.getSpanStart();
				if (first) {
					first = false;
					sBegin = begin;
				}
				end = (int) w.getSpanFinish();

//				sb.append(line.subSequence(begin, end)).append(" ");
				if (!w.getForm().equalsIgnoreCase("."))
					try {
						if (lemmaForm) {
							if (line.length() <= 4) {
								listStr.add((String) line.subSequence(begin, end));
							} else {
								listStr.add(w.getLemma());
							}

						} else {
							listStr.add((String) line.subSequence(begin, end));
						}
					} catch (Exception e) {
						System.out.println(line + " -> " + begin + " - " + end);
					}
			}
			for (String str : listStr) {
				writer.write(str + " ");
			}
			writer.newLine();
		}

		// sb.setLength(Math.max(0, sb.length() - 2));


	}

	private void init(String lang) throws Exception {
		tks = new HashMap<>();
		sps = new HashMap<>();
		sids = new HashMap<>();
		mfs = new HashMap<>();
		tgs = new HashMap<>();
		parsers = new HashMap<>();
		depTs = new HashMap<>();
		deps = new HashMap<>();

		if (tks.containsKey(lang))
			return;
		// language already set

		// read the configuration file
		Properties prop = new Properties();
		InputStream input = new FileInputStream(DATA + "config/" + lang + ".cfg");
		System.out.println(DATA);
		prop.load(input);

		// Create options set for maco analyzer.
		// Default values are Ok, except for data files.
		MacoOptions op = new MacoOptions(lang);

		op.setDataFiles("", DATA + "common/punct.dat",
				prop.getProperty("DictionaryFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("AffixFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("CompoundFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("LocutionsFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("NPDataFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("QuantitiesFile").replace("$FREELINGSHARE/", DATA).trim(),
				prop.getProperty("ProbabilityFile").replace("$FREELINGSHARE/", DATA).trim());

		tks.put(lang, new Tokenizer(DATA + lang + "/tokenizer.dat"));
		sps.put(lang, new Splitter(DATA + lang + "/splitter.dat"));
		sids.put(lang, sps.get(lang).openSession());

		Maco mf = new Maco(op);
		/*
		 * mf.setActiveOptions(false, true, true, true, // select which among created
		 * true, true, false, true, // submodules are to be used. true, true, true,
		 * true); // default: all created submodules
		 */
		mf.setActiveOptions(false, // umap
				prop.getProperty("NumbersDetection").trim().contentEquals("yes"), // num,
				prop.getProperty("PunctuationDetection").trim().contentEquals("yes"), // pun,
				prop.getProperty("DatesDetection").trim().contentEquals("yes"), // dat,
				prop.getProperty("DictionarySearch").trim().contentEquals("yes"), // dic,
				prop.getProperty("AffixAnalysis").trim().contentEquals("yes"), // aff,
				prop.getProperty("CompoundAnalysis").trim().contentEquals("yes"), // comp,
				true, // rtk, // not found in properties....
				prop.getProperty("MultiwordsDetection").trim().contentEquals("yes"), // mw,
				prop.getProperty("NERecognition").trim().contentEquals("yes"), // ner,
				prop.getProperty("QuantitiesDetection").trim().contentEquals("yes"), // qt,
				prop.getProperty("ProbabilityAssignment").trim().contentEquals("yes")// prb
		);

		mfs.put(lang, mf);
		// are used
		tgs.put(lang, new HmmTagger(DATA + lang + "/tagger.dat", true, 2));

	}

	public static void main(String[] args) throws Exception {

		String directoryName = "/home/siabar/30yamak/git/E2.1/corpora/Original/SonEspases_ictusnet";
		List<File> files = new ArrayList<File>();
		listf(directoryName, files);
		InitialPreProcessing x = new InitialPreProcessing();
		x.freeling(files);

	}

}
