package com.dhbw.dvst.models;

public class Form {
	private String text_de;
	private String text_en;
	
	public Form(String text_de, String text_en) {
		this.text_de = text_de;
		this.text_en = text_en;
	}
	
	public boolean compare(String form){
		if(text_de.equals(form) || text_en.equals(form)) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getText_en() {
		return text_en;
	}
}
