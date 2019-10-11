

/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textspan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A section of a clinical text, e.g., Diagnosis, Current Medications, Problem List.  Different segments often have differing sublanguages and clinical relevance.     
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Segment
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/src/main/resources/org/apache/ctakes/typesystem/types/TypeSystem.xml
 * @generated */
public class Segment extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Segment.class);
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
  protected Segment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Segment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Segment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Segment(JCas jcas, int begin, int end) {
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

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textspan.Segment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Segment_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textspan.Segment");
    jcasType.ll_cas.ll_setStringValue(addr, ((Segment_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: preferredText

  /** getter for preferredText - gets preferredText is the normalized/resolved section name.  Normally, this is populated by the Sectionizer and would contain the HL7/CCDA section name.
   * @generated
   * @return value of the feature 
   */
  public String getPreferredText() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Segment_Type)jcasType).casFeatCode_preferredText);}
    
  /** setter for preferredText - sets preferredText is the normalized/resolved section name.  Normally, this is populated by the Sectionizer and would contain the HL7/CCDA section name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPreferredText(String v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    jcasType.ll_cas.ll_setStringValue(addr, ((Segment_Type)jcasType).casFeatCode_preferredText, v);}    
   
    
  //*--------------*
  //* Feature: tagText

  /** getter for tagText - gets tagText is the unresolved section name; the raw text in the document indicating (tagging) the
                  section. Basically covered text of the section's tag.
   * @generated
   * @return value of the feature 
   */
  public String getTagText() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_tagText == null)
      jcasType.jcas.throwFeatMissing("tagText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Segment_Type)jcasType).casFeatCode_tagText);}
    
  /** setter for tagText - sets tagText is the unresolved section name; the raw text in the document indicating (tagging) the
                  section. Basically covered text of the section's tag. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTagText(String v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_tagText == null)
      jcasType.jcas.throwFeatMissing("tagText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    jcasType.ll_cas.ll_setStringValue(addr, ((Segment_Type)jcasType).casFeatCode_tagText, v);}    
  }

    