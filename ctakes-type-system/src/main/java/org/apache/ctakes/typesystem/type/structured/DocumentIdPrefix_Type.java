
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.structured;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Can specify a prefix to a document ID. Useful for directory tree retention.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class DocumentIdPrefix_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentIdPrefix.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.DocumentIdPrefix");
 
  /** @generated */
  final Feature casFeat_documentIdPrefix;
  /** @generated */
  final int     casFeatCode_documentIdPrefix;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentIdPrefix(int addr) {
        if (featOkTst && casFeat_documentIdPrefix == null)
      jcas.throwFeatMissing("documentIdPrefix", "org.apache.ctakes.typesystem.type.structured.DocumentIdPrefix");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentIdPrefix);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentIdPrefix(int addr, String v) {
        if (featOkTst && casFeat_documentIdPrefix == null)
      jcas.throwFeatMissing("documentIdPrefix", "org.apache.ctakes.typesystem.type.structured.DocumentIdPrefix");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentIdPrefix, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentIdPrefix_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentIdPrefix = jcas.getRequiredFeatureDE(casType, "documentIdPrefix", "uima.cas.String", featOkTst);
    casFeatCode_documentIdPrefix  = (null == casFeat_documentIdPrefix) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentIdPrefix).getCode();

  }
}



    