
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** This is an Event from the UMLS semantic group of Disorders (except that Sign and Symptom types are separate).  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class DiseaseDisorder_Type extends Event_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DiseaseDisorder.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
 
  /** @generated */
  final Feature casFeat_alleviatingFactor;
  /** @generated */
  final int     casFeatCode_alleviatingFactor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAlleviatingFactor(int addr) {
        if (featOkTst && casFeat_alleviatingFactor == null)
      jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_alleviatingFactor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAlleviatingFactor(int addr, int v) {
        if (featOkTst && casFeat_alleviatingFactor == null)
      jcas.throwFeatMissing("alleviatingFactor", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_alleviatingFactor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_associatedSignSymptom;
  /** @generated */
  final int     casFeatCode_associatedSignSymptom;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAssociatedSignSymptom(int addr) {
        if (featOkTst && casFeat_associatedSignSymptom == null)
      jcas.throwFeatMissing("associatedSignSymptom", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_associatedSignSymptom);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAssociatedSignSymptom(int addr, int v) {
        if (featOkTst && casFeat_associatedSignSymptom == null)
      jcas.throwFeatMissing("associatedSignSymptom", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_associatedSignSymptom, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bodyLaterality;
  /** @generated */
  final int     casFeatCode_bodyLaterality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBodyLaterality(int addr) {
        if (featOkTst && casFeat_bodyLaterality == null)
      jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodyLaterality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodyLaterality(int addr, int v) {
        if (featOkTst && casFeat_bodyLaterality == null)
      jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_bodyLaterality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bodySide;
  /** @generated */
  final int     casFeatCode_bodySide;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBodySide(int addr) {
        if (featOkTst && casFeat_bodySide == null)
      jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodySide);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodySide(int addr, int v) {
        if (featOkTst && casFeat_bodySide == null)
      jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_bodySide, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bodyLocation;
  /** @generated */
  final int     casFeatCode_bodyLocation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBodyLocation(int addr) {
        if (featOkTst && casFeat_bodyLocation == null)
      jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodyLocation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodyLocation(int addr, int v) {
        if (featOkTst && casFeat_bodyLocation == null)
      jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_bodyLocation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_course;
  /** @generated */
  final int     casFeatCode_course;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCourse(int addr) {
        if (featOkTst && casFeat_course == null)
      jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_course);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCourse(int addr, int v) {
        if (featOkTst && casFeat_course == null)
      jcas.throwFeatMissing("course", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_course, v);}
    
  
 
  /** @generated */
  final Feature casFeat_duration;
  /** @generated */
  final int     casFeatCode_duration;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDuration(int addr) {
        if (featOkTst && casFeat_duration == null)
      jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_duration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDuration(int addr, int v) {
        if (featOkTst && casFeat_duration == null)
      jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_duration, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endTime;
  /** @generated */
  final int     casFeatCode_endTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndTime(int addr) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndTime(int addr, int v) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_endTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_exacerbatingFactor;
  /** @generated */
  final int     casFeatCode_exacerbatingFactor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getExacerbatingFactor(int addr) {
        if (featOkTst && casFeat_exacerbatingFactor == null)
      jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_exacerbatingFactor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExacerbatingFactor(int addr, int v) {
        if (featOkTst && casFeat_exacerbatingFactor == null)
      jcas.throwFeatMissing("exacerbatingFactor", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_exacerbatingFactor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startTime;
  /** @generated */
  final int     casFeatCode_startTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartTime(int addr) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartTime(int addr, int v) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_startTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_relativeTemporalContext;
  /** @generated */
  final int     casFeatCode_relativeTemporalContext;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRelativeTemporalContext(int addr) {
        if (featOkTst && casFeat_relativeTemporalContext == null)
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    return ll_cas.ll_getRefValue(addr, casFeatCode_relativeTemporalContext);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelativeTemporalContext(int addr, int v) {
        if (featOkTst && casFeat_relativeTemporalContext == null)
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.refsem.DiseaseDisorder");
    ll_cas.ll_setRefValue(addr, casFeatCode_relativeTemporalContext, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DiseaseDisorder_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_alleviatingFactor = jcas.getRequiredFeatureDE(casType, "alleviatingFactor", "org.apache.ctakes.typesystem.type.relation.ElementRelation", featOkTst);
    casFeatCode_alleviatingFactor  = (null == casFeat_alleviatingFactor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_alleviatingFactor).getCode();

 
    casFeat_associatedSignSymptom = jcas.getRequiredFeatureDE(casType, "associatedSignSymptom", "org.apache.ctakes.typesystem.type.relation.ManifestationOf", featOkTst);
    casFeatCode_associatedSignSymptom  = (null == casFeat_associatedSignSymptom) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_associatedSignSymptom).getCode();

 
    casFeat_bodyLaterality = jcas.getRequiredFeatureDE(casType, "bodyLaterality", "org.apache.ctakes.typesystem.type.refsem.BodyLaterality", featOkTst);
    casFeatCode_bodyLaterality  = (null == casFeat_bodyLaterality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodyLaterality).getCode();

 
    casFeat_bodySide = jcas.getRequiredFeatureDE(casType, "bodySide", "org.apache.ctakes.typesystem.type.refsem.BodySide", featOkTst);
    casFeatCode_bodySide  = (null == casFeat_bodySide) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodySide).getCode();

 
    casFeat_bodyLocation = jcas.getRequiredFeatureDE(casType, "bodyLocation", "org.apache.ctakes.typesystem.type.relation.LocationOf", featOkTst);
    casFeatCode_bodyLocation  = (null == casFeat_bodyLocation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodyLocation).getCode();

 
    casFeat_course = jcas.getRequiredFeatureDE(casType, "course", "org.apache.ctakes.typesystem.type.refsem.Course", featOkTst);
    casFeatCode_course  = (null == casFeat_course) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_course).getCode();

 
    casFeat_duration = jcas.getRequiredFeatureDE(casType, "duration", "org.apache.ctakes.typesystem.type.relation.TemporalRelation", featOkTst);
    casFeatCode_duration  = (null == casFeat_duration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_duration).getCode();

 
    casFeat_endTime = jcas.getRequiredFeatureDE(casType, "endTime", "org.apache.ctakes.typesystem.type.refsem.Time", featOkTst);
    casFeatCode_endTime  = (null == casFeat_endTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endTime).getCode();

 
    casFeat_exacerbatingFactor = jcas.getRequiredFeatureDE(casType, "exacerbatingFactor", "org.apache.ctakes.typesystem.type.relation.ElementRelation", featOkTst);
    casFeatCode_exacerbatingFactor  = (null == casFeat_exacerbatingFactor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_exacerbatingFactor).getCode();

 
    casFeat_startTime = jcas.getRequiredFeatureDE(casType, "startTime", "org.apache.ctakes.typesystem.type.refsem.Time", featOkTst);
    casFeatCode_startTime  = (null == casFeat_startTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startTime).getCode();

 
    casFeat_relativeTemporalContext = jcas.getRequiredFeatureDE(casType, "relativeTemporalContext", "org.apache.ctakes.typesystem.type.relation.TemporalRelation", featOkTst);
    casFeatCode_relativeTemporalContext  = (null == casFeat_relativeTemporalContext) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relativeTemporalContext).getCode();

  }
}



    