

/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A real-world event; similar to Entity, but may bear some temporal properties and relationships.  In the constrained clinical context, many concepts are discussed as instances with some temporal component, e.g., Medications, Labs.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * XML source: /home/siabar/eclipse-workspace/ctakes/ctakes-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Event extends Element {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Event.class);
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
  protected Event() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Event(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Event(JCas jcas) {
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
  //* Feature: properties

  /** getter for properties - gets 
   * @generated
   * @return value of the feature 
   */
  public EventProperties getProperties() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_properties == null)
      jcasType.jcas.throwFeatMissing("properties", "org.apache.ctakes.typesystem.type.refsem.Event");
    return (EventProperties)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_properties)));}
    
  /** setter for properties - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProperties(EventProperties v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_properties == null)
      jcasType.jcas.throwFeatMissing("properties", "org.apache.ctakes.typesystem.type.refsem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_properties, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    