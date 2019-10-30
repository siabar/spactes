package org.apache.ctakes.spactes.pipeline;

import org.apache.ctakes.core.config.ConfigParameterConstants;
import org.apache.ctakes.core.ae.SimpleSegmentAnnotator;
import org.apache.ctakes.core.pipeline.PipelineBuilder;
import org.apache.ctakes.freeling.FreeLingWrapper;
import org.apache.ctakes.dictionary.lookup2.ae.DefaultJCasTermAnnotator;

import org.apache.log4j.Logger;
import org.apache.uima.UIMAException;

import de.unihd.dbs.uima.annotator.heideltime.HeidelTime;

import java.io.IOException;
import java.util.Collections;


final public class SpaCTeSBuilderRunner {

	static private final String DICT_DESC_PATH = "org/apache/ctakes/examples/dictionary/lookup/fuzzy/IctusnetDictSpec.xml";

	static private final Logger LOGGER = Logger.getLogger("StaCTeSBuilderRunner");
	
	static String INPUT_DIR = "/home/siabar/30yamak/git/EHR-normalizer/documents/TXT/";
	static String OUTPUT_DIR = "/home/siabar/30yamak/git/EHR-normalizer/documents/XML/" ;

	
	private SpaCTeSBuilderRunner() {
	}

	/**
	 * @param args an output directory for xmi files or none if xmi files are not
	 *             wanted
	 */
	public static void main(final String... args) {
		try {
//			String INPUT_DIR = args[0];
//			String OUTPUT_DIR = args[1];

			PipelineBuilder builder = new PipelineBuilder();
			builder.readFiles(INPUT_DIR)

					// Segment Annotator from cTAKES
					.add(SimpleSegmentAnnotator.class)
           

					// Freeling Wrapper (Tokenzier + POS + Lemma+ Sentence)
					.add(FreeLingWrapper.class, Collections.emptyList(), 
							FreeLingWrapper.PARAM_LANGUAGE, "es",
							FreeLingWrapper.PARAM_DO_DEPENDECY_PARSING, true, 
							FreeLingWrapper.PARAM_USE_RULE_BASED, false, 
							FreeLingWrapper.PARAM_LANGUAGE_AUTODETECT, false,
							FreeLingWrapper.PARAM_LEMMA,ConfigParameterConstants.lemmaForm)


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


					.collectEntities();
			builder.writeXMIs(OUTPUT_DIR)
			// Brat Writter Component
			.writeBrat(OUTPUT_DIR);
			// Brat HTML Component
//			.writeHtml(OUTPUT_DIR);

			// Run the pipeline with specified text
			builder.run();
		} catch (IOException | UIMAException multE) {
			LOGGER.error(multE.getMessage());
		}
	}
}
