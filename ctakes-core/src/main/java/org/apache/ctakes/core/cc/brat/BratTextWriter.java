package org.apache.ctakes.core.cc.brat;

import org.apache.ctakes.core.cc.AbstractJCasFileWriter;
import org.apache.ctakes.core.cc.pretty.SemanticGroup;
import org.apache.ctakes.core.pipeline.PipeBitInfo;
import org.apache.ctakes.core.util.DocumentIDAnnotationUtil;
import org.apache.ctakes.core.util.OntologyConceptUtil;
import org.apache.ctakes.core.util.textspan.DefaultTextSpan;
import org.apache.ctakes.core.util.textspan.OriginalTextSpan;
import org.apache.ctakes.core.util.textspan.TextSpan;
import org.apache.ctakes.typesystem.type.heideltime.Timex3;
import org.apache.ctakes.typesystem.type.refsem.Event;
import org.apache.ctakes.typesystem.type.refsem.EventProperties;
import org.apache.ctakes.typesystem.type.refsem.UmlsConcept;
import org.apache.ctakes.typesystem.type.relation.BinaryTextRelation;
import org.apache.ctakes.typesystem.type.syntax.BaseToken;
import org.apache.ctakes.typesystem.type.textsem.*;
import org.apache.ctakes.typesystem.type.textspan.Segment;
import org.apache.ctakes.typesystem.type.textspan.Sentence;
import org.apache.log4j.Logger;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import static org.apache.ctakes.core.pipeline.PipeBitInfo.TypeProduct.*;

/**
 * @author SPF , chip-nlp
 * @version %I%
 * @since 9/8/2016
 */
@PipeBitInfo(name = "BRAT Writer", description = "Writes BRAT files with document text and simple markups.", role = PipeBitInfo.Role.WRITER, dependencies = {
		DOCUMENT_ID, SENTENCE,
		BASE_TOKEN }, usables = { DOCUMENT_ID_PREFIX, IDENTIFIED_ANNOTATION, EVENT, TIMEX, TEMPORAL_RELATION })
final public class BratTextWriter extends AbstractJCasFileWriter {

	// TODO https://www.w3schools.com/howto/howto_css_switch.asp
	// TODO https://www.w3schools.com/html/tryit.asp?filename=tryhtml_layout_flexbox
	// TODO https://www.w3schools.com/html/html5_new_elements.asp

// TODO https://css-tricks.com/snippets/css/a-guide-to-flexbox/
// TODO https://www.quackit.com/css/flexbox/tutorial/nested_flex_containers.cfm

	static final String TOOL_TIP = "TIP";

	static final String UNCERTAIN_NEGATED = "UNN_";
	static final String NEGATED = "NEG_";
	static final String UNCERTAIN = "UNC_";
	static final String AFFIRMED = "AFF_";
	static final String GENERIC = "GNR_";
	static final String SPACER = "SPC_";
	static final String NEWLINE = "NL_";
	static final String WIKI_BEGIN = "WIK_";
	static final String WIKI_CENTER = "_WK_";
	static final String WIKI_END = "_WIK";

	
	public static int identifiedIndex = 1;
	public static int timeIndex = 1;
	public static int wordIndex = 1;
	

	/**
	 * {@inheritDoc}
	 */

	static private final Logger LOGGER = Logger.getLogger("BratWriter");


	// The assumption is that any given span can only have one exact EventMention.
	static private IdentifiedAnnotation getEvent(final Collection<IdentifiedAnnotation> annotations) {
		return annotations.stream().filter(a -> EventMention.class.equals(a.getClass())).findAny().orElse(null);
	}

