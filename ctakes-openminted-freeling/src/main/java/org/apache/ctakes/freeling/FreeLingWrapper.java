/*
OpenMinted_Freeling
Copyright (C) 2018  grup TALN - Universitat Pompeu Fabra
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package org.apache.ctakes.freeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.Type;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.ResourceMetaData;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.resource.ResourceInitializationException;
import de.tudarmstadt.ukp.dkpro.core.api.parameter.ComponentParameters;
import de.tudarmstadt.ukp.dkpro.core.api.resources.MappingProvider;
import de.tudarmstadt.ukp.dkpro.core.api.resources.MappingProviderFactory;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.SegmenterBase;
//import org.apache.ctakes.typesystem.type.dependency.DependencyFlavor;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.DependencyFlavor;
import edu.upc.Jfreeling.ChartParser;
import edu.upc.Jfreeling.DepTree;
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
import edu.upc.Jfreeling.TreePreorderIteratorDepnode;
import edu.upc.Jfreeling.Util;
import edu.upc.Jfreeling.Word;
import org.apache.ctakes.typesystem.type.textspan.Sentence;
import org.apache.ctakes.core.util.ListFactory;
import org.apache.ctakes.typesystem.type.syntax.Lemma;
import org.apache.ctakes.typesystem.type.syntax.WordToken;
import org.apache.ctakes.typesystem.type.dependency.Dependency;


/**
 * Tokenizer and sentence splitter, POS tagger using FreeLing. parser is pending
 */
@ResourceMetaData(name = "Freeling_Parser")
@TypeCapability(outputs = { "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token",
		"de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence",
		"de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS",
		"de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Lemma" })

public class FreeLingWrapper extends SegmenterBase {
	/**
	 * Use this language instead of the document language to resolve the model.
	 */
	public static final String PARAM_LANGUAGE = ComponentParameters.PARAM_LANGUAGE;
	@ConfigurationParameter(name = PARAM_LANGUAGE, defaultValue = "en", mandatory = false)
	public final String language = "es";

	public static final String PARAM_DICTIONARY = "DICTIONARY_PARSER";
	@ConfigurationParameter(name = PARAM_DICTIONARY, defaultValue = "false", mandatory = false)
	public final Boolean dictionary_parser = false;

	public static final String PARAM_LEMMA = "LEMMA_ACTIVATE";
	@ConfigurationParameter(name = PARAM_LEMMA, defaultValue = "false", mandatory = false)
	public Boolean lemmaForm = false;

	/**
	 * Override the default variant used to locate the model.
	 */
	public static final String PARAM_VARIANT = ComponentParameters.PARAM_VARIANT;
	@ConfigurationParameter(name = PARAM_VARIANT, mandatory = false)
	protected String variant;

	/**
	 * Load the part-of-speech tag to UIMA type mapping from this location instead
	 * of locating the mapping automatically.
	 */
	public static final String PARAM_POS_MAPPING_LOCATION = ComponentParameters.PARAM_POS_MAPPING_LOCATION;
	@ConfigurationParameter(name = PARAM_POS_MAPPING_LOCATION, mandatory = false)
	protected String POSMappingLocation;
	/**
	 * Load the dependency functions to UIMA type mapping from this location instead
	 * of locating the mapping automatically.
	 */
	public static final String PARAM_DEPENDENCY_MAPPING_LOCATION = ComponentParameters.PARAM_DEPENDENCY_MAPPING_LOCATION;
	@ConfigurationParameter(name = PARAM_DEPENDENCY_MAPPING_LOCATION, mandatory = false)
	protected String DependencyMappingLocation;

	/**
	 * Load the ner tags to UIMA type mapping from this location instead of locating
	 * the mapping automatically.
	 */
	public static final String PARAM_NAMED_ENTITY_MAPPING_LOCATION = ComponentParameters.PARAM_NAMED_ENTITY_MAPPING_LOCATION;
	@ConfigurationParameter(name = PARAM_NAMED_ENTITY_MAPPING_LOCATION, mandatory = false)
	protected String NamedEntityMappingLocation;

