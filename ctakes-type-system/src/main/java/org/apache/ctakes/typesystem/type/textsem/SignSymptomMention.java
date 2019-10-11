

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.TemporalTextRelation;
import org.apache.ctakes.typesystem.type.relation.LocationOfTextRelation;
import org.apache.ctakes.typesystem.type.relation.ManagesTreatsTextRelation;
import org.apache.ctakes.typesystem.type.relation.ComplicatesDisruptsTextRelation;
import org.apache.ctakes.typesystem.type.relation.DegreeOfTextRelation;


/** A text string that refers to a (SignSymptom) Event.  This is from the UMLS semantic group of Sign or Symptom.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class SignSymptomMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SignSymptomMention.class);
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
  protected SignSymptomMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SignSymptomMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SignSymptomMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SignSymptomMention(JCas jcas, int begin, int end) {
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
  //* Feature: alleviatingFactor

  /** getter for alleviatingFactor - gets 
   * @generated
   * @return value of the feature 
   */
  public ManagesTreatsTextRelation getAlleviatingFactor() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_alleviatingFactor == null)
      jcasType.jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (ManagesTreatsTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_alleviatingFactor)));}
    
  /** setter for alleviatingFactor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlleviatingFactor(ManagesTreatsTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_alleviatingFactor == null)
      jcasType.jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_alleviatingFactor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodyLaterality

  /** getter for bodyLaterality - gets 
   * @generated
   * @return value of the feature 
   */
  public BodyLateralityModifier getBodyLaterality() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (BodyLateralityModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodyLaterality)));}
    
  /** setter for bodyLaterality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLaterality(BodyLateralityModifier v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodyLaterality == null)
      jcasType.jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodyLaterality, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodySide

  /** getter for bodySide - gets 
   * @generated
   * @return value of the feature 
   */
  public BodySideModifier getBodySide() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (BodySideModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodySide)));}
    
  /** setter for bodySide - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodySide(BodySideModifier v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodySide == null)
      jcasType.jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodySide, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bodyLocation

  /** getter for bodyLocation - gets 
   * @generated
   * @return value of the feature 
   */
  public LocationOfTextRelation getBodyLocation() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (LocationOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodyLocation)));}
    
  /** setter for bodyLocation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBodyLocation(LocationOfTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_bodyLocation == null)
      jcasType.jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_bodyLocation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: course

  /** getter for course - gets 
   * @generated
   * @return value of the feature 
   */
  public DegreeOfTextRelation getCourse() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_course == null)
      jcasType.jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (DegreeOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_course)));}
    
  /** setter for course - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCourse(DegreeOfTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_course == null)
      jcasType.jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_course, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: duration

  /** getter for duration - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalTextRelation getDuration() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (TemporalTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_duration)));}
    
  /** setter for duration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDuration(TemporalTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_duration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getEndTime() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_endTime)));}
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(TimeMention v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: exacerbatingFactor

  /** getter for exacerbatingFactor - gets 
   * @generated
   * @return value of the feature 
   */
  public ComplicatesDisruptsTextRelation getExacerbatingFactor() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_exacerbatingFactor == null)
      jcasType.jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (ComplicatesDisruptsTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_exacerbatingFactor)));}
    
  /** setter for exacerbatingFactor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExacerbatingFactor(ComplicatesDisruptsTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_exacerbatingFactor == null)
      jcasType.jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_exacerbatingFactor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: severity

  /** getter for severity - gets 
   * @generated
   * @return value of the feature 
   */
  public DegreeOfTextRelation getSeverity() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_severity == null)
      jcasType.jcas.throwFeatMissing("severity", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (DegreeOfTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_severity)));}
    
  /** setter for severity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSeverity(DegreeOfTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_severity == null)
      jcasType.jcas.throwFeatMissing("severity", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_severity, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getStartTime() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_startTime)));}
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(TimeMention v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relativeTemporalContext

  /** getter for relativeTemporalContext - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalTextRelation getRelativeTemporalContext() {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    return (TemporalTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_relativeTemporalContext)));}
    
  /** setter for relativeTemporalContext - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelativeTemporalContext(TemporalTextRelation v) {
    if (SignSymptomMention_Type.featOkTst && ((SignSymptomMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.SignSymptomMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((SignSymptomMention_Type)jcasType).casFeatCode_relativeTemporalContext, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    