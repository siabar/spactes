
/* First created by JCasGen Fri Jun 07 10:58:42 CEST 2019 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.ctakes.typesystem.type.relation.BinaryTextRelation_Type;

/** Stanford dependencies provide a representation of grammatical relations between words in a sentence. Stanford dependencies are triplets: name of the relation, governor and dependent.
 * Updated by JCasGen Thu Jun 20 11:44:40 CEST 2019
 * @generated */
public class StanfordDependency_Type extends BinaryTextRelation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StanfordDependency.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.StanfordDependency");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public StanfordDependency_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    