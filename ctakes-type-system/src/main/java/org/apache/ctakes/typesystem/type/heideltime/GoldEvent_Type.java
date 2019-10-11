
/* First created by JCasGen Thu Sep 20 15:38:13 CEST 2012 */
package org.apache.ctakes.typesystem.type.heideltime;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Tue Jun 11 14:32:07 CEST 2019
 * @generated */
public class GoldEvent_Type extends Event_Type {
  /** @generated */
  public final static int typeIndexID = GoldEvent.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.unihd.dbs.uima.types.heideltime.GoldEvent");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GoldEvent_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    