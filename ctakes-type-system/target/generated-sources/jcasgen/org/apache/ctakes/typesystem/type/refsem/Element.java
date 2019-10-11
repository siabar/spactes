

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation;


/** A basic semantic unit that refers to something in the real world, including Entities, Events, Attributes, Dates.  Element inherits from uima.cas.TOP to combine textual mentions of these real-world objects.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Element extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Element.class);
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
  protected Element() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Element(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Element(JCas jcas) {
    super(jcas);
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
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: ontologyConcept

  /** getter for ontologyConcept - gets 
   * @generated
   * @return value of the feature 
   */
  public OntologyConcept getOntologyConcept() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_ontologyConcept == null)
      jcasType.jcas.throwFeatMissing("ontologyConcept", "org.apache.ctakes.typesystem.type.refsem.Element");
    return (OntologyConcept)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_ontologyConcept)));}
    
  /** setter for ontologyConcept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOntologyConcept(OntologyConcept v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_ontologyConcept == null)
      jcasType.jcas.throwFeatMissing("ontologyConcept", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setRefValue(addr, ((Element_Type)jcasType).casFeatCode_ontologyConcept, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mentions

  /** getter for mentions - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMentions() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions)));}
    
  /** setter for mentions - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentions(FSArray v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mentions - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public IdentifiedAnnotation getMentions(int i) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i);
    return (IdentifiedAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i)));}

  /** indexed setter for mentions - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMentions(int i, IdentifiedAnnotation v) { 
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDiscoveryTechnique() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDiscoveryTechnique(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Element_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Element_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: conditional

  /** getter for conditional - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getConditional() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_conditional);}
    
  /** setter for conditional - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditional(boolean v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_conditional, v);}    
   
    
  //*--------------*
  //* Feature: generic

  /** getter for generic - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getGeneric() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_generic);}
    
  /** setter for generic - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneric(boolean v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_generic, v);}    
   
    
  //*--------------*
  //* Feature: subject

  /** getter for subject - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubject() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Element_Type)jcasType).casFeatCode_subject);}
    
  /** setter for subject - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubject(String v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setStringValue(addr, ((Element_Type)jcasType).casFeatCode_subject, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPolarity() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated
   * @return value of the feature 
   */
  public int getUncertainty() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUncertainty(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_uncertainty, v);}    
   
    
  //*--------------*
  //* Feature: historyOf

  /** getter for historyOf - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHistoryOf() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_historyOf == null)
      jcasType.jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_historyOf);}
    
  /** setter for historyOf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHistoryOf(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_historyOf == null)
      jcasType.jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_historyOf, v);}    
  }

    