	static public Map<IdentifiedAnnotation, IdentifiedAnnotation> getAnnotationEvents(
			final Map<TextSpan, Collection<IdentifiedAnnotation>> annotationMap) {
		final Map<IdentifiedAnnotation, IdentifiedAnnotation> annotationEvents = new HashMap<>();
		final Map<TextSpan, IdentifiedAnnotation> unusedEvents = new HashMap<>();
		for (Map.Entry<TextSpan, Collection<IdentifiedAnnotation>> entry : annotationMap.entrySet()) {
			final Collection<IdentifiedAnnotation> annotations = entry.getValue();
			final IdentifiedAnnotation event = getEvent(annotations);
			if (event != null) {
				if (annotations.size() > 1) {
					final int pre = annotationEvents.size();
					annotations.stream().filter(EventMention.class::isInstance).filter(a -> !event.equals(a))
							.forEach(a -> annotationEvents.put(a, event));
					if (annotationEvents.size() > pre) {
						annotations.remove(event);
					} else {
						unusedEvents.put(entry.getKey(), event);
					}
				} else {
					unusedEvents.put(entry.getKey(), event);
				}
			}
		}
		if (unusedEvents.isEmpty()) {
			return annotationEvents;
		}
		final Map<TextSpan, IdentifiedAnnotation> usedEvents = new HashMap<>();
		for (Map.Entry<TextSpan, Collection<IdentifiedAnnotation>> entry : annotationMap.entrySet()) {
			final TextSpan span = entry.getKey();
			TextSpan usedEventSpan = null;
			for (Map.Entry<TextSpan, IdentifiedAnnotation> unusedEvent : unusedEvents.entrySet()) {
				if (!span.equals(unusedEvent.getKey()) && span.contains(unusedEvent.getKey())) {
					entry.getValue().stream().filter(EventMention.class::isInstance)
							.forEach(a -> annotationEvents.put(a, unusedEvent.getValue()));
					usedEventSpan = unusedEvent.getKey();
					usedEvents.put(usedEventSpan, unusedEvent.getValue());
					break;
				}
			}
			if (usedEventSpan != null) {
				unusedEvents.remove(usedEventSpan);
				if (unusedEvents.isEmpty()) {
					break;
				}
			}
		}
		usedEvents.forEach((s, e) -> annotationMap.get(s).remove(e));
		final Collection<TextSpan> emptySpans = annotationMap.entrySet().stream().filter(e -> e.getValue().isEmpty())
				.map(Map.Entry::getKey).collect(Collectors.toList());
		annotationMap.keySet().removeAll(emptySpans);
		return annotationEvents;
	}



	public static Map<TextSpan, String> createBaseTokenMap(final Sentence sentence,
			final Collection<BaseToken> baseTokens) {
		final int sentenceBegin = sentence.getBegin();
		final Map<TextSpan, String> baseItemMap = new LinkedHashMap<>();
		for (BaseToken baseToken : baseTokens) {
			final TextSpan textSpan = new OriginalTextSpan(baseToken, sentenceBegin);
			if (textSpan.getWidth() == 0) {
				continue;
			}
//			String text = getSafeText(baseToken);
			String text = baseToken.getCoveredText();
			text += "#POS" + baseToken.getPartOfSpeech();
			if (text.isEmpty()) {
				continue;
			}
			baseItemMap.put(textSpan, text);
		}
		return baseItemMap;
	}

	static private String getSafeText(final Annotation annotation) {
		if (annotation == null) {
			return "";
		}
		return getSafeText(annotation.getCoveredText().trim());
	}

	static private String getSafeText(final String text) {
		if (text.isEmpty()) {
			return "";
		}
		String safeText = text.replaceAll("'", "&apos;");
		safeText = safeText.replaceAll("\"", "&quot;");
		safeText = safeText.replaceAll("@", "&amp;");
		safeText = safeText.replaceAll("<", "&lt;");
		safeText = safeText.replaceAll(">", "&gt;");
		return safeText;
	}

	/**
	 * @param sentence    -
	 * @param annotations annotations within the sentence
	 * @return map of text spans and all annotations within those spans. Accounts
	 *         for overlap, etc.
	 */
	static public Map<TextSpan, Collection<IdentifiedAnnotation>> createAnnotationMap(final Sentence sentence,
			final Collection<IdentifiedAnnotation> annotations) {
		final Map<TextSpan, Collection<IdentifiedAnnotation>> annotationMap = new HashMap<>();
		final int sentenceBegin = sentence.getBegin();
		for (IdentifiedAnnotation annotation : annotations) {
			final TextSpan textSpan = new OriginalTextSpan(annotation, sentenceBegin);
			if (textSpan.getWidth() == 0) {
				continue;
			}
			final Collection<String> semanticNames = SemanticGroup.getSemanticNames(annotation);
			if (!semanticNames.isEmpty()) {
				annotationMap.putIfAbsent(textSpan, new ArrayList<>());
				annotationMap.get(textSpan).add(annotation);
			}
		}
		return annotationMap;
	}

