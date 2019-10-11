
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A Penn Treebank Node; as a terminal, there is an associated word, and the index of the word is a feature.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class TerminalTreebankNode_Type extends TreebankNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TerminalTreebankNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
 
  /** @generated */
  final Feature casFeat_index;
  /** @generated */
  final int     casFeatCode_index;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIndex(int addr) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_index);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndex(int addr, int v) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_index, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenIndex;
  /** @generated */
  final int     casFeatCode_tokenIndex;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenIndex(int addr) {
        if (featOkTst && casFeat_tokenIndex == null)
      jcas.throwFeatMissing("tokenIndex", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokenIndex);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenIndex(int addr, int v) {
        if (featOkTst && casFeat_tokenIndex == null)
      jcas.throwFeatMissing("tokenIndex", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokenIndex, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TerminalTreebankNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_index = jcas.getRequiredFeatureDE(casType, "index", "uima.cas.Integer", featOkTst);
    casFeatCode_index  = (null == casFeat_index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_index).getCode();

 
    casFeat_tokenIndex = jcas.getRequiredFeatureDE(casType, "tokenIndex", "uima.cas.Integer", featOkTst);
    casFeatCode_tokenIndex  = (null == casFeat_tokenIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenIndex).getCode();

  }
}



    