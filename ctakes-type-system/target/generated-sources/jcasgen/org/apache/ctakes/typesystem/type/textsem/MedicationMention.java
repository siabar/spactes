

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.relation.TemporalTextRelation;


/** A text string that refers to a (Medication) Event.  This is an Event from the UMLS semantic group of Chemicals and Drugs, pruned by RxNORM source.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class MedicationMention extends EventMention {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MedicationMention.class);
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
  protected MedicationMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MedicationMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MedicationMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MedicationMention(JCas jcas, int begin, int end) {
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
  //* Feature: medicationAllergy

  /** getter for medicationAllergy - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationAllergyModifier getMedicationAllergy() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationAllergy == null)
      jcasType.jcas.throwFeatMissing("medicationAllergy", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationAllergyModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationAllergy)));}
    
  /** setter for medicationAllergy - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationAllergy(MedicationAllergyModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationAllergy == null)
      jcasType.jcas.throwFeatMissing("medicationAllergy", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationAllergy, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationFrequency

  /** getter for medicationFrequency - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationFrequencyModifier getMedicationFrequency() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationFrequencyModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationFrequency)));}
    
  /** setter for medicationFrequency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationFrequency(MedicationFrequencyModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationFrequency == null)
      jcasType.jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationFrequency, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDuration

  /** getter for medicationDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDurationModifier getMedicationDuration() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationDurationModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationDuration)));}
    
  /** setter for medicationDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDuration(MedicationDurationModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationDuration == null)
      jcasType.jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationDuration, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationRoute

  /** getter for medicationRoute - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationRouteModifier getMedicationRoute() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationRouteModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationRoute)));}
    
  /** setter for medicationRoute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationRoute(MedicationRouteModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationRoute == null)
      jcasType.jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationRoute, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStatusChange

  /** getter for medicationStatusChange - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStatusChangeModifier getMedicationStatusChange() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationStatusChangeModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationStatusChange)));}
    
  /** setter for medicationStatusChange - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStatusChange(MedicationStatusChangeModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationStatusChange == null)
      jcasType.jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationStatusChange, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationDosage

  /** getter for medicationDosage - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationDosageModifier getMedicationDosage() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationDosageModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationDosage)));}
    
  /** setter for medicationDosage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationDosage(MedicationDosageModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationDosage == null)
      jcasType.jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationDosage, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationStrength

  /** getter for medicationStrength - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationStrengthModifier getMedicationStrength() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationStrengthModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationStrength)));}
    
  /** setter for medicationStrength - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationStrength(MedicationStrengthModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationStrength == null)
      jcasType.jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationStrength, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: medicationForm

  /** getter for medicationForm - gets 
   * @generated
   * @return value of the feature 
   */
  public MedicationFormModifier getMedicationForm() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (MedicationFormModifier)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationForm)));}
    
  /** setter for medicationForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMedicationForm(MedicationFormModifier v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_medicationForm == null)
      jcasType.jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_medicationForm, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startDate

  /** getter for startDate - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getStartDate() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_startDate)));}
    
  /** setter for startDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartDate(TimeMention v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_startDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endDate

  /** getter for endDate - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeMention getEndDate() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (TimeMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_endDate)));}
    
  /** setter for endDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndDate(TimeMention v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_endDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relativeTemporalContext

  /** getter for relativeTemporalContext - gets 
   * @generated
   * @return value of the feature 
   */
  public TemporalTextRelation getRelativeTemporalContext() {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return (TemporalTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_relativeTemporalContext)));}
    
  /** setter for relativeTemporalContext - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelativeTemporalContext(TemporalTextRelation v) {
    if (MedicationMention_Type.featOkTst && ((MedicationMention_Type)jcasType).casFeat_relativeTemporalContext == null)
      jcasType.jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((MedicationMention_Type)jcasType).casFeatCode_relativeTemporalContext, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    