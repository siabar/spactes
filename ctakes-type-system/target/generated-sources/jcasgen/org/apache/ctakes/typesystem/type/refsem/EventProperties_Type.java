
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** A set of mostly temporal properties that are unique to Events.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class EventProperties_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EventProperties.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.EventProperties");
 
  /** @generated */
  final Feature casFeat_contextualModality;
  /** @generated */
  final int     casFeatCode_contextualModality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContextualModality(int addr) {
        if (featOkTst && casFeat_contextualModality == null)
      jcas.throwFeatMissing("contextualModality", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contextualModality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextualModality(int addr, String v) {
        if (featOkTst && casFeat_contextualModality == null)
      jcas.throwFeatMissing("contextualModality", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_contextualModality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_contextualAspect;
  /** @generated */
  final int     casFeatCode_contextualAspect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContextualAspect(int addr) {
        if (featOkTst && casFeat_contextualAspect == null)
      jcas.throwFeatMissing("contextualAspect", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contextualAspect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextualAspect(int addr, String v) {
        if (featOkTst && casFeat_contextualAspect == null)
      jcas.throwFeatMissing("contextualAspect", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_contextualAspect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_permanence;
  /** @generated */
  final int     casFeatCode_permanence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPermanence(int addr) {
        if (featOkTst && casFeat_permanence == null)
      jcas.throwFeatMissing("permanence", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_permanence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPermanence(int addr, String v) {
        if (featOkTst && casFeat_permanence == null)
      jcas.throwFeatMissing("permanence", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_permanence, v);}
    
  
 
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
      jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategory(int addr, String v) {
        if (featOkTst && casFeat_category == null)
      jcas.throwFeatMissing("category", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_category, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aspect;
  /** @generated */
  final int     casFeatCode_aspect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAspect(int addr) {
        if (featOkTst && casFeat_aspect == null)
      jcas.throwFeatMissing("aspect", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aspect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAspect(int addr, String v) {
        if (featOkTst && casFeat_aspect == null)
      jcas.throwFeatMissing("aspect", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_aspect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_docTimeRel;
  /** @generated */
  final int     casFeatCode_docTimeRel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocTimeRel(int addr) {
        if (featOkTst && casFeat_docTimeRel == null)
      jcas.throwFeatMissing("docTimeRel", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_docTimeRel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocTimeRel(int addr, String v) {
        if (featOkTst && casFeat_docTimeRel == null)
      jcas.throwFeatMissing("docTimeRel", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_docTimeRel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_degree;
  /** @generated */
  final int     casFeatCode_degree;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDegree(int addr) {
        if (featOkTst && casFeat_degree == null)
      jcas.throwFeatMissing("degree", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getStringValue(addr, casFeatCode_degree);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDegree(int addr, String v) {
        if (featOkTst && casFeat_degree == null)
      jcas.throwFeatMissing("degree", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setStringValue(addr, casFeatCode_degree, v);}
    
  
 
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
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    return ll_cas.ll_getIntValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, int v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.EventProperties");
    ll_cas.ll_setIntValue(addr, casFeatCode_polarity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EventProperties_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_contextualModality = jcas.getRequiredFeatureDE(casType, "contextualModality", "uima.cas.String", featOkTst);
    casFeatCode_contextualModality  = (null == casFeat_contextualModality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextualModality).getCode();

 
    casFeat_contextualAspect = jcas.getRequiredFeatureDE(casType, "contextualAspect", "uima.cas.String", featOkTst);
    casFeatCode_contextualAspect  = (null == casFeat_contextualAspect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextualAspect).getCode();

 
    casFeat_permanence = jcas.getRequiredFeatureDE(casType, "permanence", "uima.cas.String", featOkTst);
    casFeatCode_permanence  = (null == casFeat_permanence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_permanence).getCode();

 
    casFeat_category = jcas.getRequiredFeatureDE(casType, "category", "uima.cas.String", featOkTst);
    casFeatCode_category  = (null == casFeat_category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_category).getCode();

 
    casFeat_aspect = jcas.getRequiredFeatureDE(casType, "aspect", "uima.cas.String", featOkTst);
    casFeatCode_aspect  = (null == casFeat_aspect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aspect).getCode();

 
    casFeat_docTimeRel = jcas.getRequiredFeatureDE(casType, "docTimeRel", "uima.cas.String", featOkTst);
    casFeatCode_docTimeRel  = (null == casFeat_docTimeRel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docTimeRel).getCode();

 
    casFeat_degree = jcas.getRequiredFeatureDE(casType, "degree", "uima.cas.String", featOkTst);
    casFeatCode_degree  = (null == casFeat_degree) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_degree).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.Integer", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

  }
}



    