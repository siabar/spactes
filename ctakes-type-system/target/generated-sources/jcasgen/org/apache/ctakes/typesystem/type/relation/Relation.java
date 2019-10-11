

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A superclass for semantic relationships between Elements.  For example, one might consider TemporalRelations or UMLSRelations between a Medication and a Disorder.  The "category" feature indicates what kind of relation it is.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Relation extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
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
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Relation(JCas jcas) {
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
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDiscoveryTechnique() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDiscoveryTechnique(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPolarity() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated
   * @return value of the feature 
   */
  public int getUncertainty() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUncertainty(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty, v);}    
   
    
  //*--------------*
  //* Feature: conditional

  /** getter for conditional - gets Whether the relation is conditional/hypothetical. Example: "If the patient's tumor returns, we can treat it with Oxaliplatin."
This instantiates a manages/treats relation which should be marked as conditional=true, with the "if" marked as the cue.
   * @generated
   * @return value of the feature 
   */
  public boolean getConditional() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Relation_Type)jcasType).casFeatCode_conditional);}
    
  /** setter for conditional - sets Whether the relation is conditional/hypothetical. Example: "If the patient's tumor returns, we can treat it with Oxaliplatin."
This instantiates a manages/treats relation which should be marked as conditional=true, with the "if" marked as the cue. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConditional(boolean v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Relation_Type)jcasType).casFeatCode_conditional, v);}    
  }

    