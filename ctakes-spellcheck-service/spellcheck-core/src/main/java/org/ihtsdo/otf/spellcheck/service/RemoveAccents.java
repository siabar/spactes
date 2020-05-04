package org.ihtsdo.otf.spellcheck.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveAccents {
	
	
	public String removeAccents(String text) {
		text = Normalizer.normalize(text, Normalizer.Form.NFD);
		text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return text.trim();

	}
	
	public static void main( final String... args ) throws IOException {
		RemoveAccents ra = new RemoveAccents();
		

		// Removing accents from IctusnetDict.bsv file
		// Save in ctakes-SpaCTeS-res/src/main/resources/org/apache/ctakes/examples/dictionary/lookup/fuzzy/IctusnetDict.bsv
		// IctusnetDict.bsv should have 3 columns and separated with a vertical bar: "|". 
		// For example: CUI NUMBER (UMLS)|CATEGORY|VARIABLE
		// See a example in above path
		String input = args[0];
		String output_lexicon = args[1];
		
		
//	FreeLingWrapper freeling = new FreeLingWrapper();
//	freeling.init_dict();

		try {
			FileReader reader = new FileReader(input);
			BufferedReader bufferedReader = new BufferedReader(reader);

			FileWriter writer_lexicon = new FileWriter(output_lexicon);

			String line_original = null;
			String line = null;

			Map<String, Integer> lexiconkepper = new HashMap<String, Integer>();
			BufferedWriter bufferedWriter_lexicon = new BufferedWriter(writer_lexicon);


			while ((line_original = bufferedReader.readLine()) != null) {
				String temp_line = "";
//				String[] templine = line_original.trim().split("\\|");
				String templine = line_original.trim();
//            	String[] temp_lower = templine[2].trim().split(" ");
//            	for (String temp :temp_lower) {
//            		if (temp.length()>1) {
//            			temp_line +=  temp.toLowerCase() + " " ;
//            		}else {
//            			temp_line +=  temp+ " " ;
//            		}
//            	}

//				if (line_original.length() >3) {
//				line = line_original.trim().toLowerCase();
//				}else {
//					line = line_original.trim();
//				}
//            	line = temp_line


				String tempRC = ra.removeAccents(templine);
				bufferedWriter_lexicon.write(tempRC + "\n");

			}
			bufferedReader.close();
			bufferedWriter_lexicon.close();
			System.out.println("Pre-processing Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

}
