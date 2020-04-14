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
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
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

public class Brat_to_conll {

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
				if (file.isFile() && file.getName().endsWith(".txt")) {
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
		String st;
		

		for (File file : files) {
			List<Dictionary> ann_records = new ArrayList<Dictionary>();
			List<Integer> ann_spans = new ArrayList<Integer>();

			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String ann_file = file.toString().replace(".txt", ".ann");
			BufferedReader br_ann = new BufferedReader(new FileReader(ann_file));
			
			while ((st = br_ann.readLine()) != null) {
				if (!st.startsWith("#")) {
					Dictionary ann_dic = new Hashtable(); 
				
					String[] temp_list = st.split("\t");
					ann_dic.put("text", temp_list[2]);
					String[] temp_span = temp_list[1].split(" ");
					ann_dic.put("label", temp_span[0]);
					ann_dic.put("start", Integer.valueOf(temp_span[1]));
					ann_dic.put("end", Integer.valueOf(temp_span[2]));
					ann_records.add(ann_dic);
					if (!ann_spans.contains(Integer.valueOf(temp_span[1])))
						ann_spans.add(Integer.valueOf(temp_span[1]));
					if (!ann_spans.contains(Integer.valueOf(temp_span[2])))
						ann_spans.add(Integer.valueOf(temp_span[2]));
				}
				
			}
			Collections.sort(ann_spans); 
			
			
			String conll_file = file.toString().replace(".txt", ".conll");	
			BufferedWriter writer = new BufferedWriter(new FileWriter(conll_file));
//		    writer.write(str);

			String[] LineList = null;
			List<String> listStr = new ArrayList<String>();
			int SentStart = 0;
			int spans_counter = 0;
			while ((st = br.readLine()) != null) {
				LineList = st.split("\n");
				for (String text : LineList) {
					int SentEnd = SentStart + text.length();
					if (SentEnd >= ann_spans.get(spans_counter) )
					{
						while (ann_spans.size()> spans_counter && SentEnd >= ann_spans.get(spans_counter)) {
							spans_counter +=1;
						}
						tokenizer(text, writer, ann_records, ann_spans, SentStart);
					}
					SentStart += text.length() + 1;
				}
			}
			writer.close();
		}
	}

	public void tokenizer(String line, BufferedWriter writer, List<Dictionary> ann_records,List<Integer> ann_spans, int start) throws IOException {
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
				
		
					
				// start + begin
				// start + end

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

		String directoryName = "/home/siabar/30yamak/git/CompareAnnotations/Annotated/pre_annotations_6/victoria/06";
		List<File> files = new ArrayList<File>();
		listf(directoryName, files);
		Brat_to_conll x = new Brat_to_conll();
		x.freeling(files);

	}

}
