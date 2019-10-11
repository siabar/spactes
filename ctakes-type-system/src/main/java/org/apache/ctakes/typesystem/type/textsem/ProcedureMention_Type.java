
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A text string that refers to a (Procedure) Event.  This is from the UMLS semantic group of Procedures (except that Laboratory procedures are separate).  Based on generic Clinical Element Models (CEMs)
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class ProcedureMention_Type extends EventMention_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ProcedureMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
 
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
      jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodyLaterality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodyLaterality(int addr, int v) {
        if (featOkTst && casFeat_bodyLaterality == null)
      jcas.throwFeatMissing("bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
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
      jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodySide);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodySide(int addr, int v) {
        if (featOkTst && casFeat_bodySide == null)
      jcas.throwFeatMissing("bodySide", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
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
      jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bodyLocation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBodyLocation(int addr, int v) {
        if (featOkTst && casFeat_bodyLocation == null)
      jcas.throwFeatMissing("bodyLocation", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_bodyLocation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_procedureDevice;
  /** @generated */
  final int     casFeatCode_procedureDevice;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getProcedureDevice(int addr) {
        if (featOkTst && casFeat_procedureDevice == null)
      jcas.throwFeatMissing("procedureDevice", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_procedureDevice);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProcedureDevice(int addr, int v) {
        if (featOkTst && casFeat_procedureDevice == null)
      jcas.throwFeatMissing("procedureDevice", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_procedureDevice, v);}
    
  
 
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
      jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_duration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDuration(int addr, int v) {
        if (featOkTst && casFeat_duration == null)
      jcas.throwFeatMissing("duration", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
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
      jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndTime(int addr, int v) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_endTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_method;
  /** @generated */
  final int     casFeatCode_method;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMethod(int addr) {
        if (featOkTst && casFeat_method == null)
      jcas.throwFeatMissing("method", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_method);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMethod(int addr, int v) {
        if (featOkTst && casFeat_method == null)
      jcas.throwFeatMissing("method", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_method, v);}
    
  
 
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
      jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartTime(int addr, int v) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
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
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_relativeTemporalContext);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelativeTemporalContext(int addr, int v) {
        if (featOkTst && casFeat_relativeTemporalContext == null)
      jcas.throwFeatMissing("relativeTemporalContext", "org.apache.ctakes.typesystem.type.textsem.ProcedureMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_relativeTemporalContext, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ProcedureMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_bodyLaterality = jcas.getRequiredFeatureDE(casType, "bodyLaterality", "org.apache.ctakes.typesystem.type.textsem.BodyLateralityModifier", featOkTst);
    casFeatCode_bodyLaterality  = (null == casFeat_bodyLaterality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodyLaterality).getCode();

 
    casFeat_bodySide = jcas.getRequiredFeatureDE(casType, "bodySide", "org.apache.ctakes.typesystem.type.textsem.BodySideModifier", featOkTst);
    casFeatCode_bodySide  = (null == casFeat_bodySide) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodySide).getCode();

 
    casFeat_bodyLocation = jcas.getRequiredFeatureDE(casType, "bodyLocation", "org.apache.ctakes.typesystem.type.relation.LocationOfTextRelation", featOkTst);
    casFeatCode_bodyLocation  = (null == casFeat_bodyLocation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bodyLocation).getCode();

 
    casFeat_procedureDevice = jcas.getRequiredFeatureDE(casType, "procedureDevice", "org.apache.ctakes.typesystem.type.textsem.ProcedureDeviceModifier", featOkTst);
    casFeatCode_procedureDevice  = (null == casFeat_procedureDevice) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_procedureDevice).getCode();

 
    casFeat_duration = jcas.getRequiredFeatureDE(casType, "duration", "org.apache.ctakes.typesystem.type.relation.TemporalTextRelation", featOkTst);
    casFeatCode_duration  = (null == casFeat_duration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_duration).getCode();

 
    casFeat_endTime = jcas.getRequiredFeatureDE(casType, "endTime", "org.apache.ctakes.typesystem.type.textsem.TimeMention", featOkTst);
    casFeatCode_endTime  = (null == casFeat_endTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endTime).getCode();

 
    casFeat_method = jcas.getRequiredFeatureDE(casType, "method", "org.apache.ctakes.typesystem.type.textsem.ProcedureMethodModifier", featOkTst);
    casFeatCode_method  = (null == casFeat_method) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_method).getCode();

 
    casFeat_startTime = jcas.getRequiredFeatureDE(casType, "startTime", "org.apache.ctakes.typesystem.type.textsem.TimeMention", featOkTst);
    casFeatCode_startTime  = (null == casFeat_startTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startTime).getCode();

 
    casFeat_relativeTemporalContext = jcas.getRequiredFeatureDE(casType, "relativeTemporalContext", "org.apache.ctakes.typesystem.type.relation.TemporalTextRelation", featOkTst);
    casFeatCode_relativeTemporalContext  = (null == casFeat_relativeTemporalContext) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relativeTemporalContext).getCode();

  }
}



    