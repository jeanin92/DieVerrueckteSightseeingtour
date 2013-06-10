package com.dhbw.dvst.models;


public enum Sehenswuerdigkeit {
	
	AKROPOLIS, ANGKORWAT, ATOMIUM, AYERSROCK, BIGBEN,
	BRANDENBURGERTOR, CHICHENITZA, CHINESISCHEMAUER, 
	CNTOWER, COLOSSEUM, CRISTOREDENTOR, EIFFELTURM, 
	EMPIRESTATEBUILDING, GIZEH, GERATBARRIERREEF, 
	KLEINEMEERJUNGFRAU, KREML, SCHIEFERTURM, SPHINX, 
	STATUEOFLIBERTY, STONEHENGE, SYDNEYOPER, TAJMAHAL, 
	WALKOFFAME;
	
	private String motivURL;
	
	private Sehenswuerdigkeit() {
		this.motivURL = this.name().toLowerCase();
	}
	
}
