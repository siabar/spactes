
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.structured;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Can specify the full path to a document source. Useful for directory retention.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class DocumentPath_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentPath.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.DocumentPath");
 
  /** @generated */
  final Feature casFeat_documentPath;
  /** @generated */
  final int     casFeatCode_documentPath;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentPath(int addr) {
        if (featOkTst && casFeat_documentPath == null)
      jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentPath);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentPath(int addr, String v) {
        if (featOkTst && casFeat_documentPath == null)
      jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentPath, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentPath_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentPath = jcas.getRequiredFeatureDE(casType, "documentPath", "uima.cas.String", featOkTst);
    casFeatCode_documentPath  = (null == casFeat_documentPath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentPath).getCode();

  }
}



    