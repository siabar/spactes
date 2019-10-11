/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ctakes.spactes.ae;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ctakes.core.cc.pretty.html.BratTextWriter;
import org.apache.ctakes.core.cc.pretty.html.HtmlTextWriter;
import org.apache.ctakes.core.util.DocumentIDAnnotationUtil;
import org.apache.ctakes.core.util.textspan.TextSpan;
import org.apache.ctakes.typesystem.type.heideltime.Timex3;
import org.apache.ctakes.typesystem.type.relation.BinaryTextRelation;
import org.apache.ctakes.typesystem.type.relation.CollectionTextRelation;
import org.apache.ctakes.typesystem.type.structured.DocumentPath;
import org.apache.ctakes.typesystem.type.syntax.BaseToken;
import org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation;
import org.apache.ctakes.typesystem.type.textsem.Markable;
import org.apache.ctakes.typesystem.type.textspan.ListEntry;
import org.apache.ctakes.typesystem.type.textspan.Paragraph;
import org.apache.ctakes.typesystem.type.textspan.Segment;
import org.apache.ctakes.typesystem.type.textspan.Sentence;
import org.apache.log4j.Logger;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.util.JCasUtil;

public class BratWriter extends JCasAnnotator_ImplBase {

	public static final String PARAM_SAVE_BRAT = "PARAM_SAVE_BRAT";
	private Logger LOG = Logger.getLogger(getClass().getName());
	public static int identifiedIndex = 1;
	public static int timeIndex = 1;
	public static int wordIndex = 1;


	@ConfigurationParameter(name = PARAM_SAVE_BRAT, mandatory = true, description = "Directory for saving Brat")
	protected String saving;
	static private final Logger LOGGER = Logger.getLogger("BratWriter");

	protected String getSourceFilePath(final JCas jCas) {
		final Collection<DocumentPath> documentPaths = JCasUtil.select(jCas, DocumentPath.class);
		if (documentPaths == null || documentPaths.isEmpty()) {
			return "";
		}
		for (DocumentPath documentPath : documentPaths) {
			final String path = documentPath.getDocumentPath();
			if (path != null && !path.isEmpty()) {
				return path;
			}
		}
		return "";
	}

	protected String getSourceFileName(final JCas jcas, final String documentId) {
		final String path = getSourceFilePath(jcas);
		if (path != null && !path.isEmpty()) {
			return new File(path).getName();
		}
		return documentId;
	}

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// Create a dummy IdentifiedAnnotation in the type system
		// If the BaseToken Part Of Speech is a Noun
		wordIndex = 1;
		LOGGER.info("Writing BRAT to " + saving + " ...");
		final String documentId = DocumentIDAnnotationUtil.getDocumentIdForFile(jCas);
		String fileName = getSourceFileName(jCas, documentId);
		if (fileName.endsWith(".txt"))
			fileName = fileName.substring(0, fileName.length() - 4);

		final File bratFile = new File(saving, fileName + ".ann");

