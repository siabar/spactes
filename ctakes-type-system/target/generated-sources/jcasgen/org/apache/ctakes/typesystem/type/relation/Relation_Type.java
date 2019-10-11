
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** A superclass for semantic relationships between Elements.  For example, one might consider TemporalRelations or UMLSRelations between a Medication and a Disorder.  The "category" feature indicates what kind of relation it is.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class Relation_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Relation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.relation.Relation");
 
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
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_category;
  /** @generated */
  final int     casFeatCode_category;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCategory(int addr) {
        if (featOkTst && casFeat_category == null)
      jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategory(int addr, String v) {
        if (featOkTst && casFeat_category == null)
      jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setStringValue(addr, casFeatCode_category, v);}
    
  
 
  /** @generated */
  final Feature casFeat_discoveryTechnique;
  /** @generated */
  final int     casFeatCode_discoveryTechnique;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDiscoveryTechnique(int addr) {
        if (featOkTst && casFeat_discoveryTechnique == null)
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_discoveryTechnique);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDiscoveryTechnique(int addr, int v) {
        if (featOkTst && casFeat_discoveryTechnique == null)
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setIntValue(addr, casFeatCode_discoveryTechnique, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_polarity;
  /** @generated */
  final int     casFeatCode_polarity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPolarity(int addr) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, int v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setIntValue(addr, casFeatCode_polarity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_uncertainty;
  /** @generated */
  final int     casFeatCode_uncertainty;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUncertainty(int addr) {
        if (featOkTst && casFeat_uncertainty == null)
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_uncertainty);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUncertainty(int addr, int v) {
        if (featOkTst && casFeat_uncertainty == null)
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setIntValue(addr, casFeatCode_uncertainty, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conditional;
  /** @generated */
  final int     casFeatCode_conditional;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getConditional(int addr) {
        if (featOkTst && casFeat_conditional == null)
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.relation.Relation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_conditional);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConditional(int addr, boolean v) {
        if (featOkTst && casFeat_conditional == null)
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.relation.Relation");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_conditional, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Relation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_category = jcas.getRequiredFeatureDE(casType, "category", "uima.cas.String", featOkTst);
    casFeatCode_category  = (null == casFeat_category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_category).getCode();

 
    casFeat_discoveryTechnique = jcas.getRequiredFeatureDE(casType, "discoveryTechnique", "uima.cas.Integer", featOkTst);
    casFeatCode_discoveryTechnique  = (null == casFeat_discoveryTechnique) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_discoveryTechnique).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.Integer", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

 
    casFeat_uncertainty = jcas.getRequiredFeatureDE(casType, "uncertainty", "uima.cas.Integer", featOkTst);
    casFeatCode_uncertainty  = (null == casFeat_uncertainty) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uncertainty).getCode();

 
    casFeat_conditional = jcas.getRequiredFeatureDE(casType, "conditional", "uima.cas.Boolean", featOkTst);
    casFeatCode_conditional  = (null == casFeat_conditional) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conditional).getCode();

  }
}



    