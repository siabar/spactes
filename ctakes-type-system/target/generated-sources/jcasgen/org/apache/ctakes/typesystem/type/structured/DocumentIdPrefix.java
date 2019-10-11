

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.structured;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Can specify a prefix to a document ID. Useful for directory tree retention.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class DocumentIdPrefix extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentIdPrefix.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DocumentIdPrefix() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DocumentIdPrefix(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentIdPrefix(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: documentIdPrefix

  /** getter for documentIdPrefix - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentIdPrefix() {
    if (DocumentIdPrefix_Type.featOkTst && ((DocumentIdPrefix_Type)jcasType).casFeat_documentIdPrefix == null)
      jcasType.jcas.throwFeatMissing("documentIdPrefix", "org.apache.ctakes.typesystem.type.structured.DocumentIdPrefix");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentIdPrefix_Type)jcasType).casFeatCode_documentIdPrefix);}
    
  /** setter for documentIdPrefix - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentIdPrefix(String v) {
    if (DocumentIdPrefix_Type.featOkTst && ((DocumentIdPrefix_Type)jcasType).casFeat_documentIdPrefix == null)
      jcasType.jcas.throwFeatMissing("documentIdPrefix", "org.apache.ctakes.typesystem.type.structured.DocumentIdPrefix");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentIdPrefix_Type)jcasType).casFeatCode_documentIdPrefix, v);}    
  }

    