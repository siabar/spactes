

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.ctakes.typesystem.type.refsem.OntologyConcept;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.tcas.Annotation;


/** Any span of text that has been discovered or flagged for some reason, such as a Named Entity.  Allows for mapping to an ontology.  Generalized from cTAKES: org.apache.ctakes.typesystem.type.IdentifiedAnnotation.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class IdentifiedAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(IdentifiedAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected IdentifiedAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public IdentifiedAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public IdentifiedAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public IdentifiedAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: ontologyConceptArr

  /** getter for ontologyConceptArr - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getOntologyConceptArr() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_ontologyConceptArr == null)
      jcasType.jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr)));}
    
  /** setter for ontologyConceptArr - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOntologyConceptArr(FSArray v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_ontologyConceptArr == null)
      jcasType.jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ontologyConceptArr - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public OntologyConcept getOntologyConceptArr(int i) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_ontologyConceptArr == null)
      jcasType.jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr), i);
    return (OntologyConcept)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr), i)));}

  /** indexed setter for ontologyConceptArr - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOntologyConceptArr(int i, OntologyConcept v) { 
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_ontologyConceptArr == null)
      jcasType.jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_ontologyConceptArr), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: typeID

  /** getter for typeID - gets The type of named entity (e.g. drug, disorder, ...)
   * @generated
   * @return value of the feature 
   */
  public int getTypeID() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_typeID == null)
      jcasType.jcas.throwFeatMissing("typeID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_typeID);}
    
  /** setter for typeID - sets The type of named entity (e.g. drug, disorder, ...) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeID(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_typeID == null)
      jcasType.jcas.throwFeatMissing("typeID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_typeID, v);}    
   
    
  //*--------------*
  //* Feature: segmentID

  /** getter for segmentID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSegmentID() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_segmentID == null)
      jcasType.jcas.throwFeatMissing("segmentID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_segmentID);}
    
  /** setter for segmentID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSegmentID(String v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_segmentID == null)
      jcasType.jcas.throwFeatMissing("segmentID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_segmentID, v);}    
   
    
  //*--------------*
  //* Feature: sentenceID

  /** getter for sentenceID - gets contains the sentence id of the sentence that contains the NE's text span
   * @generated
   * @return value of the feature 
   */
  public String getSentenceID() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_sentenceID);}
    
  /** setter for sentenceID - sets contains the sentence id of the sentence that contains the NE's text span 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceID(String v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_sentenceID, v);}    
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDiscoveryTechnique() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDiscoveryTechnique(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence of the annotation.
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence of the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPolarity() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated
   * @return value of the feature 
   */
  public int getUncertainty() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUncertainty(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_uncertainty, v);}    
   
    
  //*--------------*
  //* Feature: conditional

  /** getter for conditional - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getConditional() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_conditional);}
    
  /** setter for conditional - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditional(boolean v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_conditional, v);}    
   
    
  //*--------------*
  //* Feature: generic

  /** getter for generic - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getGeneric() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_generic);}
    
  /** setter for generic - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneric(boolean v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_generic, v);}    
   
    
  //*--------------*
  //* Feature: subject

  /** getter for subject - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubject() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_subject);}
    
  /** setter for subject - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubject(String v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_subject, v);}    
   
    
  //*--------------*
  //* Feature: historyOf

  /** getter for historyOf - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHistoryOf() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_historyOf == null)
      jcasType.jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_historyOf);}
    
  /** setter for historyOf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHistoryOf(int v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_historyOf == null)
      jcasType.jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_historyOf, v);}    
   
    
  //*--------------*
  //* Feature: originalText

  /** getter for originalText - gets The covered text of the span or the disjoint spans that resulted in the creation of this
              IdentifiedAnnotation. If the covered text is from disjoint spans, they are separated by a delimeter.
   * @generated
   * @return value of the feature 
   */
  public FSArray getOriginalText() {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_originalText == null)
      jcasType.jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText)));}
    
  /** setter for originalText - sets The covered text of the span or the disjoint spans that resulted in the creation of this
              IdentifiedAnnotation. If the covered text is from disjoint spans, they are separated by a delimeter. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOriginalText(FSArray v) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_originalText == null)
      jcasType.jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for originalText - gets an indexed value - The covered text of the span or the disjoint spans that resulted in the creation of this
              IdentifiedAnnotation. If the covered text is from disjoint spans, they are separated by a delimeter.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getOriginalText(int i) {
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_originalText == null)
      jcasType.jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText), i)));}

  /** indexed setter for originalText - sets an indexed value - The covered text of the span or the disjoint spans that resulted in the creation of this
              IdentifiedAnnotation. If the covered text is from disjoint spans, they are separated by a delimeter.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOriginalText(int i, TOP v) { 
    if (IdentifiedAnnotation_Type.featOkTst && ((IdentifiedAnnotation_Type)jcasType).casFeat_originalText == null)
      jcasType.jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IdentifiedAnnotation_Type)jcasType).casFeatCode_originalText), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    