	static public Map<TextSpan, Collection<Timex3>> createAnnotationMapTime(final Sentence sentence,
			final Collection<Timex3> annotations) {
		final Map<TextSpan, Collection<Timex3>> annotationMap = new HashMap<>();
		final int sentenceBegin = sentence.getBegin();
		for (Timex3 annotation : annotations) {
			final TextSpan textSpan = new OriginalTextSpan(annotation, sentenceBegin);
			if (textSpan.getWidth() == 0) {
				continue;
			}
			final Collection<String> semanticNames = new ArrayList<String>(Arrays.asList("Time"));
			if (!semanticNames.isEmpty()) {
				annotationMap.putIfAbsent(textSpan, new ArrayList<>());
				annotationMap.get(textSpan).add(annotation);
			}
		}
		return annotationMap;
	}

	/**
	 * sorts by begins, then by ends if begins are equal
	 */
	static private class TextSpanComparator implements Comparator<TextSpan> {
		public int compare(final TextSpan t1, final TextSpan t2) {
			int r = t1.getBegin() - t2.getBegin();
			if (r != 0) {
				return r;
			}
			return t1.getEnd() - t2.getEnd();
		}
	}

	static private final Comparator<TextSpan> TEXT_SPAN_COMPARATOR = new TextSpanComparator();

	/**
	 * Creates map of text span indices and whether each span represents the
	 * beginning of one or more annotations, the inside of two or more overlapping
	 * annotations, or the end of two or more overlapping annotations
	 *
	 * @param textSpans -
	 * @return B I E map
	 */
	static private Map<Integer, Character> createIndexMap(final Collection<TextSpan> textSpans) {
		if (textSpans.isEmpty()) {
			return Collections.emptyMap();
		}
		final List<TextSpan> spanList = new ArrayList<>(textSpans);
		spanList.sort(TEXT_SPAN_COMPARATOR);
		final int spanCount = spanList.size();
		final int spanCountMinus = spanCount - 1;
		final Map<Integer, Character> indexMap = new HashMap<>();
		for (int i = 0; i < spanCountMinus; i++) {
			final TextSpan textSpan = spanList.get(i);
			final int begin = textSpan.getBegin();
			indexMap.putIfAbsent(begin, 'B');
			final int end = textSpan.getEnd();
			indexMap.putIfAbsent(end, 'E');
			for (int j = i + 1; j < spanCount; j++) {
				TextSpan nextSpan = spanList.get(j);
				if (nextSpan.getBegin() > end) {
					break;
				}
				if (nextSpan.getBegin() > begin) {
					indexMap.put(nextSpan.getBegin(), 'I');
				}
				if (nextSpan.getEnd() < end) {
					indexMap.put(nextSpan.getEnd(), 'I');
				} else if (nextSpan.getEnd() > end) {
					indexMap.put(end, 'I');
				}
			}
		}
		final TextSpan lastSpan = spanList.get(spanCountMinus);
		indexMap.putIfAbsent(lastSpan.getBegin(), 'B');
		indexMap.putIfAbsent(lastSpan.getEnd(), 'E');
		return indexMap;
	}

	/**
	 * @param indexMap map of text span indices and the B I E status of the spans
	 * @return new spans representing the smallest required unique span elements of
	 *         overlapping spans
	 */
	static private Collection<TextSpan> createAdjustedSpans(final Map<Integer, Character> indexMap) {
		if (indexMap.isEmpty()) {
			return Collections.emptyList();
		}
		final List<Integer> indexList = new ArrayList<>(indexMap.keySet());
		Collections.sort(indexList);
		final int indexCount = indexList.size();
		final Collection<TextSpan> newSpans = new ArrayList<>();
		Integer index1 = indexList.get(0);
		Character c1 = indexMap.get(index1);
		for (int i = 1; i < indexCount; i++) {
			final Integer index2 = indexList.get(i);
			final Character c2 = indexMap.get(index2);
			if (c1.equals('B') || c1.equals('I')) {
				newSpans.add(new DefaultTextSpan(index1, index2));
			}
			index1 = index2;
			c1 = c2;
		}
		return newSpans;
	}

