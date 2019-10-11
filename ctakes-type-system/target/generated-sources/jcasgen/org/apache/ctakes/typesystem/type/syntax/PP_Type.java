
/* First created by JCasGen Tue Jul 16 10:40:58 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** A prepositional phrase
Equivalent to cTAKES: edu.mayo.bmi.uima.chunker.type.PP
 * Updated by JCasGen Tue Jul 16 10:40:58 CEST 2019
 * @generated */
public class PP_Type extends Chunk_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PP.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.PP");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PP_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    