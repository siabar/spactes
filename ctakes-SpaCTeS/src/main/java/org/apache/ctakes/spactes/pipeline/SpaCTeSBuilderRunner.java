package org.apache.ctakes.spactes.pipeline;

import org.apache.ctakes.core.ae.SentenceDetector;
import org.apache.ctakes.core.config.ConfigParameterConstants;
import org.apache.ctakes.core.ae.SimpleSegmentAnnotator;
import org.apache.ctakes.core.pipeline.PipelineBuilder;
import org.apache.ctakes.freeling.FreeLingWrapper;
import org.apache.ctakes.spactes.ae.BratWriter;
import org.apache.ctakes.dictionary.lookup2.ae.DefaultJCasTermAnnotator;

import org.apache.log4j.Logger;
import org.apache.uima.UIMAException;

import de.unihd.dbs.uima.annotator.heideltime.HeidelTime;

import java.io.IOException;
import java.util.Collections;

/**
 * Build and run a pipeline using a {@link PipelineBuilder}.
 * <p>
 * Example of a running a pipeline programatically w/o uima xml descriptor xml
 * files Adds the default Tokenization pipeline and adding the Example
 * HelloWorld Annotator
 *
 * @author SPF , chip-nlp
 * @version %I%
 * @since 10/10/2016
 */
final public class SpaCTeSBuilderRunner {

	static private final String DICT_DESC_PATH = "org/apache/ctakes/examples/dictionary/lookup/fast/IctusnetDictSpec.xml";
//   static private final String DICT_DESC_PATH = "org/apache/ctakes/examples/dictionary/lookup/fast/IctusnetDictSpec_test.xml";

	static private final Logger LOGGER = Logger.getLogger("StaCTeSBuilderRunner");
	static private final String INPUT_DIR = "/home/siabar/30yamak/git/EHR-normalizer/documents/TXT";
//	static private final String INPUT_DIR = "/home/siabar/Desktop/cTakes_results/input/readAllFiles/";
//	static private final String OUTPUT_DIR = "/home/siabar/30yamak/git/EHR-normalizer/documents/BRAT-PIPELINE-Montse/" ;
	static private final String OUTPUT_DIR = "/home/siabar/30yamak/git/EHR-normalizer/documents/XML/" ;

	
	private SpaCTeSBuilderRunner() {
	}

	/**
	 * @param args an output directory for xmi files or none if xmi files are not
	 *             wanted
	 */
	public static void main(final String... args) {
		try {
			

//    	 String DOC_TEXT = new String(Files.readAllBytes(Paths.get("/home/siabar/Desktop/cTakes_results/input/dictionary/test_dict_lookup_with_dot.txt"))); 
//     	 String DOC_TEXT = new String(Files.readAllBytes(Paths.get("/home/siabar/Desktop/cTakes_results/input/dictionary/Simple_example.txt"))); 

//			DOC_TEXT += ".";
//			RemoveAccents rc = new RemoveAccents();
			// DOC_TEXT = rc.removeAccents(DOC_TEXT);
//        tokenizer = new StandardTokenizer();
//        
//     	TokenStream stream = new StandardFilter();

			PipelineBuilder builder = new PipelineBuilder();
			builder.readFiles(INPUT_DIR)

					// Segment Annotator from cTAKES
					.add(SimpleSegmentAnnotator.class)
//					.add(SimpleTextSegmenter.class)

					// Sentence Detector from cTAKES
//					.add(SentenceDetector.class)

					// Tokenizer Annotator from cTALES
//               .add( TokenizerAnnotatorPTB.class )

					// Tokenizer Dependent Tokenizer Annotator from cTAKES
//             .add( ContextDependentTokenizerAnnotator.class )

					// TreeTagger Wrapper from HeidelTime - Using Sentense Detector and Tokenizer of
					// cTAKES
//               .add( TreeTaggerWrapper.class,Collections.emptyList(),
//            		   TreeTaggerWrapper.PARAM_LANGUAGE, "spanish", 
//            		   TreeTaggerWrapper.PARAM_ANNOTATE_TOKENS,true, 
//            		   TreeTaggerWrapper.PARAM_ANNOTATE_SENTENCES,false,
//            		   TreeTaggerWrapper.PARAM_ANNOTATE_PARTOFSPEECH,true, 
//            		   TreeTaggerWrapper.PARAM_CHINESE_TOKENIZER_PATH,"")              

					// Freeling Wrapper (Tokenzier + POS + Lemma) - Sentense detector has been
					// deactived (Using Sentence detector of cTAKES)
					.add(FreeLingWrapper.class, Collections.emptyList(), 
							FreeLingWrapper.PARAM_LANGUAGE, "es",
							FreeLingWrapper.PARAM_DO_DEPENDECY_PARSING, true, 
							FreeLingWrapper.PARAM_USE_RULE_BASED, false, 
							FreeLingWrapper.PARAM_LANGUAGE_AUTODETECT, false,
							FreeLingWrapper.PARAM_LEMMA,ConfigParameterConstants.lemmaForm)
//							FreeLingWrapper.PARAM_LEMMA,false)


					// Temporal Tagging from HeidelTime
					.add(HeidelTime.class, Collections.emptyList(), 
							HeidelTime.PARAM_DEBUG, false,
							HeidelTime.PARAM_TEMPONYMS, false, 
							HeidelTime.PARAM_LOCALE, "", 
							HeidelTime.PARAM_DATE, true,
							HeidelTime.PARAM_DURATION, true, 
							HeidelTime.PARAM_SET, false, 
							HeidelTime.PARAM_TIME, true,
							HeidelTime.PARAM_GROUP, false, 
							HeidelTime.PARAM_TYPE_TO_PROCESS, "narratives",
							HeidelTime.PARAM_LANGUAGE, "spanish")

					// Fast Dictionary LookUp
					.addDescription(DefaultJCasTermAnnotator.createAnnotatorDescription(DICT_DESC_PATH, ConfigParameterConstants.lemmaForm))
//					.addDescription(DefaultJCasTermAnnotator.createAnnotatorDescription(DICT_DESC_PATH, false))


					// Brat Writter Component
					.add(BratWriter.class, Collections.emptyList(), 
							BratWriter.PARAM_SAVE_BRAT,OUTPUT_DIR)
					.collectEntities();
			builder.writeXMIs(OUTPUT_DIR).writeHtml(OUTPUT_DIR);;
//			if (args.length > 0) {
//				// Example to save the Aggregate descriptor to an xml file for external use such
//				// as the UIMA CVD
//				builder.writeXMIs(OUTPUT_DIR);
////				.writeHtml(args[0]);
//
//			}
			System.out.println("Done.");

			// Run the pipeline with specified text
			builder.run();
		} catch (IOException | UIMAException multE) {
			LOGGER.error(multE.getMessage());
		}
	}
}
