

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.TemporalRelation;
import org.apache.ctakes.typesystem.type.relation.LocationOf;
import org.apache.ctakes.typesystem.type.relation.ElementRelation;


/** This is an Event from the UMLS semantic group of Sign or Symptom.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class SignSymptom extends Event {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SignSymptom.class);
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
  protected SignSymptom() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SignSymptom(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SignSymptom(JCas jcas) {
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
  //* Feature: alleviatingFactor

  /** getter for alleviatingFactor - gets 
   * @generated
   * @return value of the feature 
   */
  public ElementRelation getAlleviatingFactor() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_alleviatingFactor == null)
      jcasType.jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (ElementRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_alleviatingFactor)));}
    
  /** setter for alleviatingFactor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlleviatingFactor(ElementRelation v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_alleviatingFactor == null)
      jcasType.jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_alleviatingFactor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodyLaterality

  /** getter for bodyLaterality - gets 
   * @generated
   * @return value of the feature 
   */
  public BodyLaterality getBodyLaterality() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (BodyLaterality)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodyLaterality)));}
    
  /** setter for bodyLaterality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLaterality(BodyLaterality v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodyLaterality, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodySide

  /** getter for bodySide - gets 
   * @generated
   * @return value of the feature 
   */
  public BodySide getBodySide() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (BodySide)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodySide)));}
    
  /** setter for bodySide - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodySide(BodySide v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodySide, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodyLocation

  /** getter for bodyLocation - gets 
   * @generated
   * @return value of the feature 
   */
  public LocationOf getBodyLocation() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (LocationOf)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodyLocation)));}
    
  /** setter for bodyLocation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLocation(LocationOf v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_bodyLocation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: course

  /** getter for course - gets 
   * @generated
   * @return value of the feature 
   */
  public Course getCourse() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_course == null)
      jcasType.jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (Course)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_course)));}
    
  /** setter for course - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCourse(Course v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_course == null)
      jcasType.jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_course, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: duration

  /** getter for duration - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalRelation getDuration() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (TemporalRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_duration)));}
    
  /** setter for duration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDuration(TemporalRelation v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_duration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getEndTime() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_endTime)));}
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(Time v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: exacerbatingFactor

  /** getter for exacerbatingFactor - gets 
   * @generated
   * @return value of the feature 
   */
  public ElementRelation getExacerbatingFactor() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_exacerbatingFactor == null)
      jcasType.jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (ElementRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_exacerbatingFactor)));}
    
  /** setter for exacerbatingFactor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExacerbatingFactor(ElementRelation v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_exacerbatingFactor == null)
      jcasType.jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_exacerbatingFactor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: severity

  /** getter for severity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSeverity() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_severity == null)
      jcasType.jcas.throwFeatMissing("severity", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_severity);}
    
  /** setter for severity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSeverity(String v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_severity == null)
      jcasType.jcas.throwFeatMissing("severity", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setStringValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_severity, v);}    
   
    
  //*--------------*
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getStartTime() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_startTime)));}
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(Time v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relativeTemporalContext

  /** getter for relativeTemporalContext - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalRelation getRelativeTemporalContext() {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    return (TemporalRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_relativeTemporalContext)));}
    
  /** setter for relativeTemporalContext - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelativeTemporalContext(TemporalRelation v) {
    if (SignSymptom_Type.featOkTst && ((SignSymptom_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.SignSymptom");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptom_Type)jcasType).casFeatCode_relativeTemporalContext, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    