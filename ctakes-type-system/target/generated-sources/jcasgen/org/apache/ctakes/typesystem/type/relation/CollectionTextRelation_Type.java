
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class CollectionTextRelation_Type extends Relation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CollectionTextRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
 
  /** @generated */
  final Feature casFeat_members;
  /** @generated */
  final int     casFeatCode_members;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMembers(int addr) {
        if (featOkTst && casFeat_members == null)
      jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_members);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMembers(int addr, int v) {
        if (featOkTst && casFeat_members == null)
      jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_members, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CollectionTextRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_members = jcas.getRequiredFeatureDE(casType, "members", "uima.cas.FSList", featOkTst);
    casFeatCode_members  = (null == casFeat_members) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_members).getCode();

  }
}



    