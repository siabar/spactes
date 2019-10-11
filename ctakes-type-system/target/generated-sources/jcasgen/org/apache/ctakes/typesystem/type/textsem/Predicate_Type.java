
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Predicates are typically verbs and may participate in SemanticRoleRelations.  Follows PropBank standards with a few clinical additions.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class Predicate_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Predicate.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.Predicate");
 
  /** @generated */
  final Feature casFeat_relations;
  /** @generated */
  final int     casFeatCode_relations;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRelations(int addr) {
        if (featOkTst && casFeat_relations == null)
      jcas.throwFeatMissing("relations", "org.apache.ctakes.typesystem.type.textsem.Predicate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_relations);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelations(int addr, int v) {
        if (featOkTst && casFeat_relations == null)
      jcas.throwFeatMissing("relations", "org.apache.ctakes.typesystem.type.textsem.Predicate");
    ll_cas.ll_setRefValue(addr, casFeatCode_relations, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frameSet;
  /** @generated */
  final int     casFeatCode_frameSet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrameSet(int addr) {
        if (featOkTst && casFeat_frameSet == null)
      jcas.throwFeatMissing("frameSet", "org.apache.ctakes.typesystem.type.textsem.Predicate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_frameSet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrameSet(int addr, String v) {
        if (featOkTst && casFeat_frameSet == null)
      jcas.throwFeatMissing("frameSet", "org.apache.ctakes.typesystem.type.textsem.Predicate");
    ll_cas.ll_setStringValue(addr, casFeatCode_frameSet, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Predicate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relations = jcas.getRequiredFeatureDE(casType, "relations", "uima.cas.FSList", featOkTst);
    casFeatCode_relations  = (null == casFeat_relations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relations).getCode();

 
    casFeat_frameSet = jcas.getRequiredFeatureDE(casType, "frameSet", "uima.cas.String", featOkTst);
    casFeatCode_frameSet  = (null == casFeat_frameSet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frameSet).getCode();

  }
}



    