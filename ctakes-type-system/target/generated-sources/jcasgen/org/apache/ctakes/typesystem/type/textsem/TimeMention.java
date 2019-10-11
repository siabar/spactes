

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.refsem.Time;
import org.apache.ctakes.typesystem.type.refsem.Date;


/** A text string (IdentifiedAnnotation) that refers to a Time (i.e., TIMEX3).
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class TimeMention extends IdentifiedAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeMention.class);
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
  protected TimeMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TimeMention(JCas jcas, int begin, int end) {
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
  //* Feature: date

  /** getter for date - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getDate() {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeMention_Type)jcasType).casFeatCode_date)));}
    
  /** setter for date - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(Date v) {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeMention_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: time

  /** getter for time - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getTime() {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeMention_Type)jcasType).casFeatCode_time)));}
    
  /** setter for time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTime(Time v) {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeMention_Type)jcasType).casFeatCode_time, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: timeClass

  /** getter for timeClass - gets DATE, DURATION, QUANTIFIER, PREPOSTEXP, etc.
   * @generated
   * @return value of the feature 
   */
  public String getTimeClass() {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_timeClass == null)
      jcasType.jcas.throwFeatMissing("timeClass", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeMention_Type)jcasType).casFeatCode_timeClass);}
    
  /** setter for timeClass - sets DATE, DURATION, QUANTIFIER, PREPOSTEXP, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeClass(String v) {
    if (TimeMention_Type.featOkTst && ((TimeMention_Type)jcasType).casFeat_timeClass == null)
      jcasType.jcas.throwFeatMissing("timeClass", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeMention_Type)jcasType).casFeatCode_timeClass, v);}    
  }

    