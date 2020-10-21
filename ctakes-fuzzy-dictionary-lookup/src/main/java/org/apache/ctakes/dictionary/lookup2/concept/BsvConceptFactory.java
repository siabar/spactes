package org.apache.ctakes.dictionary.lookup2.concept;

import org.apache.ctakes.core.resource.FileLocator;
import org.apache.ctakes.core.util.StringUtil;
import org.apache.ctakes.core.util.collection.CollectionMap;
import org.apache.ctakes.core.util.collection.HashSetMap;
import org.apache.ctakes.dictionary.lookup2.util.CuiCodeUtil;
import org.apache.ctakes.dictionary.lookup2.util.TuiCodeUtil;
import org.apache.log4j.Logger;
import org.apache.uima.UimaContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Author: SPF
 * Affiliation: CHIP-NLP
 * Date: 9/9/2014
 */
final public class BsvConceptFactory implements ConceptFactory {

   static private final Logger LOGGER = Logger.getLogger( "BsvConceptFactory" );

   static private final String BSV_FILE_PATH = "bsvPath";
   
	static private final int LowerCaseLenght = 1;



   final private ConceptFactory _delegateFactory;


   public BsvConceptFactory( final String name, final UimaContext uimaContext, final Properties properties ) {
      this( name, properties.getProperty( BSV_FILE_PATH ) );
   }

