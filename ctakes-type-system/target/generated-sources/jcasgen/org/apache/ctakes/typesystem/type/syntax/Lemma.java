

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Stores a lemma (canonical form of a token).  Inherits from uima.cas.TOP, allowing for reuse of standardized forms across the CAS. 
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Lemma
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Lemma extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Lemma.class);
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
  protected Lemma() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Lemma(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Lemma(JCas jcas) {
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.apache.ctakes.typesystem.type.syntax.Lemma");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.apache.ctakes.typesystem.type.syntax.Lemma");
    jcasType.ll_cas.ll_setStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: posTag

  /** getter for posTag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPosTag() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_posTag == null)
      jcasType.jcas.throwFeatMissing("posTag", "org.apache.ctakes.typesystem.type.syntax.Lemma");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_posTag);}
    
  /** setter for posTag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosTag(String v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_posTag == null)
      jcasType.jcas.throwFeatMissing("posTag", "org.apache.ctakes.typesystem.type.syntax.Lemma");
    jcasType.ll_cas.ll_setStringValue(addr, ((Lemma_Type)jcasType).casFeatCode_posTag, v);}    
  }

    