	/**
	 * @param adjustedList  spans representing the smallest required unique span
	 *                      elements of overlapping spans
	 * @param annotationMap map of larger overlapping text spans and their
	 *                      annotations
	 * @return map of all annotations within or overlapping the small span elements
	 */
	static private Map<TextSpan, Collection<IdentifiedAnnotation>> createAdjustedAnnotations(
			final List<TextSpan> adjustedList, final Map<TextSpan, Collection<IdentifiedAnnotation>> annotationMap) {
		final List<TextSpan> spanList = new ArrayList<>(annotationMap.keySet());
		spanList.sort(TEXT_SPAN_COMPARATOR);
		final Map<TextSpan, Collection<IdentifiedAnnotation>> spanAnnotations = new HashMap<>(adjustedList.size());
		final int spanCount = spanList.size();
		int previousMatchIndex = 0;
		for (TextSpan adjusted : adjustedList) {
			boolean matched = false;
			for (int i = previousMatchIndex; i < spanCount; i++) {
				final TextSpan annotationsSpan = spanList.get(i);
				if (annotationsSpan.overlaps(adjusted)) {
					if (!matched) {
						previousMatchIndex = i;
						matched = true;
					}
					spanAnnotations.putIfAbsent(adjusted, new HashSet<>());
					spanAnnotations.get(adjusted).addAll(annotationMap.get(annotationsSpan));
				}
			}
		}
		return spanAnnotations;
	}

	static private Map<TextSpan, Collection<Timex3>> createAdjustedAnnotationsTime(final List<TextSpan> adjustedList,
			final Map<TextSpan, Collection<Timex3>> annotationMap) {
		final List<TextSpan> spanList = new ArrayList<>(annotationMap.keySet());
		spanList.sort(TEXT_SPAN_COMPARATOR);
		final Map<TextSpan, Collection<Timex3>> spanAnnotations = new HashMap<>(adjustedList.size());
		final int spanCount = spanList.size();
		int previousMatchIndex = 0;
		for (TextSpan adjusted : adjustedList) {
			boolean matched = false;
			for (int i = previousMatchIndex; i < spanCount; i++) {
				final TextSpan annotationsSpan = spanList.get(i);
				if (annotationsSpan.overlaps(adjusted)) {
					if (!matched) {
						previousMatchIndex = i;
						matched = true;
					}
					spanAnnotations.putIfAbsent(adjusted, new HashSet<>());
					spanAnnotations.get(adjusted).addAll(annotationMap.get(annotationsSpan));
				}
			}
		}
		return spanAnnotations;
	}

	static public Map<Integer, String> createTags(final Sentence sentence,
			final Map<TextSpan, Collection<IdentifiedAnnotation>> annotationMap,
			final Map<IdentifiedAnnotation, IdentifiedAnnotation> annotationEvents,
			final Collection<BinaryTextRelation> relations, final Map<TextSpan, Collection<Integer>> corefSpans) {
		if (annotationMap.isEmpty()) {
			return Collections.emptyMap();
		}
		final Collection<TextSpan> spans = new HashSet<>(annotationMap.keySet());
		// TODO move coref adjustment uphill
		
		final Map<Integer, Character> indexMap = createIndexMap(spans);
		final Collection<TextSpan> adjustedSpans = createAdjustedSpans(indexMap);
		final List<TextSpan> adjustedList = new ArrayList<>(adjustedSpans);
		adjustedList.sort(TEXT_SPAN_COMPARATOR);
		
		final Map<TextSpan, Collection<IdentifiedAnnotation>> adjustedAnnotations = createAdjustedAnnotations(
				adjustedList, annotationMap);

		final Map<Integer, String> indexTags = new HashMap<>();
		for (TextSpan adjustedSpan : adjustedList) {
			final StringBuilder sb = new StringBuilder();
			final Collection<IdentifiedAnnotation> annotations = adjustedAnnotations.get(adjustedSpan);
			final String clickInfo = createClickInfo(annotations, annotationEvents, relations);
			if (!clickInfo.isEmpty()) {
				sb.append(clickInfo);
			}
//			sb.append('>');
			// coref chain
			final Integer begin = adjustedSpan.getBegin();
			final String previousTag = indexTags.getOrDefault(begin, "");
			indexTags.put(begin, previousTag + sb.toString());
			indexTags.put(adjustedSpan.getEnd(), "" );
		}
		return indexTags;
	}

