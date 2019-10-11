
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.structured;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Equivalent to cTAKES: org.apache.ctakes.typesystem.type.DocumentID, but its supertype changed to uima.cas.TOP
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class DocumentID_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentID.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.DocumentID");
 
  /** @generated */
  final Feature casFeat_documentID;
  /** @generated */
  final int     casFeatCode_documentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentID(int addr) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "org.apache.ctakes.typesystem.type.structured.DocumentID");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentID(int addr, String v) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "org.apache.ctakes.typesystem.type.structured.DocumentID");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentID_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentID = jcas.getRequiredFeatureDE(casType, "documentID", "uima.cas.String", featOkTst);
    casFeatCode_documentID  = (null == casFeat_documentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentID).getCode();

  }
}



    