
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Differentiates a token as being a number rather than a punctuation, symbol, newline, word, or contraction. 
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.NumToken
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class NumToken_Type extends BaseToken_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NumToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.NumToken");
 
  /** @generated */
  final Feature casFeat_numType;
  /** @generated */
  final int     casFeatCode_numType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNumType(int addr) {
        if (featOkTst && casFeat_numType == null)
      jcas.throwFeatMissing("numType", "org.apache.ctakes.typesystem.type.syntax.NumToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumType(int addr, int v) {
        if (featOkTst && casFeat_numType == null)
      jcas.throwFeatMissing("numType", "org.apache.ctakes.typesystem.type.syntax.NumToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_numType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NumToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numType = jcas.getRequiredFeatureDE(casType, "numType", "uima.cas.Integer", featOkTst);
    casFeatCode_numType  = (null == casFeat_numType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numType).getCode();

  }
}



    