	static public Map<Integer, String> createTagsTime(final Sentence sentence,
			final Map<TextSpan, Collection<Timex3>> annotationMapTime, final Map<Timex3, Timex3> annotationEventsTime) {
		if (annotationMapTime.isEmpty()) {
			return Collections.emptyMap();
		}
		final Collection<TextSpan> spans = new HashSet<>(annotationMapTime.keySet());
		// TODO move coref adjustment uphill

		final Map<Integer, Character> indexMap = createIndexMap(spans);
		final Collection<TextSpan> adjustedSpans = createAdjustedSpans(indexMap);
		final List<TextSpan> adjustedList = new ArrayList<>(adjustedSpans);
		adjustedList.sort(TEXT_SPAN_COMPARATOR);
		final Map<TextSpan, Collection<Timex3>> adjustedAnnotations = createAdjustedAnnotationsTime(adjustedList,
				annotationMapTime);

		final Map<Integer, String> indexTags = new HashMap<>();
		for (TextSpan adjustedSpan : adjustedList) {
			final StringBuilder sb = new StringBuilder();
			final Collection<Timex3> annotations = adjustedAnnotations.get(adjustedSpan);
			final String clickInfo = createClickInfoTime(annotations, annotationEventsTime);
			if (!clickInfo.isEmpty()) {
				sb.append(clickInfo);
			}

			final Integer begin = adjustedSpan.getBegin();
			final String previousTag = indexTags.getOrDefault(begin, "");
			indexTags.put(begin, previousTag + sb.toString());
			indexTags.put(adjustedSpan.getEnd(), "" );
		}
		return indexTags;
	}



	/**
	 * @param annotations -
	 * @return html with annotation information: polarity, semantic, cui, text, pref
	 *         text
	 */
	static private String createClickInfo(final Collection<IdentifiedAnnotation> annotations,
			final Map<IdentifiedAnnotation, IdentifiedAnnotation> annotationEvents,
			final Collection<BinaryTextRelation> relations) {
		if (annotations == null || annotations.isEmpty()) {
			return "";
		}
		final Map<String, Map<String, Collection<String>>> polarInfoMap = new HashMap<>();
		for (IdentifiedAnnotation annotation : annotations) {
			final String polarity = createPolarity(annotation);
			polarInfoMap.putIfAbsent(polarity, new HashMap<>());
			final IdentifiedAnnotation event = annotationEvents.get(annotation);
			final Map<String, Collection<String>> infoMap = createInfoMap(annotation, event, relations);
			for (Map.Entry<String, Collection<String>> infoEntry : infoMap.entrySet()) {
				polarInfoMap.get(polarity).putIfAbsent(infoEntry.getKey(), new HashSet<>());
				polarInfoMap.get(polarity).get(infoEntry.getKey()).addAll(infoEntry.getValue());
			}
		}
		final List<String> polarities = new ArrayList<>(polarInfoMap.keySet());
		Collections.sort(polarities);
		final StringBuilder sb = new StringBuilder();
		for (String polarity : polarities) {
//			sb.append(polarity).append(NEWLINE);
			final Map<String, Collection<String>> infoMap = polarInfoMap.get(polarity);
			final List<String> semantics = new ArrayList<>(infoMap.keySet());
			Collections.sort(semantics);
			for (String semantic : semantics) {
//				sb.append(semantic).append(NEWLINE);
				final List<String> texts = new ArrayList<>(infoMap.get(semantic));
				Collections.sort(texts);
				for (String text : texts) {
					sb.append(text).append("\n");
				}
			}
		}
		return sb.toString();
	}

