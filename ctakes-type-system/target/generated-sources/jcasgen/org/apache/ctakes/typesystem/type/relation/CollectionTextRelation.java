

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** 
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class CollectionTextRelation extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CollectionTextRelation.class);
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
  protected CollectionTextRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CollectionTextRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CollectionTextRelation(JCas jcas) {
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
  //* Feature: members

  /** getter for members - gets A super-type for relationships between multiple spans of text.
   * @generated
   * @return value of the feature 
   */
  public FSList getMembers() {
    if (CollectionTextRelation_Type.featOkTst && ((CollectionTextRelation_Type)jcasType).casFeat_members == null)
      jcasType.jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CollectionTextRelation_Type)jcasType).casFeatCode_members)));}
    
  /** setter for members - sets A super-type for relationships between multiple spans of text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMembers(FSList v) {
    if (CollectionTextRelation_Type.featOkTst && ((CollectionTextRelation_Type)jcasType).casFeat_members == null)
      jcasType.jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CollectionTextRelation_Type)jcasType).casFeatCode_members, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    