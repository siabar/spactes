

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A super-type for relationships between two spans of text.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class BinaryTextRelation extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BinaryTextRelation.class);
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
  protected BinaryTextRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public BinaryTextRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public BinaryTextRelation(JCas jcas) {
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
  //* Feature: arg1

  /** getter for arg1 - gets 
   * @generated
   * @return value of the feature 
   */
  public RelationArgument getArg1() {
    if (BinaryTextRelation_Type.featOkTst && ((BinaryTextRelation_Type)jcasType).casFeat_arg1 == null)
      jcasType.jcas.throwFeatMissing("arg1", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    return (RelationArgument)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BinaryTextRelation_Type)jcasType).casFeatCode_arg1)));}
    
  /** setter for arg1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArg1(RelationArgument v) {
    if (BinaryTextRelation_Type.featOkTst && ((BinaryTextRelation_Type)jcasType).casFeat_arg1 == null)
      jcasType.jcas.throwFeatMissing("arg1", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((BinaryTextRelation_Type)jcasType).casFeatCode_arg1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: arg2

  /** getter for arg2 - gets 
   * @generated
   * @return value of the feature 
   */
  public RelationArgument getArg2() {
    if (BinaryTextRelation_Type.featOkTst && ((BinaryTextRelation_Type)jcasType).casFeat_arg2 == null)
      jcasType.jcas.throwFeatMissing("arg2", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    return (RelationArgument)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BinaryTextRelation_Type)jcasType).casFeatCode_arg2)));}
    
  /** setter for arg2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArg2(RelationArgument v) {
    if (BinaryTextRelation_Type.featOkTst && ((BinaryTextRelation_Type)jcasType).casFeat_arg2 == null)
      jcasType.jcas.throwFeatMissing("arg2", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((BinaryTextRelation_Type)jcasType).casFeatCode_arg2, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    