
/* First created by JCasGen Fri Jun 07 12:14:19 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** How often a medication should be used. e.g., BID or b.i.d. or "twice-a-day" would have a number=2 and unit=day.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class MedicationFrequency_Type extends Attribute_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MedicationFrequency.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
 
  /** @generated */
  final Feature casFeat_number;
  /** @generated */
  final int     casFeatCode_number;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNumber(int addr) {
        if (featOkTst && casFeat_number == null)
      jcas.throwFeatMissing("number", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    return ll_cas.ll_getStringValue(addr, casFeatCode_number);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumber(int addr, String v) {
        if (featOkTst && casFeat_number == null)
      jcas.throwFeatMissing("number", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    ll_cas.ll_setStringValue(addr, casFeatCode_number, v);}
    
  
 
  /** @generated */
  final Feature casFeat_unit;
  /** @generated */
  final int     casFeatCode_unit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnit(int addr) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    return ll_cas.ll_getStringValue(addr, casFeatCode_unit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnit(int addr, String v) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "org.apache.ctakes.typesystem.type.refsem.MedicationFrequency");
    ll_cas.ll_setStringValue(addr, casFeatCode_unit, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MedicationFrequency_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_number = jcas.getRequiredFeatureDE(casType, "number", "uima.cas.String", featOkTst);
    casFeatCode_number  = (null == casFeat_number) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_number).getCode();

 
    casFeat_unit = jcas.getRequiredFeatureDE(casType, "unit", "uima.cas.String", featOkTst);
    casFeatCode_unit  = (null == casFeat_unit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unit).getCode();

  }
}



    