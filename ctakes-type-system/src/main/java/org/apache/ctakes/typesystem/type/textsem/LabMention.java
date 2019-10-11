

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.ResultOfTextRelation;
import org.apache.ctakes.typesystem.type.relation.DegreeOfTextRelation;


/** A text string that refers to a (Lab) Event.  This is from the UMLS semantic group of Laboratory Procedures.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class LabMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LabMention.class);
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
  protected LabMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LabMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LabMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LabMention(JCas jcas, int begin, int end) {
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
  //* Feature: abnormalInterpretation

  /** getter for abnormalInterpretation - gets 
   * @generated
   * @return value of the feature 
   */
  public DegreeOfTextRelation getAbnormalInterpretation() {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_abnormalInterpretation == null)
      jcasType.jcas.throwFeatMissing("abnormalInterpretation", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    return (DegreeOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_abnormalInterpretation)));}
    
  /** setter for abnormalInterpretation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbnormalInterpretation(DegreeOfTextRelation v) {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_abnormalInterpretation == null)
      jcasType.jcas.throwFeatMissing("abnormalInterpretation", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_abnormalInterpretation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: deltaFlag

  /** getter for deltaFlag - gets 
   * @generated
   * @return value of the feature 
   */
  public LabDeltaFlagModifier getDeltaFlag() {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_deltaFlag == null)
      jcasType.jcas.throwFeatMissing("deltaFlag", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    return (LabDeltaFlagModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_deltaFlag)));}
    
  /** setter for deltaFlag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDeltaFlag(LabDeltaFlagModifier v) {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_deltaFlag == null)
      jcasType.jcas.throwFeatMissing("deltaFlag", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_deltaFlag, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: labValue

  /** getter for labValue - gets 
   * @generated
   * @return value of the feature 
   */
  public ResultOfTextRelation getLabValue() {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_labValue == null)
      jcasType.jcas.throwFeatMissing("labValue", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    return (ResultOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_labValue)));}
    
  /** setter for labValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabValue(ResultOfTextRelation v) {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_labValue == null)
      jcasType.jcas.throwFeatMissing("labValue", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_labValue, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ordinalInterpretation

  /** getter for ordinalInterpretation - gets 
   * @generated
   * @return value of the feature 
   */
  public DegreeOfTextRelation getOrdinalInterpretation() {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_ordinalInterpretation == null)
      jcasType.jcas.throwFeatMissing("ordinalInterpretation", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    return (DegreeOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_ordinalInterpretation)));}
    
  /** setter for ordinalInterpretation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrdinalInterpretation(DegreeOfTextRelation v) {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_ordinalInterpretation == null)
      jcasType.jcas.throwFeatMissing("ordinalInterpretation", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_ordinalInterpretation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: referenceRangeNarrative

  /** getter for referenceRangeNarrative - gets 
   * @generated
   * @return value of the feature 
   */
  public LabReferenceRangeModifier getReferenceRangeNarrative() {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_referenceRangeNarrative == null)
      jcasType.jcas.throwFeatMissing("referenceRangeNarrative", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    return (LabReferenceRangeModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_referenceRangeNarrative)));}
    
  /** setter for referenceRangeNarrative - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferenceRangeNarrative(LabReferenceRangeModifier v) {
    if (LabMention_Type.featOkTst && ((LabMention_Type)jcasType).casFeat_referenceRangeNarrative == null)
      jcasType.jcas.throwFeatMissing("referenceRangeNarrative", "org.apache.ctakes.typesystem.type.textsem.LabMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((LabMention_Type)jcasType).casFeatCode_referenceRangeNarrative, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    