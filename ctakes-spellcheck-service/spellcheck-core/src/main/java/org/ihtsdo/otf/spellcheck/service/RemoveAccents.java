package org.ihtsdo.otf.spellcheck.service;


import java.text.Normalizer;


public class RemoveAccents {
	
	
	public String removeAccents(String text) {
		text = Normalizer.normalize(text, Normalizer.Form.NFD);
		text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return text.trim();

	}
	
}
