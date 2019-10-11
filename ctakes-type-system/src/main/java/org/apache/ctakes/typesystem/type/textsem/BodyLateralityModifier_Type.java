
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.textsem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** The proximity of the location in anatomical terms (distal, proximal, superior, anterior and etc.). This is finer-grained to allow combinations of values.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class BodyLateralityModifier_Type extends Modifier_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BodyLateralityModifier.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.BodyLateralityModifier");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public BodyLateralityModifier_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    