	static private String createClickInfoTime(final Collection<Timex3> annotations,
			final Map<Timex3, Timex3> annotationEvents) {
		if (annotations == null || annotations.isEmpty()) {
			return "";
		}
		final Map<String, Map<String, Collection<String>>> polarInfoMap = new HashMap<>();
		for (Timex3 annotation : annotations) {
			final String polarity = GENERIC;
			polarInfoMap.putIfAbsent(polarity, new HashMap<>());
			final Map<String, Collection<String>> infoMap = createInfoMapTime(annotation);
			for (Map.Entry<String, Collection<String>> infoEntry : infoMap.entrySet()) {
				polarInfoMap.get(polarity).putIfAbsent(infoEntry.getKey(), new HashSet<>());
				polarInfoMap.get(polarity).get(infoEntry.getKey()).addAll(infoEntry.getValue());
			}
		}
		final List<String> polarities = new ArrayList<>(polarInfoMap.keySet());
		Collections.sort(polarities);
		final StringBuilder sb = new StringBuilder();
		for (String polarity : polarities) {
			final Map<String, Collection<String>> infoMap = polarInfoMap.get(polarity);
			final List<String> semantics = new ArrayList<>(infoMap.keySet());
			Collections.sort(semantics);
			for (String semantic : semantics) {
				final List<String> texts = new ArrayList<>(infoMap.get(semantic));
				Collections.sort(texts);
				for (String text : texts) {
					sb.append(text).append("\n");
				}
			}
		}
		return sb.toString();
	}

	/**
	 * @param annotation -
	 * @return map of semantic to text for annotations
	 */
	static private Map<String, Collection<String>> createInfoMap(final IdentifiedAnnotation annotation,
			final IdentifiedAnnotation event, final Collection<BinaryTextRelation> relations) {
		final Collection<UmlsConcept> concepts = OntologyConceptUtil.getUmlsConcepts(annotation);
		final Map<String, Collection<String>> semanticMap = new HashMap<>();
		final String coveredText = getCoveredText(annotation);
		final String safeText = getSafeText(coveredText);
		String relationText ="";
		if (event != null) {
			relationText += getRelationText(event, relations);
		}
		for (UmlsConcept concept : concepts) {
			final String semanticCode = SemanticGroup.getSemanticWord(concept);
			final String semanticNormolozedCode = concept.getPreferredText() + "|" + concept.getCui();
			
			semanticMap.putIfAbsent(semanticCode, new HashSet<>());
//			String text = safeText +  "\t" + semanticCode + " "+ annotation.getBegin() + " " + annotation.getEnd() + "\t" + concept.getCui();
			String text = "T%d" +  "\t" + semanticCode + " "+ annotation.getBegin() + " " + annotation.getEnd() + "\t" + safeText + "#note#%1$d\tAnnotatorNotes T%1$d\t" + semanticNormolozedCode.trim();

			if (annotation instanceof EventMention) {
				text += getDocTimeRel((EventMention) annotation);
			}
			semanticMap.get(semanticCode).add(text);
		}
		if (concepts.isEmpty()) {
			String semanticCode = "semanticCode";
			String postText = "postText";
			if (annotation instanceof EventMention) {
				semanticCode = SemanticGroup.EVENT_CODE;
				postText = getDocTimeRel((EventMention) annotation);
			} else if (annotation instanceof TimeMention) {
				semanticCode = SemanticGroup.TIMEX_CODE;
			} else if (annotation instanceof EntityMention) {
				semanticCode = SemanticGroup.ENTITY_CODE;
			}
			if (!semanticCode.isEmpty()) {
				semanticMap.putIfAbsent(semanticCode, new HashSet<>());
				semanticMap.get(semanticCode).add("T%d" +  "\t" + semanticCode + " "+ annotation.getBegin() + " " + annotation.getEnd() +"\t"+ safeText);
			}
		}
		return semanticMap;
	}

	static private Map<String, Collection<String>> createInfoMapTime(final Timex3 annotation) {
		final Map<String, Collection<String>> semanticMap = new HashMap<>();
		final String coveredText = getCoveredTextTime(annotation);
		final String safeText = getSafeText(coveredText);
		String type =  annotation.getTimexType();
		String value = annotation.getTimexValue();
		if (!type.isEmpty()) {
			semanticMap.putIfAbsent(type, new HashSet<>());
//			String text = safeText +  "\t" + type + " "+ annotation.getBegin() + " " + annotation.getEnd() + "\t" + value;
			String text = "T%d" +  "\t" + type + " "+ annotation.getBegin() + " " + annotation.getEnd() + "\t" + safeText + "#note#%1$d\tAnnotatorNotes T%1$d\t" + value.trim();

			semanticMap.get(type).add(text);
		}

		return semanticMap;
	}


	static private String getCoveredText(final IdentifiedAnnotation annotation) {
		return annotation.getCoveredText().replace('\r', ' ').replace('\n', ' ');
	}

