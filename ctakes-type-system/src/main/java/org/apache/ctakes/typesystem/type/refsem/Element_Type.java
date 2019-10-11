
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** A basic semantic unit that refers to something in the real world, including Entities, Events, Attributes, Dates.  Element inherits from uima.cas.TOP to combine textual mentions of these real-world objects.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class Element_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Element.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.Element");
 
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
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ontologyConcept;
  /** @generated */
  final int     casFeatCode_ontologyConcept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOntologyConcept(int addr) {
        if (featOkTst && casFeat_ontologyConcept == null)
      jcas.throwFeatMissing("ontologyConcept", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConcept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOntologyConcept(int addr, int v) {
        if (featOkTst && casFeat_ontologyConcept == null)
      jcas.throwFeatMissing("ontologyConcept", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setRefValue(addr, casFeatCode_ontologyConcept, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mentions;
  /** @generated */
  final int     casFeatCode_mentions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMentions(int addr) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mentions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMentions(int addr, int v) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setRefValue(addr, casFeatCode_mentions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMentions(int addr, int i) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMentions(int addr, int i, int v) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.apache.ctakes.typesystem.type.refsem.Element");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, v);
  }
 
 
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
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getIntValue(addr, casFeatCode_discoveryTechnique);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDiscoveryTechnique(int addr, int v) {
        if (featOkTst && casFeat_discoveryTechnique == null)
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.refsem.Element");
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
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
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
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_conditional);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConditional(int addr, boolean v) {
        if (featOkTst && casFeat_conditional == null)
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_conditional, v);}
    
  
 
  /** @generated */
  final Feature casFeat_generic;
  /** @generated */
  final int     casFeatCode_generic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getGeneric(int addr) {
        if (featOkTst && casFeat_generic == null)
      jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_generic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneric(int addr, boolean v) {
        if (featOkTst && casFeat_generic == null)
      jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_generic, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subject;
  /** @generated */
  final int     casFeatCode_subject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubject(int addr) {
        if (featOkTst && casFeat_subject == null)
      jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubject(int addr, String v) {
        if (featOkTst && casFeat_subject == null)
      jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setStringValue(addr, casFeatCode_subject, v);}
    
  
 
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
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getIntValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, int v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.refsem.Element");
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
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getIntValue(addr, casFeatCode_uncertainty);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUncertainty(int addr, int v) {
        if (featOkTst && casFeat_uncertainty == null)
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setIntValue(addr, casFeatCode_uncertainty, v);}
    
  
 
  /** @generated */
  final Feature casFeat_historyOf;
  /** @generated */
  final int     casFeatCode_historyOf;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHistoryOf(int addr) {
        if (featOkTst && casFeat_historyOf == null)
      jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.refsem.Element");
    return ll_cas.ll_getIntValue(addr, casFeatCode_historyOf);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHistoryOf(int addr, int v) {
        if (featOkTst && casFeat_historyOf == null)
      jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.refsem.Element");
    ll_cas.ll_setIntValue(addr, casFeatCode_historyOf, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Element_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_ontologyConcept = jcas.getRequiredFeatureDE(casType, "ontologyConcept", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept", featOkTst);
    casFeatCode_ontologyConcept  = (null == casFeat_ontologyConcept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ontologyConcept).getCode();

 
    casFeat_mentions = jcas.getRequiredFeatureDE(casType, "mentions", "uima.cas.FSArray", featOkTst);
    casFeatCode_mentions  = (null == casFeat_mentions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mentions).getCode();

 
    casFeat_discoveryTechnique = jcas.getRequiredFeatureDE(casType, "discoveryTechnique", "uima.cas.Integer", featOkTst);
    casFeatCode_discoveryTechnique  = (null == casFeat_discoveryTechnique) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_discoveryTechnique).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_conditional = jcas.getRequiredFeatureDE(casType, "conditional", "uima.cas.Boolean", featOkTst);
    casFeatCode_conditional  = (null == casFeat_conditional) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conditional).getCode();

 
    casFeat_generic = jcas.getRequiredFeatureDE(casType, "generic", "uima.cas.Boolean", featOkTst);
    casFeatCode_generic  = (null == casFeat_generic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_generic).getCode();

 
    casFeat_subject = jcas.getRequiredFeatureDE(casType, "subject", "uima.cas.String", featOkTst);
    casFeatCode_subject  = (null == casFeat_subject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subject).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.Integer", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

 
    casFeat_uncertainty = jcas.getRequiredFeatureDE(casType, "uncertainty", "uima.cas.Integer", featOkTst);
    casFeatCode_uncertainty  = (null == casFeat_uncertainty) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uncertainty).getCode();

 
    casFeat_historyOf = jcas.getRequiredFeatureDE(casType, "historyOf", "uima.cas.Integer", featOkTst);
    casFeatCode_historyOf  = (null == casFeat_historyOf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_historyOf).getCode();

  }
}



    