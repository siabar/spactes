

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation;


/** A relation between a chain relation and an identified annotation mention. Useful for relating a new mention to a collection of previous mentions, e.g., in coreference resolution.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class CollectionTextRelationIdentifiedAnnotationRelation extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CollectionTextRelationIdentifiedAnnotationRelation.class);
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
  protected CollectionTextRelationIdentifiedAnnotationRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CollectionTextRelationIdentifiedAnnotationRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CollectionTextRelationIdentifiedAnnotationRelation(JCas jcas) {
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
  //* Feature: cluster

  /** getter for cluster - gets 
   * @generated
   * @return value of the feature 
   */
  public CollectionTextRelation getCluster() {
    if (CollectionTextRelationIdentifiedAnnotationRelation_Type.featOkTst && ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    return (CollectionTextRelation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeatCode_cluster)));}
    
  /** setter for cluster - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCluster(CollectionTextRelation v) {
    if (CollectionTextRelationIdentifiedAnnotationRelation_Type.featOkTst && ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeatCode_cluster, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mention

  /** getter for mention - gets 
   * @generated
   * @return value of the feature 
   */
  public IdentifiedAnnotation getMention() {
    if (CollectionTextRelationIdentifiedAnnotationRelation_Type.featOkTst && ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeat_mention == null)
      jcasType.jcas.throwFeatMissing("mention", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    return (IdentifiedAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeatCode_mention)));}
    
  /** setter for mention - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMention(IdentifiedAnnotation v) {
    if (CollectionTextRelationIdentifiedAnnotationRelation_Type.featOkTst && ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeat_mention == null)
      jcasType.jcas.throwFeatMissing("mention", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CollectionTextRelationIdentifiedAnnotationRelation_Type)jcasType).casFeatCode_mention, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    