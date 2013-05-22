package com.dhbw.dvst.model;

public class Form {
	String text_de;
	String text_en;
	
	public Form(String text_de, String text_en) {
		this.text_de = text_de;
		this.text_en = text_en;
	}
	
	public boolean compare(String form){
		if(text_de.equals(form) || text_en.equals(form)){
			return true;
		}
		else{
			return false;
		}
	}
}
