package org.apache.ctakes.dictionary.lookup2.util;

import org.apache.ctakes.core.ae.UmlsEnvironmentConfiguration;
import org.apache.ctakes.utils.env.EnvironmentVariable;
import org.apache.log4j.Logger;

/**
 * @author SPF , chip-nlp
 * @version %I%
 * @since 8/24/2015
 */
final public class UmlsUserTester {

   static private final Logger LOGGER = Logger.getLogger( "UmlsUserTester" );

   private UmlsUserTester() {
   }

   static public boolean canTestUmlsUser() {
      String user = EnvironmentVariable.getEnv(UmlsEnvironmentConfiguration.USER.toString());
      if ( user == null || user.equals( EnvironmentVariable.NOT_PRESENT ) ) {
         return false;
      }
      String pass = EnvironmentVariable.getEnv( UmlsEnvironmentConfiguration.PASSWORD.toString());
      return pass != null && !pass.equals( EnvironmentVariable.NOT_PRESENT );
   }

}
