

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.refsem.Entity;


/** A text string (IdentifiedAnnotation) that refers to an Entity.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class EntityMention extends IdentifiedAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntityMention.class);
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
  protected EntityMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EntityMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntityMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EntityMention(JCas jcas, int begin, int end) {
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
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: entity

  /** getter for entity - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getEntity() {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_entity == null)
      jcasType.jcas.throwFeatMissing("entity", "org.apache.ctakes.typesystem.type.textsem.EntityMention");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntityMention_Type)jcasType).casFeatCode_entity)));}
    
  /** setter for entity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntity(Entity v) {
    if (EntityMention_Type.featOkTst && ((EntityMention_Type)jcasType).casFeat_entity == null)
      jcasType.jcas.throwFeatMissing("entity", "org.apache.ctakes.typesystem.type.textsem.EntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntityMention_Type)jcasType).casFeatCode_entity, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    