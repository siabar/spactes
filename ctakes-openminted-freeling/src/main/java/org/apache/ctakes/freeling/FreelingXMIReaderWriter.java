/*
OpenMinted_Freeling
Copyright (C) 2018  grup TALN - Universitat Pompeu Fabra
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/ 

package org.apache.ctakes.freeling;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.util.JCasUtil.select;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.io.xmi.XmiReader;
import de.tudarmstadt.ukp.dkpro.core.io.xmi.XmiWriter;


/**
 * Simple pipeline using a reader and a writer from the DKPro Core component collection. The
 * processed text is tokenizer and tagger with part-of-speech information.
 */
public class FreelingXMIReaderWriter
{         
    

    public static void main(String[] args) throws Exception
    {   
//    	System.loadLibrary("/usr/local/share/freeling/APIs/java/Jfreeling.jar");
    	System.out.println(System.getProperty("java.library.path"));
        if (args.length>1){
               SimplePipeline.runPipeline(
                        createReaderDescription(XmiReader.class,
                                XmiReader.PARAM_SOURCE_LOCATION, args[0],
                                XmiReader.PARAM_PATTERNS, "*.txt",
                                XmiReader.PARAM_LANGUAGE, "es"),
                        createEngineDescription(FreeLingWrapper.class,
                                FreeLingWrapper.PARAM_LANGUAGE,  "es",
                                FreeLingWrapper.PARAM_DO_DEPENDECY_PARSING,false,
                                FreeLingWrapper.PARAM_USE_RULE_BASED,false,
                                FreeLingWrapper.PARAM_LANGUAGE_AUTODETECT,false,
                                FreeLingWrapper.PARAM_DICTIONARY,true,
                                FreeLingWrapper.PARAM_LEMMA,false),
                        createEngineDescription(XmiWriter.class,
                                XmiWriter.PARAM_TARGET_LOCATION, args[1],
                                XmiWriter.PARAM_OVERWRITE,true ));
            } else {
                System.out.println("arguments are \n - input folder, \n - output foder \n ");
            }
            
    }
	
}
