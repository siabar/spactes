
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A supertype for tokens subsuming word, punctuation, symbol, newline, contraction, or number.  Includes parts of speech, which are grammatical categories, e.g., noun (NN) or preposition (IN) that use Penn Treebank tags with a few additions.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.BaseToken
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class BaseToken_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.BaseToken");
 
  /** @generated */
  final Feature casFeat_tokenNumber;
  /** @generated */
  final int     casFeatCode_tokenNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenNumber(int addr) {
        if (featOkTst && casFeat_tokenNumber == null)
      jcas.throwFeatMissing("tokenNumber", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokenNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenNumber(int addr, int v) {
        if (featOkTst && casFeat_tokenNumber == null)
      jcas.throwFeatMissing("tokenNumber", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokenNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_normalizedForm;
  /** @generated */
  final int     casFeatCode_normalizedForm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNormalizedForm(int addr) {
        if (featOkTst && casFeat_normalizedForm == null)
      jcas.throwFeatMissing("normalizedForm", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_normalizedForm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNormalizedForm(int addr, String v) {
        if (featOkTst && casFeat_normalizedForm == null)
      jcas.throwFeatMissing("normalizedForm", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_normalizedForm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lemmaEntries;
  /** @generated */
  final int     casFeatCode_lemmaEntries;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLemmaEntries(int addr) {
        if (featOkTst && casFeat_lemmaEntries == null)
      jcas.throwFeatMissing("lemmaEntries", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lemmaEntries);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLemmaEntries(int addr, int v) {
        if (featOkTst && casFeat_lemmaEntries == null)
      jcas.throwFeatMissing("lemmaEntries", "org.apache.ctakes.typesystem.type.syntax.BaseToken");
    ll_cas.ll_setRefValue(addr, casFeatCode_lemmaEntries, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public BaseToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenNumber = jcas.getRequiredFeatureDE(casType, "tokenNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_tokenNumber  = (null == casFeat_tokenNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenNumber).getCode();

 
    casFeat_normalizedForm = jcas.getRequiredFeatureDE(casType, "normalizedForm", "uima.cas.String", featOkTst);
    casFeatCode_normalizedForm  = (null == casFeat_normalizedForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_normalizedForm).getCode();

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_lemmaEntries = jcas.getRequiredFeatureDE(casType, "lemmaEntries", "uima.cas.FSList", featOkTst);
    casFeatCode_lemmaEntries  = (null == casFeat_lemmaEntries) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lemmaEntries).getCode();

  }
}



    