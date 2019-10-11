
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A Penn Treebank Node; as the top node, this stores the whole subsumed sentence's parse tree as a string.  It also stores all the terminals, allowing for traversal of the tree bottom-up (top-down is implied through the TreebankNode's 'children' attribute).
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class TopTreebankNode_Type extends TreebankNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TopTreebankNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
 
  /** @generated */
  final Feature casFeat_treebankParse;
  /** @generated */
  final int     casFeatCode_treebankParse;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTreebankParse(int addr) {
        if (featOkTst && casFeat_treebankParse == null)
      jcas.throwFeatMissing("treebankParse", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_treebankParse);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTreebankParse(int addr, String v) {
        if (featOkTst && casFeat_treebankParse == null)
      jcas.throwFeatMissing("treebankParse", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_treebankParse, v);}
    
  
 
  /** @generated */
  final Feature casFeat_terminals;
  /** @generated */
  final int     casFeatCode_terminals;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTerminals(int addr) {
        if (featOkTst && casFeat_terminals == null)
      jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    return ll_cas.ll_getRefValue(addr, casFeatCode_terminals);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerminals(int addr, int v) {
        if (featOkTst && casFeat_terminals == null)
      jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    ll_cas.ll_setRefValue(addr, casFeatCode_terminals, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getTerminals(int addr, int i) {
        if (featOkTst && casFeat_terminals == null)
      jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setTerminals(int addr, int i, int v) {
        if (featOkTst && casFeat_terminals == null)
      jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terminals), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TopTreebankNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_treebankParse = jcas.getRequiredFeatureDE(casType, "treebankParse", "uima.cas.String", featOkTst);
    casFeatCode_treebankParse  = (null == casFeat_treebankParse) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_treebankParse).getCode();

 
    casFeat_terminals = jcas.getRequiredFeatureDE(casType, "terminals", "uima.cas.FSArray", featOkTst);
    casFeatCode_terminals  = (null == casFeat_terminals) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_terminals).getCode();

  }
}



    