

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Ontologies (e.g., SNOMED-CT) provide an expert semantic representation for concepts. They typically assign a code to a concept and normalize across various textual representations of that concept.  
IdentifiedAnnotation and Elements may point to these normalized concept representations to indicate clinical concepts.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.OntologyConcept
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class OntologyConcept extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OntologyConcept.class);
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
  protected OntologyConcept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OntologyConcept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OntologyConcept(JCas jcas) {
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
  //* Feature: codingScheme

  /** getter for codingScheme - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCodingScheme() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_codingScheme == null)
      jcasType.jcas.throwFeatMissing("codingScheme", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_codingScheme);}
    
  /** setter for codingScheme - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCodingScheme(String v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_codingScheme == null)
      jcasType.jcas.throwFeatMissing("codingScheme", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_codingScheme, v);}    
   
    
  //*--------------*
  //* Feature: code

  /** getter for code - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCode() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_code);}
    
  /** setter for code - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCode(String v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_code, v);}    
   
    
  //*--------------*
  //* Feature: oid

  /** getter for oid - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOid() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_oid == null)
      jcasType.jcas.throwFeatMissing("oid", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_oid);}
    
  /** setter for oid - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOid(String v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_oid == null)
      jcasType.jcas.throwFeatMissing("oid", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_oid, v);}    
   
    
  //*--------------*
  //* Feature: oui

  /** getter for oui - gets holds the rxnorm unique identifier for a given drug mention.
							TODO: change this attribute because of name clash (UMLS/SNOMED)
   * @generated
   * @return value of the feature 
   */
  public String getOui() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_oui == null)
      jcasType.jcas.throwFeatMissing("oui", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_oui);}
    
  /** setter for oui - sets holds the rxnorm unique identifier for a given drug mention.
							TODO: change this attribute because of name clash (UMLS/SNOMED) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOui(String v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_oui == null)
      jcasType.jcas.throwFeatMissing("oui", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_oui, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Word Sense disambiguation: if this named entity is assigned multiple ontologyConcepts, the score represents how similar this sense is to surrounding senses (higher scores = more likely to be the correct sense)
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Word Sense disambiguation: if this named entity is assigned multiple ontologyConcepts, the score represents how similar this sense is to surrounding senses (higher scores = more likely to be the correct sense) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: disambiguated

  /** getter for disambiguated - gets Word Sense disambiguation: if this named entity is assigned multiple ontologyConcepts, then the OntologyConcept with disambiguated=true is the most likely sense
   * @generated
   * @return value of the feature 
   */
  public boolean getDisambiguated() {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_disambiguated == null)
      jcasType.jcas.throwFeatMissing("disambiguated", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_disambiguated);}
    
  /** setter for disambiguated - sets Word Sense disambiguation: if this named entity is assigned multiple ontologyConcepts, then the OntologyConcept with disambiguated=true is the most likely sense 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisambiguated(boolean v) {
    if (OntologyConcept_Type.featOkTst && ((OntologyConcept_Type)jcasType).casFeat_disambiguated == null)
      jcasType.jcas.throwFeatMissing("disambiguated", "org.apache.ctakes.typesystem.type.refsem.OntologyConcept");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((OntologyConcept_Type)jcasType).casFeatCode_disambiguated, v);}    
  }

    