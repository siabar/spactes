
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** An indication of explicit mentioning of a past history. The indicator captures only very explicit mentions of historicity.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class HistoryOfModifier_Type extends Modifier_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = HistoryOfModifier.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.HistoryOfModifier");
 
  /** @generated */
  final Feature casFeat_indicated;
  /** @generated */
  final int     casFeatCode_indicated;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIndicated(int addr) {
        if (featOkTst && casFeat_indicated == null)
      jcas.throwFeatMissing("indicated", "org.apache.ctakes.typesystem.type.textsem.HistoryOfModifier");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_indicated);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndicated(int addr, boolean v) {
        if (featOkTst && casFeat_indicated == null)
      jcas.throwFeatMissing("indicated", "org.apache.ctakes.typesystem.type.textsem.HistoryOfModifier");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_indicated, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public HistoryOfModifier_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_indicated = jcas.getRequiredFeatureDE(casType, "indicated", "uima.cas.Boolean", featOkTst);
    casFeatCode_indicated  = (null == casFeat_indicated) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indicated).getCode();

  }
}



    