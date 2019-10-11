
/* First created by JCasGen Fri Jun 07 12:14:19 CEST 2019 */
package org.apache.ctakes.typesystem.type.refsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** The semantic encapsulation of a modifer.  E.g., for Clinical Elements, Attributes may be used to specify Body Side for a Procedure.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class Attribute_Type extends Element_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Attribute.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.Attribute");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Attribute_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    