	static private String getCoveredTextTime(final Timex3 annotation) {
		return annotation.getCoveredText().replace('\r', ' ').replace('\n', ' ');
	}

	/**
	 * @param coveredText -
	 * @param concept     -
	 * @return the covered text plus preferred text if it exists and is not equal to
	 *         the covered text
	 */

	/**
	 * @param eventMention -
	 * @return a line of text with doctimerel if available
	 */
	static private String getDocTimeRel(final EventMention eventMention) {
		final Event event = eventMention.getEvent();
		if (event == null) {
			return "";
		}
		final EventProperties eventProperties = event.getProperties();
		if (eventProperties == null) {
			return "";
		}
		final String dtr = eventProperties.getDocTimeRel();
		if (dtr == null || dtr.isEmpty()) {
			return "";
		}
		return SPACER + "[" + dtr.toLowerCase() + "] doc time" + NEWLINE;
	}


	static private String createPolarity(final IdentifiedAnnotation annotation) {
		if (annotation instanceof TimeMention || annotation instanceof EntityMention) {
			return GENERIC;
		}
		if (annotation.getPolarity() < 0) {
			if (annotation.getUncertainty() > 0) {
				return UNCERTAIN_NEGATED;
			} else {
				return NEGATED;
			}
		} else if (annotation.getUncertainty() > 0) {
			return UNCERTAIN;
		} else {
			return AFFIRMED;
		}
	}

	static private String getRelationText(final IdentifiedAnnotation annotation,
			final Collection<BinaryTextRelation> relations) {
		return relations.stream().map(r -> getRelationText(annotation, r)).collect(Collectors.joining());
	}

	static private String getRelationText(final IdentifiedAnnotation annotation, final BinaryTextRelation relation) {
		if (relation.getArg1().getArgument().equals(annotation)) {
			return SPACER + "[" + relation.getCategory() + "] " + getSafeText(relation.getArg2().getArgument())
					+ NEWLINE;
		} else if (relation.getArg2().getArgument().equals(annotation)) {
			return SPACER + getSafeText(relation.getArg1().getArgument()) + " [" + relation.getCategory() + "]"
					+ NEWLINE;
		}
		return "";
	}

	

