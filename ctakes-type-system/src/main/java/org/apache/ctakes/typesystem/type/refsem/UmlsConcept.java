

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Concepts in the Unified Medical Language System (UMLS) Metathesaurus have a concept unique identifier (CUI) and a type unique identifier (TUI, i.e., semantic type) which are curated, normalized codes. For example, "pain" would have a cui=C0030193 and tui=T184.
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.UmlsConcept
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class UmlsConcept extends OntologyConcept {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UmlsConcept.class);
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
  protected UmlsConcept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public UmlsConcept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UmlsConcept(JCas jcas) {
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
  //* Feature: cui

  /** getter for cui - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCui() {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_cui == null)
      jcasType.jcas.throwFeatMissing("cui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_cui);}
    
  /** setter for cui - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCui(String v) {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_cui == null)
      jcasType.jcas.throwFeatMissing("cui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_cui, v);}    
   
    
  //*--------------*
  //* Feature: tui

  /** getter for tui - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTui() {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_tui == null)
      jcasType.jcas.throwFeatMissing("tui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_tui);}
    
  /** setter for tui - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTui(String v) {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_tui == null)
      jcasType.jcas.throwFeatMissing("tui", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_tui, v);}    
   
    
  //*--------------*
  //* Feature: preferredText

  /** getter for preferredText - gets preferredText is the preferred term. normally his is	 
           	the UMLS preferred name.
   * @generated
   * @return value of the feature 
   */
  public String getPreferredText() {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_preferredText);}
    
  /** setter for preferredText - sets preferredText is the preferred term. normally his is	 
           	the UMLS preferred name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPreferredText(String v) {
    if (UmlsConcept_Type.featOkTst && ((UmlsConcept_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.refsem.UmlsConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((UmlsConcept_Type)jcasType).casFeatCode_preferredText, v);}    
  }

    