   public BsvConceptFactory( final String name, final String bsvFilePath ) {
      final Collection<CuiTuiTerm> cuiTuiTerms = parseBsvFile( bsvFilePath );
      final Map<Long, Concept> conceptMap = new HashMap<>( cuiTuiTerms.size() );
      for ( CuiTuiTerm cuiTuiTerm : cuiTuiTerms ) {
         final CollectionMap<String, String, ? extends Collection<String>> codes
               = new HashSetMap<>();
         codes.placeValue( Concept.TUI, TuiCodeUtil.getAsTui( cuiTuiTerm.getTui() ) );
         conceptMap.put( CuiCodeUtil.getInstance().getCuiCode( cuiTuiTerm.getCui() ),
               new DefaultConcept( cuiTuiTerm.getCui(), cuiTuiTerm.getPrefTerm(), codes ) );
      }
      _delegateFactory = new MemConceptFactory( name, conceptMap );
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public String getName() {
      return _delegateFactory.getName();
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Concept createConcept( final Long cuiCode ) {
      return _delegateFactory.createConcept( cuiCode );
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Map<Long, Concept> createConcepts( final Collection<Long> cuiCodes ) {
      return _delegateFactory.createConcepts( cuiCodes );
   }


   /**
    * Create a collection of {@link org.apache.ctakes.dictionary.lookup2.dictionary.RareWordTermMapCreator.CuiTerm} Objects
    * by parsing a bsv file.  The file can be in one of two columnar formats:
    * <p>
    * CUI|Tui
    * </p>
    * or
    * <p>
    * CUI|TUI|Text
    * </p>
    * or
    * <p>
    * CUI|TUI|Text|PreferredTerm
    * </p>
    * If the TUI column is omitted then the entityId for the dictionary is used as the TUI
    * <p/>
    *
    * @param bsvFilePath file containing term rows and bsv columns
    * @return collection of all valid terms read from the bsv file
    */
   // Function recursively prints the strings having space pattern 
   // i and j are indices in 'String str' and 'buf[]' respectively  
   static void printPatternUtil(Collection<String> terms, String[] str_s, String buf[], int i, int j, int n) 
   { 
       if(i == n) 
       { 
//           buf[j] = ""; 
           terms.add(String.join("", Arrays.copyOfRange(buf, 0, j)));
           return; 
       } 
 
       // Either put the character 
       buf[j] = str_s[i]; 
       printPatternUtil(terms, str_s, buf, i+1, j+1, n); 
 
       // Or put a space followed by next character 
       buf[j] = " "; 
       buf[j+1] = str_s[i]; 
 
       printPatternUtil(terms, str_s, buf, i+1, j+2, n); 
   } 
 
   // Function creates buf[] to store individual output string and uses 
   // printPatternUtil() to print all permutations 
   static Collection<String> printPattern(String str) 
   { 
	   Collection<String> terms = new ArrayList<>();
       String[] str_s = str.split(" ");
       int len = str_s.length; 
 
       // Buffer to hold the string containing spaces 
       // 2n-1 characters and 1 string terminator 
       String[] buf = new String[2*len]; 
 
       // Copy the first character as it is, since it will be always 
       // at first position 
       buf[0] = str_s[0]; 
       printPatternUtil(terms, str_s, buf, 1, 1, len); 
       return terms;
       
   } 
   
   static private Collection<CuiTuiTerm> parseBsvFile( final String bsvFilePath ) {
      final Collection<CuiTuiTerm> cuiTuiTerms = new ArrayList<>();
	   Collection<String> terms = new ArrayList<>();
	   
      try ( final BufferedReader reader
                  = new BufferedReader( new InputStreamReader( FileLocator.getAsStream( bsvFilePath ) ) ) ) {
         String line = reader.readLine();
         while ( line != null ) {
            if ( line.isEmpty() || line.startsWith( "//" ) || line.startsWith( "#" ) ) {
               line = reader.readLine();
               continue;
            }
//            final String[] columns = LookupUtil.fastSplit( line, '|' );
            final String[] columns = StringUtil.fastSplit( line, '|' );
            terms = printPattern(columns[2]);
//            
            for (String term : terms) {
            	columns[2] = term;
                final CuiTuiTerm cuiTuiTerm = createCuiTuiTerm( columns );
                if ( cuiTuiTerm != null ) {
                   cuiTuiTerms.add( cuiTuiTerm );
                } else {
                   LOGGER.warn( "Bad BSV line " + line + " in " + bsvFilePath );
                }
                
                String term_s = term.replaceAll("\\p{Punct}", "");
                
                if (! term_s.equalsIgnoreCase(term)) {
                	
                	columns[2] = term.replaceAll("\\p{Punct}", "");
                    final CuiTuiTerm cuiTuiTerm_punct = createCuiTuiTerm( columns );
                    if ( cuiTuiTerm_punct != null ) {
                       cuiTuiTerms.add( cuiTuiTerm_punct );
                    } else {
                       LOGGER.warn( "Bad BSV line " + line + " in " + bsvFilePath );
                    }
                }
            	
            }
            
            line = reader.readLine();
         }
      } catch ( IOException ioE ) {
         LOGGER.error( ioE.getMessage() );
      }
      return cuiTuiTerms;
   }

   /**
    * @param columns two or three columns representing CUI,Text or CUI,TUI,Text respectively
    * @return a term created from the columns or null if the columns are malformed
    */
   static private CuiTuiTerm createCuiTuiTerm( final String... columns ) {
      if ( columns.length < 2 ) {
         return null;
      }
      final int cuiIndex = 0;
      final int tuiIndex = 1;
      int termIndex = -1;
      if ( columns.length >= 4 ) {
         // third column is text, fourth column is preferred term text
         termIndex = 3;
      }
      if ( columns[ cuiIndex ].trim().isEmpty() || columns[ tuiIndex ].trim().isEmpty() ) {
         return null;
      }
      final String cui = columns[ cuiIndex ];
      // default for an empty tui column is tui 0 = unknown
      final String tui = (columns[ tuiIndex ].trim().isEmpty()) ? "T000" : columns[ tuiIndex ].trim();
      final String preferredTerm = (termIndex < 0 || columns[ termIndex ].trim().isEmpty()) ? "" : columns[ termIndex ]
            .trim();
      return new CuiTuiTerm( cui, tui, preferredTerm );
   }

   static public class CuiTuiTerm {

      final private String __cui;
      final private String __tui;
      final private String __prefTerm;
      final private int __hashcode;

      public CuiTuiTerm( final String cui, final String tui, final String preferredTerm ) {
         __cui = cui;
         __tui = tui;
         __prefTerm = preferredTerm;
         __hashcode = (__cui + "_" + __tui + "_" + __prefTerm).hashCode();
      }

      public String getCui() {
         return __cui;
      }

      public String getTui() {
         return __tui;
      }

      public String getPrefTerm() {
         return __prefTerm;
      }

      public boolean equals( final Object value ) {
         return value instanceof CuiTuiTerm
                && __prefTerm.equals( ((CuiTuiTerm)value).__prefTerm )
                && __tui.equals( ((CuiTuiTerm)value).__tui )
                && __cui.equals( ((CuiTuiTerm)value).__cui );
      }

      public int hashCode() {
         return __hashcode;
      }
   }


}
