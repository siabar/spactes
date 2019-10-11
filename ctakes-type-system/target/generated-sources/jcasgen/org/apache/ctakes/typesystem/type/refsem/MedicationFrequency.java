

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** How often a medication should be used. e.g., BID or b.i.d. or "twice-a-day" would have a number=2 and unit=day.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class MedicationFrequency extends Attribute {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MedicationFrequency.class);
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
  protected MedicationFrequency() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MedicationFrequency(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MedicationFrequency(JCas jcas) {
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
  //* Feature: number

  /** getter for number - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNumber() {
    if (MedicationFrequency_Type.featOkTst && ((MedicationFrequency_Type)jcasType).casFeat_number == null)
      jcasType.jcas.throwFeatMissing("number", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MedicationFrequency_Type)jcasType).casFeatCode_number);}
    
  /** setter for number - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumber(String v) {
    if (MedicationFrequency_Type.featOkTst && ((MedicationFrequency_Type)jcasType).casFeat_number == null)
      jcasType.jcas.throwFeatMissing("number", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    jcasType.ll_cas.ll_setStringValue(addr, ((MedicationFrequency_Type)jcasType).casFeatCode_number, v);}    
   
    
  //*--------------*
  //* Feature: unit

  /** getter for unit - gets The periodic unit used, e.g day, month, hour, etc.
   * @generated
   * @return value of the feature 
   */
  public String getUnit() {
    if (MedicationFrequency_Type.featOkTst && ((MedicationFrequency_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MedicationFrequency_Type)jcasType).casFeatCode_unit);}
    
  /** setter for unit - sets The periodic unit used, e.g day, month, hour, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnit(String v) {
    if (MedicationFrequency_Type.featOkTst && ((MedicationFrequency_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    jcasType.ll_cas.ll_setStringValue(addr, ((MedicationFrequency_Type)jcasType).casFeatCode_unit, v);}    
  }

    