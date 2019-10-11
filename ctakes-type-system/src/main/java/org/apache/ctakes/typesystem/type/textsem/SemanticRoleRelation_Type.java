
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.ctakes.typesystem.type.relation.Relation_Type;

/** Predicate-argument structure used for semantic role labeling output.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class SemanticRoleRelation_Type extends Relation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticRoleRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
 
  /** @generated */
  final Feature casFeat_predicate;
  /** @generated */
  final int     casFeatCode_predicate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPredicate(int addr) {
        if (featOkTst && casFeat_predicate == null)
      jcas.throwFeatMissing("predicate", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_predicate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPredicate(int addr, int v) {
        if (featOkTst && casFeat_predicate == null)
      jcas.throwFeatMissing("predicate", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_predicate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_argument;
  /** @generated */
  final int     casFeatCode_argument;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getArgument(int addr) {
        if (featOkTst && casFeat_argument == null)
      jcas.throwFeatMissing("argument", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_argument);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArgument(int addr, int v) {
        if (featOkTst && casFeat_argument == null)
      jcas.throwFeatMissing("argument", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_argument, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticRoleRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_predicate = jcas.getRequiredFeatureDE(casType, "predicate", "org.apache.ctakes.typesystem.type.textsem.Predicate", featOkTst);
    casFeatCode_predicate  = (null == casFeat_predicate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_predicate).getCode();

 
    casFeat_argument = jcas.getRequiredFeatureDE(casType, "argument", "org.apache.ctakes.typesystem.type.textsem.SemanticArgument", featOkTst);
    casFeatCode_argument  = (null == casFeat_argument) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_argument).getCode();

  }
}



    