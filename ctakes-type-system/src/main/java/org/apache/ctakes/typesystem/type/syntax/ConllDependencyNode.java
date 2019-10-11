

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A dependency parser node in the CONLL-X format, namely, where each node is a token with 10 fields.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class ConllDependencyNode extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConllDependencyNode.class);
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
  protected ConllDependencyNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ConllDependencyNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ConllDependencyNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ConllDependencyNode(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets The token's position in the sentence.  The ROOT node, present in every dependency parse, has id=0.
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets The token's position in the sentence.  The ROOT node, present in every dependency parse, has id=0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: form

  /** getter for form - gets 
   * @generated
   * @return value of the feature 
   */
  public String getForm() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_form);}
    
  /** setter for form - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setForm(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_form, v);}    
   
    
  //*--------------*
  //* Feature: lemma

  /** getter for lemma - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLemma() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_lemma);}
    
  /** setter for lemma - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_lemma, v);}    
   
    
  //*--------------*
  //* Feature: cpostag

  /** getter for cpostag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCpostag() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_cpostag == null)
      jcasType.jcas.throwFeatMissing("cpostag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_cpostag);}
    
  /** setter for cpostag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCpostag(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_cpostag == null)
      jcasType.jcas.throwFeatMissing("cpostag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_cpostag, v);}    
   
    
  //*--------------*
  //* Feature: postag

  /** getter for postag - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPostag() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_postag);}
    
  /** setter for postag - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPostag(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_postag, v);}    
   
    
  //*--------------*
  //* Feature: feats

  /** getter for feats - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFeats() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_feats == null)
      jcasType.jcas.throwFeatMissing("feats", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_feats);}
    
  /** setter for feats - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeats(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_feats == null)
      jcasType.jcas.throwFeatMissing("feats", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_feats, v);}    
   
    
  //*--------------*
  //* Feature: head

  /** getter for head - gets 
   * @generated
   * @return value of the feature 
   */
  public ConllDependencyNode getHead() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return (ConllDependencyNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_head)));}
    
  /** setter for head - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHead(ConllDependencyNode v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_head, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: deprel

  /** getter for deprel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDeprel() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_deprel == null)
      jcasType.jcas.throwFeatMissing("deprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_deprel);}
    
  /** setter for deprel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDeprel(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_deprel == null)
      jcasType.jcas.throwFeatMissing("deprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_deprel, v);}    
   
    
  //*--------------*
  //* Feature: phead

  /** getter for phead - gets 
   * @generated
   * @return value of the feature 
   */
  public ConllDependencyNode getPhead() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_phead == null)
      jcasType.jcas.throwFeatMissing("phead", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return (ConllDependencyNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_phead)));}
    
  /** setter for phead - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhead(ConllDependencyNode v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_phead == null)
      jcasType.jcas.throwFeatMissing("phead", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_phead, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: pdeprel

  /** getter for pdeprel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPdeprel() {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_pdeprel == null)
      jcasType.jcas.throwFeatMissing("pdeprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_pdeprel);}
    
  /** setter for pdeprel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPdeprel(String v) {
    if (ConllDependencyNode_Type.featOkTst && ((ConllDependencyNode_Type)jcasType).casFeat_pdeprel == null)
      jcasType.jcas.throwFeatMissing("pdeprel", "org.apache.ctakes.typesystem.type.syntax.ConllDependencyNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConllDependencyNode_Type)jcasType).casFeatCode_pdeprel, v);}    
  }

    