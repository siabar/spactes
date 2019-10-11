

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.TemporalTextRelation;
import org.apache.ctakes.typesystem.type.relation.LocationOfTextRelation;


/** A text string that refers to a (Procedure) Event.  This is from the UMLS semantic group of Procedures (except that Laboratory procedures are separate).  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class ProcedureMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ProcedureMention.class);
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
  protected ProcedureMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ProcedureMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ProcedureMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ProcedureMention(JCas jcas, int begin, int end) {
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
  //* Feature: bodyLaterality

  /** getter for bodyLaterality - gets 
   * @generated
   * @return value of the feature 
   */
  public BodyLateralityModifier getBodyLaterality() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (BodyLateralityModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodyLaterality)));}
    
  /** setter for bodyLaterality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLaterality(BodyLateralityModifier v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodyLaterality, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodySide

  /** getter for bodySide - gets 
   * @generated
   * @return value of the feature 
   */
  public BodySideModifier getBodySide() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (BodySideModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodySide)));}
    
  /** setter for bodySide - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodySide(BodySideModifier v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodySide, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodyLocation

  /** getter for bodyLocation - gets 
   * @generated
   * @return value of the feature 
   */
  public LocationOfTextRelation getBodyLocation() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (LocationOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodyLocation)));}
    
  /** setter for bodyLocation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLocation(LocationOfTextRelation v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_bodyLocation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: procedureDevice

  /** getter for procedureDevice - gets 
   * @generated
   * @return value of the feature 
   */
  public ProcedureDeviceModifier getProcedureDevice() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_procedureDevice == null)
      jcasType.jcas.throwFeatMissing("procedureDevice", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (ProcedureDeviceModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_procedureDevice)));}
    
  /** setter for procedureDevice - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProcedureDevice(ProcedureDeviceModifier v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_procedureDevice == null)
      jcasType.jcas.throwFeatMissing("procedureDevice", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_procedureDevice, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: duration

  /** getter for duration - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalTextRelation getDuration() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (TemporalTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_duration)));}
    
  /** setter for duration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDuration(TemporalTextRelation v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_duration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getEndTime() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_endTime)));}
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(TimeMention v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: method

  /** getter for method - gets 
   * @generated
   * @return value of the feature 
   */
  public ProcedureMethodModifier getMethod() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_method == null)
      jcasType.jcas.throwFeatMissing("method", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (ProcedureMethodModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_method)));}
    
  /** setter for method - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMethod(ProcedureMethodModifier v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_method == null)
      jcasType.jcas.throwFeatMissing("method", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_method, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getStartTime() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_startTime)));}
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(TimeMention v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relativeTemporalContext

  /** getter for relativeTemporalContext - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalTextRelation getRelativeTemporalContext() {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return (TemporalTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_relativeTemporalContext)));}
    
  /** setter for relativeTemporalContext - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelativeTemporalContext(TemporalTextRelation v) {
    if (ProcedureMention_Type.featOkTst && ((ProcedureMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProcedureMention_Type)jcasType).casFeatCode_relativeTemporalContext, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    