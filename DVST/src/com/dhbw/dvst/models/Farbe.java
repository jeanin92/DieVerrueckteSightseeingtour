package com.dhbw.dvst.models;

public class Farbe {
	private String text_de;
	private String text_en;
	
	public Farbe(String text_de, String text_en) {
		this.text_de = text_de;
		this.text_en = text_en;
	}
	
	public boolean compare(String farbe){
		if(text_de.equals(farbe) || text_en.equals(farbe)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getText_en() {
		return text_en;
	}
}
