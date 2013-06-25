package com.dhbw.dvst.models;

public enum Ausrichtung {
	KURVEOBENRECHTS (270), KURVEUNTENRECHTS (0), KURVEOBENLINKS (180), KURVEUNTENLINKS (90),
	GERADEWAAGERECHT (0), GERADESENKRECHT (90),
	KREUZUNGOBEN (180), KREUZUNGLINKS (90), KREUZUNGRECHTS (270), KREUZUNGUNTEN (0);
	
	private float rotation;
	
	private Ausrichtung(float rotation) {
		this.rotation = rotation;
	}
	
	public float getRotation() {
		return rotation;
	}
}