	/**
	 * Do dependency parsing, it can be changed if there is no available model.
	 */
	public static final String PARAM_DO_DEPENDECY_PARSING = "doDependency";
	@ConfigurationParameter(name = PARAM_DO_DEPENDECY_PARSING, mandatory = true)
	// protected Boolean doDependencys;
	public final Boolean doDependency = true;

	/**
	 * Load the ner tags to UIMA type mapping from this location instead of locating
	 * the mapping automatically.
	 */
	public static final String PARAM_USE_RULE_BASED = "useTxala";
	@ConfigurationParameter(name = PARAM_USE_RULE_BASED, mandatory = false, defaultValue = "false")
	// protected Boolean useTxala;
	public final Boolean useTxala = false;

	/**
	 * Load the ner tags to UIMA type mapping from this location instead of locating
	 * the mapping automatically.
	 */
	public static final String PARAM_LANGUAGE_AUTODETECT = "autodetect";
	@ConfigurationParameter(name = PARAM_LANGUAGE_AUTODETECT, mandatory = false, defaultValue = "false")
	// protected Boolean autodetect;
	public final Boolean autodetect = false;

	// Freeling elements some of should be parameters...
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

	@Override
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);

		System.loadLibrary("Jfreeling");
		Util.initLocale("default");
		getLogger().info("Freeling, autodetect mode: " + autodetect);

		if (!this.autodetect) {
			try {
				init(language);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ResourceInitializationException();
			}
		} else {
			lgid = new LangIdent(DATA + "common/lang_ident/ident.dat"); // ident-few for less languages!
		}

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
		if (doDependency) {
			if ((!useTxala) && (TreelerLangs.contains(lang))) {
				getLogger().info("Freeling initating Treeler parser for " + lang);
				deps.put(lang, new DepTreeler(prop.getProperty("DepTreelerFile").replace("$FREELINGSHARE/", DATA)));
			} else if (TxalaLangs.contains(lang)) {

				getLogger().info("Freeling initating Txala parser for " + lang);
				parsers.put(lang, new ChartParser(prop.getProperty("GrammarFile").replace("$FREELINGSHARE/", DATA)));
				depTs.put(lang, new DepTxala(prop.getProperty("DepTxalaFile").replace("$FREELINGSHARE/", DATA),
						parsers.get(lang).getStartSymbol()));
			}
		}
		// UIMA mapping providers

		posMappingProvider = MappingProviderFactory.createPosMappingProvider(POSMappingLocation, "eagle", lang);
		depMappingProvider = MappingProviderFactory.createDependencyMappingProvider(DependencyMappingLocation,
				"freeling", lang);

	}

	@Override
	public void process(JCas cas) throws AnalysisEngineProcessException {
		String text = cas.getDocumentText();
		if (autodetect) {
			// language=cas.getDocumentLanguage();
			if (language == null || language.equalsIgnoreCase("x-unspecified")) {
				// take the first 800 characters (200 words) Find what could be an end of
				// sentence

				// language = lgid.identifyLanguage(subStringForDetion(text));
				if (language.equals("none")) {
					getLogger().error("Freeling, error in language detection, skip document");
					return;
				}
				getLogger().info("Freeleing, the language detected for document is: " + language);
				cas.setDocumentLanguage(language);

				cas.setDocumentLanguage(language);
			}
			try {
				init(language);
			} catch (Exception e) {
				getLogger().error("Freeling, error initializing language, skip document");
				return;
			}
		}
		process(cas, text.substring(0, text.length()), 0);
	}

	private String subStringForDetion(String text) {
		if (text.length() < 1000) {
			// getLogger().info(" full text");
			return text;
		}
		// find the first end of sentence after the position 800
		// we look for a word in lower case followed by a dot.
		Pattern pattern = Pattern.compile("[a-z]+\\.");
		Matcher match = pattern.matcher(text.substring(800));
		if (match.find()) {
			// getLogger().info(" found at pos" + match.end() + "text : " +
			// text.substring(0, 800+match.end()-1));
			return text.substring(0, 800 + match.end() - 1);
		}
		// not lucky
		// getLogger().info(" no match");
		return text;
	}

	@Override
	protected void process(JCas cas, String line, int SentStart) throws AnalysisEngineProcessException {
		try {
			init(language);
		} catch (Exception e) {
			e.printStackTrace();
		}

		getLogger().info(" start processing from " + SentStart + " size " + line.length());

		String[] LineList = line.split("\n");
		for (String text : LineList) {
			ListWord l = tks.get(language).tokenize(text);
			// Split the tokens into distinct sentences.
			// getLogger().info(" sentence split" );
			ls = sps.get(language).split(sids.get(language), l, true);
			// Perform morphological analysis
			// getLogger().info(" morpho" );
			mfs.get(language).analyze(ls);
			// Perform part-of-speech tagging.
			// getLogger().info(" POS" );
			tgs.get(language).analyze(ls);
			// Dependency parser
			// getLogger().info(" dependency" );
			boolean doDeps = doDependency;
			if (doDependency) {
				if (depTs.get(language) != null) {
					parsers.get(language).analyze(ls);
					depTs.get(language).analyze(ls);
				} else if (deps.get(language) != null) {
					deps.get(language).analyze(ls);
				} else
					doDeps = false;
			}
			aJCas = cas;
			// getLogger().info(" export to UIMA" );
			exportToUIMA(ls, SentStart, doDeps);
			SentStart += text.length() + 1;
		}
	}

	public void init_dict() {
		try {
			init_token(language);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void init_token(String lang) throws Exception {
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

	public List<String> tokenizer(String line) {
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
		List<String> listStr = new ArrayList<String>();
		int begin;
		int end = 0;
		while (sIt.hasNext()) {
			edu.upc.Jfreeling.Sentence s = sIt.next();
			ListWordIterator wIt = new ListWordIterator(s);
			// iterate over tokens

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
		}

		// sb.setLength(Math.max(0, sb.length() - 2));

		return listStr;

	}

	private void exportToUIMA(ListSentence ls, int start, Boolean doDeps) {

		CAS cas = aJCas.getCas();
		try {
			posMappingProvider.configure(cas);
			depMappingProvider.configure(cas);
		} catch (AnalysisEngineProcessException e1) {
			getLogger().error("error on configuring map providers for that language, skip document");
			return;
		}
		int begin;
		int end = 0;
		// Process every sentence.
		ListSentenceIterator sIt = new ListSentenceIterator(ls);
		int tokennumber = 0;
		while (sIt.hasNext()) {
			edu.upc.Jfreeling.Sentence s = sIt.next();
			// add sentence
			int sBegin = 0;
			Boolean first = true;
			WordToken[] tokens = new WordToken[(int) s.size()];
			int i = 0;

			ListWordIterator wIt = new ListWordIterator(s);
			// iterate over tokens
			while (wIt.hasNext()) {
				Word w = wIt.next();
				begin = (int) w.getSpanStart();
				if (first) {
					first = false;
					sBegin = begin;
				}
				end = (int) w.getSpanFinish();
				// create token
				// Token token = this.createToken(aJCas, start + begin, start + end);
				// Token token = new Token(aJCas, start + begin, start + end);
				WordToken token = new WordToken(aJCas, start + begin, start + end);

				token.addToIndexes();
				try {
					// create form
//                TokenForm f = new TokenForm(aJCas, start + begin, start + end);
//                f.setValue(w.getForm());
//                token.setForm(f);
					// create POS
					// getLogger().info(" processing token from: " + (start + begin) +" to:" +(start
					// + end)+ " token:" + w.getForm() + " with POS tag: " + w.getTag() );
					Type defposTagT = posMappingProvider.getTagType("*");
					Type posTagT = posMappingProvider.getTagType(w.getTag());
//                    int l=w.getTag().length()+1;
//                    while(posTagT==defposTagT && --l>0){
//                     posTagT = posMappingProvider.getTagType(w.getTag().substring(0, l)+"*");
//                    }
//                    POS posTag = (POS) cas.createAnnotation(posTagT, start + begin, start + end);
//                    posTag.setPosValue(posTag.getPosValue());
//                    posTag.setCoarseValue(w.getTag());
//                    posTag.addToIndexes();
					// token.setPos(posTag);
					token.setPartOfSpeech(w.getTag());

					// create lema
//                  Lemma lemma = new Lemma(aJCas, start + begin, start + end);
//                  lemma.setValue(w.getLemma());
//                  lemma.addToIndexes();
//                  token.setLemma(lemma);
					token.setNormalizedForm(w.getForm());

					Map<String, Set<String>> lemmaMap = null;
					Collection<Lemma> lemmas = new ArrayList<>(1);

					Lemma lemmaa = new Lemma(aJCas);
					lemmaa.setKey(w.getLemma());
					lemmaa.setPosTag(w.getTag());
					lemmas.add(lemmaa);

					Lemma[] lemmaArray = (Lemma[]) lemmas.toArray(new Lemma[lemmas.size()]);
					FSList fsList = ListFactory.buildList(aJCas, lemmaArray);
					token.setLemmaEntries(fsList);

				} catch (Exception e) {

					getLogger().error("error processing token from: " + (start + begin) + " to:" + (start + end)
							+ "  token:" + w.getForm() + " with POS tag: " + w.getTag() + "  " + e.getMessage());
					e.printStackTrace();
					if (token == null)
						getLogger().error("error token null");
				}
				token.setTokenNumber(tokennumber);
				tokennumber++;
				tokens[i++] = token;
			} // end for tokens
			
				// Add dependencies.
			if (doDeps) {
				DepTree dtree = s.getDepTree(s.getBestSeq());
				for (int n = 0; n < s.size(); n++) {
					TreePreorderIteratorDepnode node = dtree.getNodeByPos((long) n);
					if (node.isRoot() || node.getParent().getLabel().equals("VIRTUAL_ROOT")) {
						WordToken rootToken = tokens[n];
						Dependency dep = new Dependency(aJCas);
						dep.setGovernor(rootToken);
						dep.setDependent(rootToken);
						dep.setDependencyType("ROOT");
						dep.setFlavor(DependencyFlavor.BASIC);
						dep.setBegin(dep.getDependent().getBegin());
						dep.setEnd(dep.getDependent().getEnd());
						dep.addToIndexes();
					} else {
						WordToken sourceToken = tokens[(int) node.getParent().getWord().getPosition()];
						WordToken targetToken = tokens[n];
						Type depRel = depMappingProvider.getTagType(node.getLabel());
						// Dependency dep = (Dependency) cas.createFS(depRel);
						Dependency dep = new Dependency(aJCas);
						dep.setGovernor(sourceToken);
						dep.setDependent(targetToken);
						dep.setDependencyType(node.getLabel());
						dep.setFlavor(DependencyFlavor.BASIC);
						dep.setBegin(dep.getDependent().getBegin());
						dep.setEnd(dep.getDependent().getEnd());
						dep.addToIndexes();
					}
				}

//                createSentence(aJCas, start + sBegin, start + end);
			}
			
    		int[] span = new int[] { start + sBegin, start + end };
    		trim(aJCas.getDocumentText(), span);
    		if (!isEmpty(span[0], span[1])) {
    			Sentence seg = new Sentence(aJCas, span[0], span[1]);
    			seg.addToIndexes(aJCas);
    			
    		}
		}
		if (dictionary_parser) {
			RemoveAccents ra = new RemoveAccents();
//			String input = "/home/siabar/eclipse-workspace/ctakes/ctakes-examples/org/apache/ctakes/examples/dictionary/lookup/spellchecker_test/dic.txt";
			String input = "/home/siabar/eclipse-workspace/ctakes/ctakes-SpaCTeS-res/src/main/resources/org/apache/ctakes/examples/dictionary/lookup/fuzzy/IctusnetDict.bsv";

			String output_lexicon = "";
			String output_dic = "";
			if (lemmaForm) {
				output_lexicon = "/home/siabar/eclipse-workspace/ctakes/ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker_lemma/lexicon.txt";
				output_dic = "/home/siabar/eclipse-workspace/ctakes/ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker_lemma/dic.txt";
			} else {
				output_lexicon = "/home/siabar/eclipse-workspace/ctakes/ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker/lexicon/lexicon.txt";
				output_dic = "/home/siabar/eclipse-workspace/ctakes/ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker/dic/dic.txt";
			}
//
//		FreeLingWrapper freeling = new FreeLingWrapper();
//		freeling.init_dict();

			try {
				FileReader reader = new FileReader(input);
				BufferedReader bufferedReader = new BufferedReader(reader);

				FileWriter writer_lexicon = new FileWriter(output_lexicon);
				FileWriter writer_dic = new FileWriter(output_dic);

				String line_original = null;
				String line = null;

				Map<String, Integer> lexiconkepper = new HashMap<String, Integer>();
				BufferedWriter bufferedWriter_lexicon = new BufferedWriter(writer_lexicon);

				BufferedWriter bufferedWriter_dic = new BufferedWriter(writer_dic);

				while ((line_original = bufferedReader.readLine()) != null) {
					String temp_line = "";
					String[] templine = line_original.trim().split("\\|");
					
	            	String[] temp_lower = templine[2].trim().split(" ");
	            	for (String temp :temp_lower) {
	            		if (temp.length()>1) {
	            			temp_line +=  temp.toLowerCase() + " " ;
	            		}else {
	            			temp_line +=  temp+ " " ;
	            		}
	            	}

//					if (line_original.length() >3) {
//					line = line_original.trim().toLowerCase();
//					}else {
//						line = line_original.trim();
//					}
	            	line = temp_line.trim();
					List<String> temp = tokenizer(line);
					String tempRC = ra.removeAccents(String.join(" ", temp));
					bufferedWriter_dic.write(tempRC + "\n");
//	            	String[] temp = line.trim().split(" ");
//					for (int i = 0; i < temp.size(); i++) {
//						tempRC = ra.removeAccents(temp.get(i));
//						if (!lexiconkepper.containsKey(tempRC)) {
//							lexiconkepper.put(tempRC, 0);
//						}
//					}
					
					tempRC = ra.removeAccents(temp.get(0));
					if (!lexiconkepper.containsKey(tempRC)) {
						lexiconkepper.put(tempRC, 0);
					}
					
					
				}
//					String temp_line = "";
//	            	String[] temp_lower = line_original.trim().split(" ");
//	            	for (String temp :temp_lower) {
//	            		if (temp.length()>3) {
//	            			temp_line +=  temp.toLowerCase() + " " ;
//	            		}else {
//	            			temp_line +=  temp+ " " ;
//	            		}
//	            	}
//
////					if (line_original.length() >3) {
////					line = line_original.trim().toLowerCase();
////					}else {
////						line = line_original.trim();
////					}
//	            	line = temp_line.trim();
//					List<String> temp = tokenizer(line);
//					String tempRC = ra.removeAccents(String.join(" ", temp));
//
//					bufferedWriter_dic.write(tempRC + "\n");
////	            	String[] temp = line.trim().split(" ");
//					for (int i = 0; i < temp.size(); i++) {
//						tempRC = ra.removeAccents(temp.get(i));
//						if (!lexiconkepper.containsKey(tempRC)) {
//							lexiconkepper.put(tempRC, 0);
//						}
//					}
					
//				}
				for (String st : lexiconkepper.keySet()) {
					bufferedWriter_lexicon.write(st + "\n");
				}
				bufferedReader.close();
				bufferedWriter_lexicon.close();
				bufferedWriter_dic.close();
				System.out.println("Pre-processing Done");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
