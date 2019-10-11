
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A text string that refers to a (Medication) Event.  This is an Event from the UMLS semantic group of Chemicals and Drugs, pruned by RxNORM source.  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class MedicationMention_Type extends EventMention_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MedicationMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.MedicationMention");
 
  /** @generated */
  final Feature casFeat_medicationAllergy;
  /** @generated */
  final int     casFeatCode_medicationAllergy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationAllergy(int addr) {
        if (featOkTst && casFeat_medicationAllergy == null)
      jcas.throwFeatMissing("medicationAllergy", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationAllergy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationAllergy(int addr, int v) {
        if (featOkTst && casFeat_medicationAllergy == null)
      jcas.throwFeatMissing("medicationAllergy", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationAllergy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationFrequency;
  /** @generated */
  final int     casFeatCode_medicationFrequency;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationFrequency(int addr) {
        if (featOkTst && casFeat_medicationFrequency == null)
      jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationFrequency);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationFrequency(int addr, int v) {
        if (featOkTst && casFeat_medicationFrequency == null)
      jcas.throwFeatMissing("medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationFrequency, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationDuration;
  /** @generated */
  final int     casFeatCode_medicationDuration;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationDuration(int addr) {
        if (featOkTst && casFeat_medicationDuration == null)
      jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationDuration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationDuration(int addr, int v) {
        if (featOkTst && casFeat_medicationDuration == null)
      jcas.throwFeatMissing("medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationDuration, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationRoute;
  /** @generated */
  final int     casFeatCode_medicationRoute;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationRoute(int addr) {
        if (featOkTst && casFeat_medicationRoute == null)
      jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationRoute);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationRoute(int addr, int v) {
        if (featOkTst && casFeat_medicationRoute == null)
      jcas.throwFeatMissing("medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationRoute, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationStatusChange;
  /** @generated */
  final int     casFeatCode_medicationStatusChange;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationStatusChange(int addr) {
        if (featOkTst && casFeat_medicationStatusChange == null)
      jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationStatusChange);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationStatusChange(int addr, int v) {
        if (featOkTst && casFeat_medicationStatusChange == null)
      jcas.throwFeatMissing("medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationStatusChange, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationDosage;
  /** @generated */
  final int     casFeatCode_medicationDosage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationDosage(int addr) {
        if (featOkTst && casFeat_medicationDosage == null)
      jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationDosage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationDosage(int addr, int v) {
        if (featOkTst && casFeat_medicationDosage == null)
      jcas.throwFeatMissing("medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationDosage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationStrength;
  /** @generated */
  final int     casFeatCode_medicationStrength;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationStrength(int addr) {
        if (featOkTst && casFeat_medicationStrength == null)
      jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationStrength);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationStrength(int addr, int v) {
        if (featOkTst && casFeat_medicationStrength == null)
      jcas.throwFeatMissing("medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationStrength, v);}
    
  
 
  /** @generated */
  final Feature casFeat_medicationForm;
  /** @generated */
  final int     casFeatCode_medicationForm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMedicationForm(int addr) {
        if (featOkTst && casFeat_medicationForm == null)
      jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_medicationForm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMedicationForm(int addr, int v) {
        if (featOkTst && casFeat_medicationForm == null)
      jcas.throwFeatMissing("medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_medicationForm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startDate;
  /** @generated */
  final int     casFeatCode_startDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartDate(int addr) {
        if (featOkTst && casFeat_startDate == null)
      jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartDate(int addr, int v) {
        if (featOkTst && casFeat_startDate == null)
      jcas.throwFeatMissing("startDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_startDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endDate;
  /** @generated */
  final int     casFeatCode_endDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndDate(int addr) {
        if (featOkTst && casFeat_endDate == null)
      jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndDate(int addr, int v) {
        if (featOkTst && casFeat_endDate == null)
      jcas.throwFeatMissing("endDate", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_endDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_relativeTemporalContext;
  /** @generated */
  final int     casFeatCode_relativeTemporalContext;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRelativeTemporalContext(int addr) {
        if (featOkTst && casFeat_relativeTemporalContext == null)
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_relativeTemporalContext);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelativeTemporalContext(int addr, int v) {
        if (featOkTst && casFeat_relativeTemporalContext == null)
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.MedicationMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_relativeTemporalContext, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MedicationMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_medicationAllergy = jcas.getRequiredFeatureDE(casType, "medicationAllergy", "org.apache.ctakes.typesystem.type.textsem.MedicationAllergyModifier", featOkTst);
    casFeatCode_medicationAllergy  = (null == casFeat_medicationAllergy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationAllergy).getCode();

 
    casFeat_medicationFrequency = jcas.getRequiredFeatureDE(casType, "medicationFrequency", "org.apache.ctakes.typesystem.type.textsem.MedicationFrequencyModifier", featOkTst);
    casFeatCode_medicationFrequency  = (null == casFeat_medicationFrequency) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationFrequency).getCode();

 
    casFeat_medicationDuration = jcas.getRequiredFeatureDE(casType, "medicationDuration", "org.apache.ctakes.typesystem.type.textsem.MedicationDurationModifier", featOkTst);
    casFeatCode_medicationDuration  = (null == casFeat_medicationDuration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationDuration).getCode();

 
    casFeat_medicationRoute = jcas.getRequiredFeatureDE(casType, "medicationRoute", "org.apache.ctakes.typesystem.type.textsem.MedicationRouteModifier", featOkTst);
    casFeatCode_medicationRoute  = (null == casFeat_medicationRoute) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationRoute).getCode();

 
    casFeat_medicationStatusChange = jcas.getRequiredFeatureDE(casType, "medicationStatusChange", "org.apache.ctakes.typesystem.type.textsem.MedicationStatusChangeModifier", featOkTst);
    casFeatCode_medicationStatusChange  = (null == casFeat_medicationStatusChange) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationStatusChange).getCode();

 
    casFeat_medicationDosage = jcas.getRequiredFeatureDE(casType, "medicationDosage", "org.apache.ctakes.typesystem.type.textsem.MedicationDosageModifier", featOkTst);
    casFeatCode_medicationDosage  = (null == casFeat_medicationDosage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationDosage).getCode();

 
    casFeat_medicationStrength = jcas.getRequiredFeatureDE(casType, "medicationStrength", "org.apache.ctakes.typesystem.type.textsem.MedicationStrengthModifier", featOkTst);
    casFeatCode_medicationStrength  = (null == casFeat_medicationStrength) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationStrength).getCode();

 
    casFeat_medicationForm = jcas.getRequiredFeatureDE(casType, "medicationForm", "org.apache.ctakes.typesystem.type.textsem.MedicationFormModifier", featOkTst);
    casFeatCode_medicationForm  = (null == casFeat_medicationForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_medicationForm).getCode();

 
    casFeat_startDate = jcas.getRequiredFeatureDE(casType, "startDate", "org.apache.ctakes.typesystem.type.textsem.TimeMention", featOkTst);
    casFeatCode_startDate  = (null == casFeat_startDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startDate).getCode();

 
    casFeat_endDate = jcas.getRequiredFeatureDE(casType, "endDate", "org.apache.ctakes.typesystem.type.textsem.TimeMention", featOkTst);
    casFeatCode_endDate  = (null == casFeat_endDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endDate).getCode();

 
    casFeat_relativeTemporalContext = jcas.getRequiredFeatureDE(casType, "relativeTemporalContext", "org.apache.ctakes.typesystem.type.relation.TemporalTextRelation", featOkTst);
    casFeatCode_relativeTemporalContext  = (null == casFeat_relativeTemporalContext) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relativeTemporalContext).getCode();

  }
}



    