

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A normalized form for dates, namely with day, month, and year.  A subtype of Element but may not use all inherited attributes.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class Date extends Element {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Date.class);
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
  protected Date() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Date(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Date(JCas jcas) {
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
  //* Feature: day

  /** getter for day - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDay() {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_day == null)
      jcasType.jcas.throwFeatMissing("day", "org.apache.ctakes.typesystem.type.refsem.Date");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Date_Type)jcasType).casFeatCode_day);}
    
  /** setter for day - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDay(String v) {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_day == null)
      jcasType.jcas.throwFeatMissing("day", "org.apache.ctakes.typesystem.type.refsem.Date");
    jcasType.ll_cas.ll_setStringValue(addr, ((Date_Type)jcasType).casFeatCode_day, v);}    
   
    
  //*--------------*
  //* Feature: month

  /** getter for month - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMonth() {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_month == null)
      jcasType.jcas.throwFeatMissing("month", "org.apache.ctakes.typesystem.type.refsem.Date");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Date_Type)jcasType).casFeatCode_month);}
    
  /** setter for month - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMonth(String v) {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_month == null)
      jcasType.jcas.throwFeatMissing("month", "org.apache.ctakes.typesystem.type.refsem.Date");
    jcasType.ll_cas.ll_setStringValue(addr, ((Date_Type)jcasType).casFeatCode_month, v);}    
   
    
  //*--------------*
  //* Feature: year

  /** getter for year - gets 
   * @generated
   * @return value of the feature 
   */
  public String getYear() {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_year == null)
      jcasType.jcas.throwFeatMissing("year", "org.apache.ctakes.typesystem.type.refsem.Date");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Date_Type)jcasType).casFeatCode_year);}
    
  /** setter for year - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setYear(String v) {
    if (Date_Type.featOkTst && ((Date_Type)jcasType).casFeat_year == null)
      jcasType.jcas.throwFeatMissing("year", "org.apache.ctakes.typesystem.type.refsem.Date");
    jcasType.ll_cas.ll_setStringValue(addr, ((Date_Type)jcasType).casFeatCode_year, v);}    
  }

    