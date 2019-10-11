

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.refsem.MedicationDuration;
import org.apache.ctakes.typesystem.type.refsem.MedicationStatusChange;
import org.apache.ctakes.typesystem.type.refsem.MedicationFrequency;
import org.apache.ctakes.typesystem.type.refsem.MedicationRoute;
import org.apache.ctakes.typesystem.type.refsem.MedicationStrength;
import org.apache.ctakes.typesystem.type.refsem.MedicationDosage;
import org.apache.ctakes.typesystem.type.refsem.MedicationForm;
import org.apache.ctakes.typesystem.type.refsem.Date;


/** As of cTAKEs 3.1, see org.apache.ctakes.typesystem.type.textsem.MedicationMention.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class MedicationEventMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MedicationEventMention.class);
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
  protected MedicationEventMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MedicationEventMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MedicationEventMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MedicationEventMention(JCas jcas, int begin, int end) {
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
  //* Feature: medicationFrequency

  /** getter for medicationFrequency - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationFrequency getMedicationFrequency() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationFrequency)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationFrequency)));}
    
  /** setter for medicationFrequency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationFrequency(MedicationFrequency v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationFrequency, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDuration

  /** getter for medicationDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDuration getMedicationDuration() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationDuration)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDuration)));}
    
  /** setter for medicationDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDuration(MedicationDuration v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDuration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationRoute

  /** getter for medicationRoute - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationRoute getMedicationRoute() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationRoute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationRoute)));}
    
  /** setter for medicationRoute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationRoute(MedicationRoute v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationRoute, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStatusChange

  /** getter for medicationStatusChange - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStatusChange getMedicationStatusChange() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationStatusChange)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStatusChange)));}
    
  /** setter for medicationStatusChange - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStatusChange(MedicationStatusChange v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStatusChange, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDosage

  /** getter for medicationDosage - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDosage getMedicationDosage() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationDosage)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDosage)));}
    
  /** setter for medicationDosage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDosage(MedicationDosage v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationDosage, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStrength

  /** getter for medicationStrength - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStrength getMedicationStrength() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationStrength)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStrength)));}
    
  /** setter for medicationStrength - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStrength(MedicationStrength v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationStrength, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationForm

  /** getter for medicationForm - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationForm getMedicationForm() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (MedicationForm)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationForm)));}
    
  /** setter for medicationForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationForm(MedicationForm v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_medicationForm, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startDate

  /** getter for startDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getStartDate() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_startDate)));}
    
  /** setter for startDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartDate(Date v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_startDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endDate

  /** getter for endDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getEndDate() {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_endDate)));}
    
  /** setter for endDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndDate(Date v) {
    if (MedicationEventMention_Type.featOkTst && ((MedicationEventMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationEventMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationEventMention_Type)jcasType).casFeatCode_endDate, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    