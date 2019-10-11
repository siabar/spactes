
/* First created by JCasGen Thu Sep 20 15:38:13 CEST 2012 */
package de.unihd.dbs.uima.types.heideltime;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Thu Jun 13 12:49:14 CEST 2019
 * @generated */
public class IntervalCandidateSentence_Type extends Sentence_Type {
  /** @generated */
  public final static int typeIndexID = IntervalCandidateSentence.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.unihd.dbs.uima.types.heideltime.IntervalCandidateSentence");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public IntervalCandidateSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    