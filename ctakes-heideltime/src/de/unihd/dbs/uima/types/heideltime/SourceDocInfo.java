

/* First created by JCasGen Wed May 04 15:59:23 CEST 2011 */
package de.unihd.dbs.uima.types.heideltime;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jun 13 12:49:14 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/heideltime-VERSION2.2.1/desc/annotator/TreeTaggerWrapper.xml
 * @generated */
public class SourceDocInfo extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SourceDocInfo.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SourceDocInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SourceDocInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SourceDocInfo(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SourceDocInfo(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (SourceDocInfo_Type.featOkTst && ((SourceDocInfo_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "de.unihd.dbs.uima.types.heideltime.SourceDocInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceDocInfo_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (SourceDocInfo_Type.featOkTst && ((SourceDocInfo_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "de.unihd.dbs.uima.types.heideltime.SourceDocInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceDocInfo_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: offsetInSource

  /** getter for offsetInSource - gets 
   * @generated
   * @return value of the feature 
   */
  public int getOffsetInSource() {
    if (SourceDocInfo_Type.featOkTst && ((SourceDocInfo_Type)jcasType).casFeat_offsetInSource == null)
      jcasType.jcas.throwFeatMissing("offsetInSource", "de.unihd.dbs.uima.types.heideltime.SourceDocInfo");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SourceDocInfo_Type)jcasType).casFeatCode_offsetInSource);}
    
  /** setter for offsetInSource - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffsetInSource(int v) {
    if (SourceDocInfo_Type.featOkTst && ((SourceDocInfo_Type)jcasType).casFeat_offsetInSource == null)
      jcasType.jcas.throwFeatMissing("offsetInSource", "de.unihd.dbs.uima.types.heideltime.SourceDocInfo");
    jcasType.ll_cas.ll_setIntValue(addr, ((SourceDocInfo_Type)jcasType).casFeatCode_offsetInSource, v);}    
  }

    