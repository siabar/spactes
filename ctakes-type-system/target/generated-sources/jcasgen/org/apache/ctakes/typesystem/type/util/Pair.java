

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.util;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** An Attribute-Value tuple.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Property
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Pair extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Pair.class);
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
  protected Pair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Pair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Pair(JCas jcas) {
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
  //* Feature: attribute

  /** getter for attribute - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAttribute() {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_attribute == null)
      jcasType.jcas.throwFeatMissing("attribute", "org.apache.ctakes.typesystem.type.util.Pair");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Pair_Type)jcasType).casFeatCode_attribute);}
    
  /** setter for attribute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttribute(String v) {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_attribute == null)
      jcasType.jcas.throwFeatMissing("attribute", "org.apache.ctakes.typesystem.type.util.Pair");
    jcasType.ll_cas.ll_setStringValue(addr, ((Pair_Type)jcasType).casFeatCode_attribute, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.apache.ctakes.typesystem.type.util.Pair");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Pair_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.apache.ctakes.typesystem.type.util.Pair");
    jcasType.ll_cas.ll_setStringValue(addr, ((Pair_Type)jcasType).casFeatCode_value, v);}    
  }

    