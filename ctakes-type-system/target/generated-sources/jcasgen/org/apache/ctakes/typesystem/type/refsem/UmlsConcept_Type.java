
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Concepts in the Unified Medical Language System (UMLS) Metathesaurus have a concept unique identifier (CUI) and a type unique identifier (TUI, i.e., semantic type) which are curated, normalized codes. For example, "pain" would have a cui=C0030193 and tui=T184.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.UmlsConcept
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class UmlsConcept_Type extends OntologyConcept_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UmlsConcept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
 
  /** @generated */
  final Feature casFeat_cui;
  /** @generated */
  final int     casFeatCode_cui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCui(int addr) {
        if (featOkTst && casFeat_cui == null)
      jcas.throwFeatMissing("cui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCui(int addr, String v) {
        if (featOkTst && casFeat_cui == null)
      jcas.throwFeatMissing("cui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_cui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tui;
  /** @generated */
  final int     casFeatCode_tui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTui(int addr) {
        if (featOkTst && casFeat_tui == null)
      jcas.throwFeatMissing("tui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTui(int addr, String v) {
        if (featOkTst && casFeat_tui == null)
      jcas.throwFeatMissing("tui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_tui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preferredText;
  /** @generated */
  final int     casFeatCode_preferredText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPreferredText(int addr) {
        if (featOkTst && casFeat_preferredText == null)
      jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_preferredText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPreferredText(int addr, String v) {
        if (featOkTst && casFeat_preferredText == null)
      jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_preferredText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UmlsConcept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_cui = jcas.getRequiredFeatureDE(casType, "cui", "uima.cas.String", featOkTst);
    casFeatCode_cui  = (null == casFeat_cui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cui).getCode();

 
    casFeat_tui = jcas.getRequiredFeatureDE(casType, "tui", "uima.cas.String", featOkTst);
    casFeatCode_tui  = (null == casFeat_tui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tui).getCode();

 
    casFeat_preferredText = jcas.getRequiredFeatureDE(casType, "preferredText", "uima.cas.String", featOkTst);
    casFeatCode_preferredText  = (null == casFeat_preferredText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preferredText).getCode();

  }
}



    