
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Any span of text that has been discovered or flagged for some reason, such as a Named Entity.  Allows for mapping to an ontology.  Generalized from cTAKES: org.apache.ctakes.typesystem.type.IdentifiedAnnotation.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class IdentifiedAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = IdentifiedAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
 
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
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ontologyConceptArr;
  /** @generated */
  final int     casFeatCode_ontologyConceptArr;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOntologyConceptArr(int addr) {
        if (featOkTst && casFeat_ontologyConceptArr == null)
      jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOntologyConceptArr(int addr, int v) {
        if (featOkTst && casFeat_ontologyConceptArr == null)
      jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ontologyConceptArr, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOntologyConceptArr(int addr, int i) {
        if (featOkTst && casFeat_ontologyConceptArr == null)
      jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOntologyConceptArr(int addr, int i, int v) {
        if (featOkTst && casFeat_ontologyConceptArr == null)
      jcas.throwFeatMissing("ontologyConceptArr", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ontologyConceptArr), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_typeID;
  /** @generated */
  final int     casFeatCode_typeID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTypeID(int addr) {
        if (featOkTst && casFeat_typeID == null)
      jcas.throwFeatMissing("typeID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_typeID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypeID(int addr, int v) {
        if (featOkTst && casFeat_typeID == null)
      jcas.throwFeatMissing("typeID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_typeID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_segmentID;
  /** @generated */
  final int     casFeatCode_segmentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSegmentID(int addr) {
        if (featOkTst && casFeat_segmentID == null)
      jcas.throwFeatMissing("segmentID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_segmentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSegmentID(int addr, String v) {
        if (featOkTst && casFeat_segmentID == null)
      jcas.throwFeatMissing("segmentID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_segmentID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentenceID;
  /** @generated */
  final int     casFeatCode_sentenceID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceID, v);}
    
  
 
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
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_discoveryTechnique);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDiscoveryTechnique(int addr, int v) {
        if (featOkTst && casFeat_discoveryTechnique == null)
      jcas.throwFeatMissing("discoveryTechnique", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_discoveryTechnique, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  
 
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
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, int v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
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
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_uncertainty);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUncertainty(int addr, int v) {
        if (featOkTst && casFeat_uncertainty == null)
      jcas.throwFeatMissing("uncertainty", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
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
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_conditional);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConditional(int addr, boolean v) {
        if (featOkTst && casFeat_conditional == null)
      jcas.throwFeatMissing("conditional", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
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
      jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_generic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneric(int addr, boolean v) {
        if (featOkTst && casFeat_generic == null)
      jcas.throwFeatMissing("generic", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
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
      jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubject(int addr, String v) {
        if (featOkTst && casFeat_subject == null)
      jcas.throwFeatMissing("subject", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_subject, v);}
    
  
 
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
      jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_historyOf);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHistoryOf(int addr, int v) {
        if (featOkTst && casFeat_historyOf == null)
      jcas.throwFeatMissing("historyOf", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_historyOf, v);}
    
  
 
  /** @generated */
  final Feature casFeat_originalText;
  /** @generated */
  final int     casFeatCode_originalText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOriginalText(int addr) {
        if (featOkTst && casFeat_originalText == null)
      jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_originalText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOriginalText(int addr, int v) {
        if (featOkTst && casFeat_originalText == null)
      jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_originalText, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOriginalText(int addr, int i) {
        if (featOkTst && casFeat_originalText == null)
      jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOriginalText(int addr, int i, int v) {
        if (featOkTst && casFeat_originalText == null)
      jcas.throwFeatMissing("originalText", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_originalText), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public IdentifiedAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_ontologyConceptArr = jcas.getRequiredFeatureDE(casType, "ontologyConceptArr", "uima.cas.FSArray", featOkTst);
    casFeatCode_ontologyConceptArr  = (null == casFeat_ontologyConceptArr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ontologyConceptArr).getCode();

 
    casFeat_typeID = jcas.getRequiredFeatureDE(casType, "typeID", "uima.cas.Integer", featOkTst);
    casFeatCode_typeID  = (null == casFeat_typeID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_typeID).getCode();

 
    casFeat_segmentID = jcas.getRequiredFeatureDE(casType, "segmentID", "uima.cas.String", featOkTst);
    casFeatCode_segmentID  = (null == casFeat_segmentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_segmentID).getCode();

 
    casFeat_sentenceID = jcas.getRequiredFeatureDE(casType, "sentenceID", "uima.cas.String", featOkTst);
    casFeatCode_sentenceID  = (null == casFeat_sentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceID).getCode();

 
    casFeat_discoveryTechnique = jcas.getRequiredFeatureDE(casType, "discoveryTechnique", "uima.cas.Integer", featOkTst);
    casFeatCode_discoveryTechnique  = (null == casFeat_discoveryTechnique) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_discoveryTechnique).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.Integer", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

 
    casFeat_uncertainty = jcas.getRequiredFeatureDE(casType, "uncertainty", "uima.cas.Integer", featOkTst);
    casFeatCode_uncertainty  = (null == casFeat_uncertainty) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uncertainty).getCode();

 
    casFeat_conditional = jcas.getRequiredFeatureDE(casType, "conditional", "uima.cas.Boolean", featOkTst);
    casFeatCode_conditional  = (null == casFeat_conditional) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conditional).getCode();

 
    casFeat_generic = jcas.getRequiredFeatureDE(casType, "generic", "uima.cas.Boolean", featOkTst);
    casFeatCode_generic  = (null == casFeat_generic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_generic).getCode();

 
    casFeat_subject = jcas.getRequiredFeatureDE(casType, "subject", "uima.cas.String", featOkTst);
    casFeatCode_subject  = (null == casFeat_subject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subject).getCode();

 
    casFeat_historyOf = jcas.getRequiredFeatureDE(casType, "historyOf", "uima.cas.Integer", featOkTst);
    casFeatCode_historyOf  = (null == casFeat_historyOf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_historyOf).getCode();

 
    casFeat_originalText = jcas.getRequiredFeatureDE(casType, "originalText", "uima.cas.FSArray", featOkTst);
    casFeatCode_originalText  = (null == casFeat_originalText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_originalText).getCode();

  }
}



    