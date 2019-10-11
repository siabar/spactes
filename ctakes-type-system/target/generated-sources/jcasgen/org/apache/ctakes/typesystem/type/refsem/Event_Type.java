
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A real-world event; similar to Entity, but may bear some temporal properties and relationships.  In the constrained clinical context, many concepts are discussed as instances with some temporal component, e.g., Medications, Labs.
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class Event_Type extends Element_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Event.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.Event");
 
  /** @generated */
  final Feature casFeat_properties;
  /** @generated */
  final int     casFeatCode_properties;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getProperties(int addr) {
        if (featOkTst && casFeat_properties == null)
      jcas.throwFeatMissing("properties", "org.apache.ctakes.typesystem.type.refsem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_properties);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProperties(int addr, int v) {
        if (featOkTst && casFeat_properties == null)
      jcas.throwFeatMissing("properties", "org.apache.ctakes.typesystem.type.refsem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_properties, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Event_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_properties = jcas.getRequiredFeatureDE(casType, "properties", "org.apache.ctakes.typesystem.type.refsem.EventProperties", featOkTst);
    casFeatCode_properties  = (null == casFeat_properties) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_properties).getCode();

  }
}



    