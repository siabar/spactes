

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.TemporalRelation;


/** This is an Event from the UMLS semantic group of Chemicals and Drugs, pruned by RxNORM source.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class Medication extends Event {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Medication.class);
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
  protected Medication() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Medication(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Medication(JCas jcas) {
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
  //* Feature: medicationFrequency

  /** getter for medicationFrequency - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationFrequency getMedicationFrequency() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationFrequency)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationFrequency)));}
    
  /** setter for medicationFrequency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationFrequency(MedicationFrequency v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationFrequency, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDuration

  /** getter for medicationDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDuration getMedicationDuration() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationDuration)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationDuration)));}
    
  /** setter for medicationDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDuration(MedicationDuration v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationDuration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationRoute

  /** getter for medicationRoute - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationRoute getMedicationRoute() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationRoute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationRoute)));}
    
  /** setter for medicationRoute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationRoute(MedicationRoute v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationRoute, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStatusChange

  /** getter for medicationStatusChange - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStatusChange getMedicationStatusChange() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationStatusChange)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationStatusChange)));}
    
  /** setter for medicationStatusChange - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStatusChange(MedicationStatusChange v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationStatusChange, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDosage

  /** getter for medicationDosage - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDosage getMedicationDosage() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationDosage)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationDosage)));}
    
  /** setter for medicationDosage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDosage(MedicationDosage v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationDosage, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStrength

  /** getter for medicationStrength - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStrength getMedicationStrength() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationStrength)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationStrength)));}
    
  /** setter for medicationStrength - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStrength(MedicationStrength v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationStrength, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationForm

  /** getter for medicationForm - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationForm getMedicationForm() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (MedicationForm)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationForm)));}
    
  /** setter for medicationForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationForm(MedicationForm v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_medicationForm, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startDate

  /** getter for startDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getStartDate() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_startDate)));}
    
  /** setter for startDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartDate(Date v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_startDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endDate

  /** getter for endDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getEndDate() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_endDate)));}
    
  /** setter for endDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndDate(Date v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_endDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relativeTemporalContext

  /** getter for relativeTemporalContext - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalRelation getRelativeTemporalContext() {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.Medication");
    return (TemporalRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Medication_Type)jcasType).casFeatCode_relativeTemporalContext)));}
    
  /** setter for relativeTemporalContext - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelativeTemporalContext(TemporalRelation v) {
    if (Medication_Type.featOkTst && ((Medication_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.Medication");
    jcasType.ll_cas.ll_setRefValue(addr, ((Medication_Type)jcasType).casFeatCode_relativeTemporalContext, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    