	@Override
	public void writeFile(JCas jCas, String outputDir, String documentId, String fileName) throws IOException {
		// Create a dummy IdentifiedAnnotation in the type system
		// If the BaseToken Part Of Speech is a Noun

		wordIndex = 1;
		
		if (fileName.endsWith(".txt"))
			fileName = fileName.substring(0, fileName.length() - 4);
		else
			System.out.println("Filename does not end with .txt");
		

		
		
		final File bratFile = new File(outputDir, fileName + ".ann");
		LOGGER.info("Writing BRAT to " + bratFile.getPath() + " ...");

// 		try (final BufferedWriter writer = new BufferedWriter(new FileWriter(bratFile))) {

		try (final BufferedWriter writer = new BufferedWriter
			    (new OutputStreamWriter(new FileOutputStream(bratFile), StandardCharsets.UTF_8))) {
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
		LOGGER.info("Finished Writing");		
	}
	
	static private void writeSentence(final Sentence sentence, final Collection<IdentifiedAnnotation> annotations,
			final Collection<Timex3> annotationsTime, final Collection<BaseToken> baseTokens,
			final BufferedWriter writer) throws IOException {
		if (baseTokens.isEmpty()) {
			return ;
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
		

		String All_Annotations = "";
		Map<Integer, String> tag = new HashMap<Integer, String>();
		if (!annotationMapTime.isEmpty() && !annotationMap.isEmpty()) {
			String rel = BratTextWriter.createClickInfo(annotations, annotationEvents, relations);
			String time = BratTextWriter.createClickInfoTime(annotationsTime, annotationEventsTime);
			All_Annotations = rel + "\n" + time; 
// 			tag = BratTextWriter.createTags(sentence, annotationMap, annotationEvents, relations, corefSpans);
//			tag.putAll(BratTextWriter.createTagsTime(sentence, annotationMapTime, annotationEventsTime));

		} else if (!annotationMap.isEmpty()) {
			All_Annotations = BratTextWriter.createClickInfo(annotations, annotationEvents, relations);
//			tag = BratTextWriter.createTags(sentence, annotationMap, annotationEvents, relations, corefSpans);
		} else if (!annotationMapTime.isEmpty()) {
			All_Annotations = BratTextWriter.createClickInfoTime(annotationsTime, annotationEventsTime);
//			tag = BratTextWriter.createTagsTime(sentence, annotationMapTime, annotationEventsTime);
		}
		
		
		
		for (String annotation: All_Annotations.split("\n")) {
			if (!annotation.contentEquals("")){
				String[] tempList_hash = annotation.split("#note");
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
					String[] tempList = annotation.split("\n");
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
//				writer.write(String.format(annotation, wordIndex) + "\n");
//				wordIndex++;
			}
		}

//		final Map<Integer, String> tags = tag;
//
//		String tempWord = "";
//
//		Boolean isBegin = true;

//		for (Map.Entry<TextSpan, String> entry : baseTokenMap.entrySet()) {
//			try {
//				String TempText = entry.getValue();			
//
//				final int begin = entry.getKey().getBegin();
//				final int end = entry.getKey().getEnd();
//				String temSB = "";
//				temSB = "";
//				String text = "";
//				String pos = "";
//				String[] ListText = TempText.split("#POS");
//				if (ListText.length > 1) {
//					text = ListText[0];
//					pos = ListText[1];
//				} else
//					text = ListText[0];
//
//				int temBegin = begin;
//				for (String temChar : text.split("")) {
//					if (isBegin) {
//						final String beginTag = tags.get(temBegin);
//						if (beginTag != null && !beginTag.equalsIgnoreCase("")) {
////							sb.append(temSB);
//							if (!temSB.equalsIgnoreCase("")) {
////							tempWord = "T%d" + "\t" + "word" + " " + begin + " " + end + "\t";
////							writer.write(String.format(tempWord, wordIndex) + temSB + "\n");
////							wordIndex++;
//
//							}
//							temSB = "";
////						if (beginTag.startsWith("T")) {
////							writer.write(String.format(beginTag, wordIndex));
////							wordIndex++;
////						}else {
////							writer.write(String.format("T%d" + beginTag, wordIndex));
////							wordIndex++;
//
//							String[] tempList_hash = beginTag.split("#note");
//							if (tempList_hash.length > 1) {
//
//								for (String temp : tempList_hash) {
//									temp = temp.replace("&apos;", "'");
//									temp = temp.replace("&quot;", "\"");
//									temp = temp.replace("&amp;", "@");
//									temp = temp.replace("&lt;", "<");
//									temp = temp.replace("&gt;", ">");
//									writer.write(String.format(temp.trim(), wordIndex) + "\n");
//
//								}
//								wordIndex++;
//							} else {
//								String[] tempList = beginTag.split("\n");
//								for (String temp : tempList) {
//									temp = temp.replace("&apos;", "'");
//									temp = temp.replace("&quot;", "\"");
//									temp = temp.replace("&amp;", "@");
//									temp = temp.replace("&lt;", "<");
//									temp = temp.replace("&gt;", ">");
//									writer.write(String.format(temp, wordIndex) + "\n");
//									wordIndex++;
//
//								}
//							}
//							// writer.write(beginTag);
//							isBegin = false;
//
//						}
//
//					}
//					temSB += temChar;
//					temBegin += 1;
//					if (!isBegin) {
//						final String endTag = tags.get(temBegin);
//						if (endTag != null && endTag.equalsIgnoreCase("")) {
////							sb.append(temSB);
////						writer.write(temSB + "\t" + "token" + " " + begin + " " + end + "" + "\n");
//							temSB = "";
////							sb.append(endTag);
//							isBegin = true;
//							temBegin += 1;
//						}
//					}
//
//				}
////			sb.append(temSB);
//				if (!temSB.equalsIgnoreCase("") && isBegin) {
//					try {
//						tempWord = "T%d" + "\t" + "word" + " " + begin + " " + end + "\t";
////				writer.write(String.format(tempWord, wordIndex) + temSB + "\n");
////				wordIndex++;
//					} catch (Exception e) {
//						System.out.println(wordIndex + " " + tempWord);
//					}
//				}
//			} catch (Exception e) {
//				System.out.println(wordIndex + " " + tempWord);
//			}
//		}

	}

}
