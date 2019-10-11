
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.util;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** An Attribute-Value tuple.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Property
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class Pair_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Pair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.util.Pair");
 
  /** @generated */
  final Feature casFeat_attribute;
  /** @generated */
  final int     casFeatCode_attribute;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAttribute(int addr) {
        if (featOkTst && casFeat_attribute == null)
      jcas.throwFeatMissing("attribute", "org.apache.ctakes.typesystem.type.util.Pair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_attribute);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttribute(int addr, String v) {
        if (featOkTst && casFeat_attribute == null)
      jcas.throwFeatMissing("attribute", "org.apache.ctakes.typesystem.type.util.Pair");
    ll_cas.ll_setStringValue(addr, casFeatCode_attribute, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.apache.ctakes.typesystem.type.util.Pair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.apache.ctakes.typesystem.type.util.Pair");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Pair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_attribute = jcas.getRequiredFeatureDE(casType, "attribute", "uima.cas.String", featOkTst);
    casFeatCode_attribute  = (null == casFeat_attribute) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attribute).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

  }
}



    