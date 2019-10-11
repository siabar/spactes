package org.apache.ctakes.freeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;

public class RemoveAccents {
	
	
	public String removeAccents(String text) {
		text = Normalizer.normalize(text, Normalizer.Form.NFD);
		text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return text.trim();

	}

}
