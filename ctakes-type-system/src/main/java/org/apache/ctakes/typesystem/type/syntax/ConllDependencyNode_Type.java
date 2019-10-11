
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A dependency parser node in the CONLL-X format, namely, where each node is a token with 10 fields.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class ConllDependencyNode_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ConllDependencyNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_form;
  /** @generated */
  final int     casFeatCode_form;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getForm(int addr) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_form);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setForm(int addr, String v) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_form, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lemma;
  /** @generated */
  final int     casFeatCode_lemma;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLemma(int addr) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lemma);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLemma(int addr, String v) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_lemma, v);}
    
  
 
  /** @generated */
  final Feature casFeat_cpostag;
  /** @generated */
  final int     casFeatCode_cpostag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCpostag(int addr) {
        if (featOkTst && casFeat_cpostag == null)
      jcas.throwFeatMissing("cpostag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cpostag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCpostag(int addr, String v) {
        if (featOkTst && casFeat_cpostag == null)
      jcas.throwFeatMissing("cpostag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_cpostag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_postag;
  /** @generated */
  final int     casFeatCode_postag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPostag(int addr) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_postag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPostag(int addr, String v) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_postag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_feats;
  /** @generated */
  final int     casFeatCode_feats;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFeats(int addr) {
        if (featOkTst && casFeat_feats == null)
      jcas.throwFeatMissing("feats", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_feats);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeats(int addr, String v) {
        if (featOkTst && casFeat_feats == null)
      jcas.throwFeatMissing("feats", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_feats, v);}
    
  
 
  /** @generated */
  final Feature casFeat_head;
  /** @generated */
  final int     casFeatCode_head;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHead(int addr) {
        if (featOkTst && casFeat_head == null)
      jcas.throwFeatMissing("head", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getRefValue(addr, casFeatCode_head);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHead(int addr, int v) {
        if (featOkTst && casFeat_head == null)
      jcas.throwFeatMissing("head", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setRefValue(addr, casFeatCode_head, v);}
    
  
 
  /** @generated */
  final Feature casFeat_deprel;
  /** @generated */
  final int     casFeatCode_deprel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDeprel(int addr) {
        if (featOkTst && casFeat_deprel == null)
      jcas.throwFeatMissing("deprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_deprel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDeprel(int addr, String v) {
        if (featOkTst && casFeat_deprel == null)
      jcas.throwFeatMissing("deprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_deprel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_phead;
  /** @generated */
  final int     casFeatCode_phead;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPhead(int addr) {
        if (featOkTst && casFeat_phead == null)
      jcas.throwFeatMissing("phead", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phead);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhead(int addr, int v) {
        if (featOkTst && casFeat_phead == null)
      jcas.throwFeatMissing("phead", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setRefValue(addr, casFeatCode_phead, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pdeprel;
  /** @generated */
  final int     casFeatCode_pdeprel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPdeprel(int addr) {
        if (featOkTst && casFeat_pdeprel == null)
      jcas.throwFeatMissing("pdeprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pdeprel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPdeprel(int addr, String v) {
        if (featOkTst && casFeat_pdeprel == null)
      jcas.throwFeatMissing("pdeprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_pdeprel, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ConllDependencyNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_form = jcas.getRequiredFeatureDE(casType, "form", "uima.cas.String", featOkTst);
    casFeatCode_form  = (null == casFeat_form) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_form).getCode();

 
    casFeat_lemma = jcas.getRequiredFeatureDE(casType, "lemma", "uima.cas.String", featOkTst);
    casFeatCode_lemma  = (null == casFeat_lemma) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lemma).getCode();

 
    casFeat_cpostag = jcas.getRequiredFeatureDE(casType, "cpostag", "uima.cas.String", featOkTst);
    casFeatCode_cpostag  = (null == casFeat_cpostag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cpostag).getCode();

 
    casFeat_postag = jcas.getRequiredFeatureDE(casType, "postag", "uima.cas.String", featOkTst);
    casFeatCode_postag  = (null == casFeat_postag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_postag).getCode();

 
    casFeat_feats = jcas.getRequiredFeatureDE(casType, "feats", "uima.cas.String", featOkTst);
    casFeatCode_feats  = (null == casFeat_feats) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feats).getCode();

 
    casFeat_head = jcas.getRequiredFeatureDE(casType, "head", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode", featOkTst);
    casFeatCode_head  = (null == casFeat_head) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_head).getCode();

 
    casFeat_deprel = jcas.getRequiredFeatureDE(casType, "deprel", "uima.cas.String", featOkTst);
    casFeatCode_deprel  = (null == casFeat_deprel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_deprel).getCode();

 
    casFeat_phead = jcas.getRequiredFeatureDE(casType, "phead", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode", featOkTst);
    casFeatCode_phead  = (null == casFeat_phead) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phead).getCode();

 
    casFeat_pdeprel = jcas.getRequiredFeatureDE(casType, "pdeprel", "uima.cas.String", featOkTst);
    casFeatCode_pdeprel  = (null == casFeat_pdeprel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pdeprel).getCode();

  }
}



    