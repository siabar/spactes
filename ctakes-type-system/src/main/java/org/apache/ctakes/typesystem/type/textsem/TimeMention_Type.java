
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A text string (IdentifiedAnnotation) that refers to a Time (i.e., TIMEX3).
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class TimeMention_Type extends IdentifiedAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.TimeMention");
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, int v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */
  final Feature casFeat_time;
  /** @generated */
  final int     casFeatCode_time;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTime(int addr) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_time);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTime(int addr, int v) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_time, v);}
    
  
 
  /** @generated */
  final Feature casFeat_timeClass;
  /** @generated */
  final int     casFeatCode_timeClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTimeClass(int addr) {
        if (featOkTst && casFeat_timeClass == null)
      jcas.throwFeatMissing("timeClass", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_timeClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimeClass(int addr, String v) {
        if (featOkTst && casFeat_timeClass == null)
      jcas.throwFeatMissing("timeClass", "org.apache.ctakes.typesystem.type.textsem.TimeMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_timeClass, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "org.apache.ctakes.typesystem.type.refsem.Date", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_time = jcas.getRequiredFeatureDE(casType, "time", "org.apache.ctakes.typesystem.type.refsem.Time", featOkTst);
    casFeatCode_time  = (null == casFeat_time) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_time).getCode();

 
    casFeat_timeClass = jcas.getRequiredFeatureDE(casType, "timeClass", "uima.cas.String", featOkTst);
    casFeatCode_timeClass  = (null == casFeat_timeClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timeClass).getCode();

  }
}



    