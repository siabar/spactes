
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Ontologies (e.g., SNOMED-CT) provide an expert semantic representation for concepts. They typically assign a code to a concept and normalize across various textual representations of that concept.  
IdentifiedAnnotation and Elements may point to these normalized concept representations to indicate clinical concepts.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.OntologyConcept
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class OntologyConcept_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OntologyConcept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
 
  /** @generated */
  final Feature casFeat_codingScheme;
  /** @generated */
  final int     casFeatCode_codingScheme;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCodingScheme(int addr) {
        if (featOkTst && casFeat_codingScheme == null)
      jcas.throwFeatMissing("codingScheme", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_codingScheme);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCodingScheme(int addr, String v) {
        if (featOkTst && casFeat_codingScheme == null)
      jcas.throwFeatMissing("codingScheme", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_codingScheme, v);}
    
  
 
  /** @generated */
  final Feature casFeat_code;
  /** @generated */
  final int     casFeatCode_code;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCode(int addr) {
        if (featOkTst && casFeat_code == null)
      jcas.throwFeatMissing("code", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_code);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCode(int addr, String v) {
        if (featOkTst && casFeat_code == null)
      jcas.throwFeatMissing("code", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_code, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oid;
  /** @generated */
  final int     casFeatCode_oid;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOid(int addr) {
        if (featOkTst && casFeat_oid == null)
      jcas.throwFeatMissing("oid", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oid);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOid(int addr, String v) {
        if (featOkTst && casFeat_oid == null)
      jcas.throwFeatMissing("oid", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_oid, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oui;
  /** @generated */
  final int     casFeatCode_oui;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOui(int addr) {
        if (featOkTst && casFeat_oui == null)
      jcas.throwFeatMissing("oui", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oui);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOui(int addr, String v) {
        if (featOkTst && casFeat_oui == null)
      jcas.throwFeatMissing("oui", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setStringValue(addr, casFeatCode_oui, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_disambiguated;
  /** @generated */
  final int     casFeatCode_disambiguated;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getDisambiguated(int addr) {
        if (featOkTst && casFeat_disambiguated == null)
      jcas.throwFeatMissing("disambiguated", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_disambiguated);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisambiguated(int addr, boolean v) {
        if (featOkTst && casFeat_disambiguated == null)
      jcas.throwFeatMissing("disambiguated", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_disambiguated, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OntologyConcept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_codingScheme = jcas.getRequiredFeatureDE(casType, "codingScheme", "uima.cas.String", featOkTst);
    casFeatCode_codingScheme  = (null == casFeat_codingScheme) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_codingScheme).getCode();

 
    casFeat_code = jcas.getRequiredFeatureDE(casType, "code", "uima.cas.String", featOkTst);
    casFeatCode_code  = (null == casFeat_code) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_code).getCode();

 
    casFeat_oid = jcas.getRequiredFeatureDE(casType, "oid", "uima.cas.String", featOkTst);
    casFeatCode_oid  = (null == casFeat_oid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oid).getCode();

 
    casFeat_oui = jcas.getRequiredFeatureDE(casType, "oui", "uima.cas.String", featOkTst);
    casFeatCode_oui  = (null == casFeat_oui) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oui).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_disambiguated = jcas.getRequiredFeatureDE(casType, "disambiguated", "uima.cas.Boolean", featOkTst);
    casFeatCode_disambiguated  = (null == casFeat_disambiguated) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_disambiguated).getCode();

  }
}



    