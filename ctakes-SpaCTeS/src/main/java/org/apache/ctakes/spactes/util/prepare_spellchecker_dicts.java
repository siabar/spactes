package org.apache.ctakes.spactes.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ctakes.freeling.FreeLingWrapper;
import org.apache.ctakes.freeling.RemoveAccents;

public class prepare_spellchecker_dicts {
	
	public static void main(final String... args) throws Exception {
		FreeLingWrapper freeling = new FreeLingWrapper();
		freeling.init_dict();

		RemoveAccents ra = new RemoveAccents();
		// input should be
		// ctakes-SpaCTeS-res/src/main/resources/org/apache/ctakes/examples/dictionary/lookup/fuzzy/IctusnetDict.bsv
		String input = args[0];
		// output_lexicon is
		// ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker/lexicon/lexicon.txt
		// output_dic is
		// ctakes-SpaCTeS/org/apache/ctakes/examples/dictionary/lookup/spellchecker/dic/dic.txt
		// outputs is using for spellchecker dictionary
		String output_lexicon = args[1];
		String output_dic = args[2];
		
		try {
			FileReader reader = new FileReader(input);
			BufferedReader bufferedReader = new BufferedReader(reader);

			FileWriter writer_lexicon = new FileWriter(output_lexicon);
			FileWriter writer_dic = new FileWriter(output_dic);

			String line_original = null;
			String line = null;

			Map<String, Integer> lexiconkepper = new HashMap<String, Integer>();
			BufferedWriter bufferedWriter_lexicon = new BufferedWriter(writer_lexicon);

			BufferedWriter bufferedWriter_dic = new BufferedWriter(writer_dic);

			while ((line_original = bufferedReader.readLine()) != null) {
				String temp_line = "";
				String[] templine = line_original.trim().split("\\|");

				String[] temp_lower = templine[2].trim().split(" ");
				for (String temp : temp_lower) {
					if (temp.length() > 1) {
						temp_line += temp.toLowerCase() + " ";
					} else {
						temp_line += temp + " ";
					}
				}

				line = temp_line.trim();
				List<String> temp = freeling.tokenizer(line);
				String tempRC = ra.removeAccents(String.join(" ", temp));
				bufferedWriter_dic.write(tempRC + "\n");

				tempRC = ra.removeAccents(temp.get(0));
				if (!lexiconkepper.containsKey(tempRC)) {
					lexiconkepper.put(tempRC, 0);
				}

			}

			for (String st : lexiconkepper.keySet()) {
				bufferedWriter_lexicon.write(st + "\n");
			}
			bufferedReader.close();
			bufferedWriter_lexicon.close();
			bufferedWriter_dic.close();
			System.out.println("Pre-processing Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
