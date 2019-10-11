

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.util;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** A brute force "hash" that stores multiple Pairs in a list. 
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Properties
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Pairs extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Pairs.class);
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
  protected Pairs() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Pairs(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Pairs(JCas jcas) {
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
  //* Feature: pairs

  /** getter for pairs - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getPairs() {
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_pairs == null)
      jcasType.jcas.throwFeatMissing("pairs", "org.apache.ctakes.typesystem.type.util.Pairs");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs)));}
    
  /** setter for pairs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPairs(FSArray v) {
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_pairs == null)
      jcasType.jcas.throwFeatMissing("pairs", "org.apache.ctakes.typesystem.type.util.Pairs");
    jcasType.ll_cas.ll_setRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for pairs - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Pair getPairs(int i) {
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_pairs == null)
      jcasType.jcas.throwFeatMissing("pairs", "org.apache.ctakes.typesystem.type.util.Pairs");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs), i);
    return (Pair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs), i)));}

  /** indexed setter for pairs - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPairs(int i, Pair v) { 
    if (Pairs_Type.featOkTst && ((Pairs_Type)jcasType).casFeat_pairs == null)
      jcasType.jcas.throwFeatMissing("pairs", "org.apache.ctakes.typesystem.type.util.Pairs");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Pairs_Type)jcasType).casFeatCode_pairs), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    