		try (final BufferedWriter writer = new BufferedWriter(new FileWriter(bratFile))) {
			final Collection<Segment> sections = JCasUtil.select(jCas, Segment.class);
			final Map<Segment, Collection<Sentence>> sectionSentences = JCasUtil.indexCovered(jCas, Segment.class,
					Sentence.class);
			final Map<Sentence, Collection<IdentifiedAnnotation>> sentenceAnnotations = JCasUtil.indexCovered(jCas,
					Sentence.class, IdentifiedAnnotation.class);
			final Map<Sentence, Collection<Timex3>> sentenceAnnotationsTime = JCasUtil.indexCovered(jCas,
					Sentence.class, Timex3.class);
			final Map<Sentence, Collection<BaseToken>> sentenceTokens = JCasUtil.indexCovered(jCas, Sentence.class,
					BaseToken.class);

			for (Segment section : sections) {
//			writer.write(section.getId());
				final List<Sentence> sentences = new ArrayList<>(sectionSentences.get(section));
				sentences.sort(Comparator.comparingInt(Sentence::getBegin));
				for (Sentence sentence : sentences) {
					final Collection<IdentifiedAnnotation> annotations = sentenceAnnotations.get(sentence);
					final Collection<Timex3> annotationsTime = sentenceAnnotationsTime.get(sentence);

					final Collection<BaseToken> tokens = sentenceTokens.get(sentence);
					writeSentence(sentence, annotations, annotationsTime, tokens, writer);

				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info("Finished Writing " + fileName + ".ann");

	}

	static private void writeSentence(final Sentence sentence, final Collection<IdentifiedAnnotation> annotations,
			final Collection<Timex3> annotationsTime, final Collection<BaseToken> baseTokens,
			final BufferedWriter writer) throws IOException {
		if (baseTokens.isEmpty()) {
			return;
		}
		// Because of character substitutions, baseTokens and IdentifiedAnnotations have
		// to be tied by text span
		final Map<TextSpan, String> baseTokenMap = BratTextWriter.createBaseTokenMap(sentence, baseTokens);
		if (baseTokenMap.isEmpty()) {
			return;
		}
		final Map<TextSpan, Collection<IdentifiedAnnotation>> annotationMap = BratTextWriter
				.createAnnotationMap(sentence, annotations);
		final Map<IdentifiedAnnotation, IdentifiedAnnotation> annotationEvents = BratTextWriter
				.getAnnotationEvents(annotationMap);

		final Map<TextSpan, Collection<Timex3>> annotationMapTime = BratTextWriter.createAnnotationMapTime(sentence,
				annotationsTime);
		final Map<Timex3, Timex3> annotationEventsTime = new HashMap<>();

		final Collection<BinaryTextRelation> relations = null;
		final Map<TextSpan, Collection<Integer>> corefSpans = null;

		Map<Integer, String> tag = new HashMap<Integer, String>();
		if (!annotationMapTime.isEmpty() && !annotationMap.isEmpty()) {
			tag = BratTextWriter.createTags(sentence, annotationMap, annotationEvents, relations, corefSpans);
			tag.putAll(BratTextWriter.createTagsTime(sentence, annotationMapTime, annotationEventsTime));

		} else if (!annotationMap.isEmpty()) {
			tag = BratTextWriter.createTags(sentence, annotationMap, annotationEvents, relations, corefSpans);
		} else if (!annotationMapTime.isEmpty()) {
			tag = BratTextWriter.createTagsTime(sentence, annotationMapTime, annotationEventsTime);
		}

		final Map<Integer, String> tags = tag;

		String tempWord = "";

		Boolean isBegin = true;
		for (Map.Entry<TextSpan, String> entry : baseTokenMap.entrySet()) {
			try {
				String TempText = entry.getValue();
				final int begin = entry.getKey().getBegin();
				final int end = entry.getKey().getEnd();
				String temSB = "";
				temSB = "";
				String text = "";
				String pos = "";
				String[] ListText = TempText.split("SIAMAK");
				if (ListText.length > 1) {
					text = ListText[0];
					pos = ListText[1];
				} else
					text = ListText[0];

				int temBegin = begin;
				for (String temChar : text.split("")) {
					if (isBegin) {
						final String beginTag = tags.get(temBegin);
						if (beginTag != null && !beginTag.equalsIgnoreCase("")) {
//							sb.append(temSB);
							if (!temSB.equalsIgnoreCase("")) {
//							tempWord = "T%d" + "\t" + "word" + " " + begin + " " + end + "\t";
//							writer.write(String.format(tempWord, wordIndex) + temSB + "\n");
//							wordIndex++;

							}
							temSB = "";
//						if (beginTag.startsWith("T")) {
//							writer.write(String.format(beginTag, wordIndex));
//							wordIndex++;
//						}else {
//							writer.write(String.format("T%d" + beginTag, wordIndex));
//							wordIndex++;

							String[] tempList_hash = beginTag.split("#note");
							if (tempList_hash.length > 1) {

								for (String temp : tempList_hash) {
									temp = temp.replace("&apos;", "'");
									temp = temp.replace("&quot;", "\"");
									temp = temp.replace("&amp;", "@");
									temp = temp.replace("&lt;", "<");
									temp = temp.replace("&gt;", ">");
									writer.write(String.format(temp.trim(), wordIndex) + "\n");

								}
								wordIndex++;
							} else {
								String[] tempList = beginTag.split("\n");
								for (String temp : tempList) {
									temp = temp.replace("&apos;", "'");
									temp = temp.replace("&quot;", "\"");
									temp = temp.replace("&amp;", "@");
									temp = temp.replace("&lt;", "<");
									temp = temp.replace("&gt;", ">");
									writer.write(String.format(temp, wordIndex) + "\n");
									wordIndex++;

								}
							}
							// writer.write(beginTag);
							isBegin = false;

						}

					}
					temSB += temChar;
					temBegin += 1;
					if (!isBegin) {
						final String endTag = tags.get(temBegin);
						if (endTag != null && endTag.equalsIgnoreCase("")) {
//							sb.append(temSB);
//						writer.write(temSB + "\t" + "token" + " " + begin + " " + end + "" + "\n");
							temSB = "";
//							sb.append(endTag);
							isBegin = true;
							temBegin += 1;
						}
					}

				}
//			sb.append(temSB);
				if (!temSB.equalsIgnoreCase("") && isBegin) {
					try {
						tempWord = "T%d" + "\t" + "word" + " " + begin + " " + end + "\t";
//				writer.write(String.format(tempWord, wordIndex) + temSB + "\n");
//				wordIndex++;
					} catch (Exception e) {
						System.out.println(wordIndex + " " + tempWord);
					}
				}
			} catch (Exception e) {
				System.out.println(wordIndex + " " + tempWord);
			}
		}

	}

	@Override
	public void initialize(UimaContext context) throws ResourceInitializationException {
		super.initialize(context);
	}

	public static AnalysisEngineDescription createAnnotatorDescription(boolean saveAnn, boolean printAnn)
			throws ResourceInitializationException {
		return AnalysisEngineFactory.createEngineDescription(BratWriter.class, BratWriter.PARAM_SAVE_BRAT, saveAnn);
	}

	public static AnalysisEngineDescription createAnnotatorDescription() throws ResourceInitializationException {
		return AnalysisEngineFactory.createEngineDescription(BratWriter.class, BratWriter.PARAM_SAVE_BRAT, true);
	}
}
