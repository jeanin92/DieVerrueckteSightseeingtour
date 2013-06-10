package com.dhbw.dvst.models;

import java.util.Random;

public class Spielkarte {
	protected Sehenswuerdigkeiten sehenswuerdigkeit;
	protected Sehenswuerdigkeiten[] sehenswuerdigkeitenArray;
	protected int randomIndex;
	
	protected Sehenswuerdigkeiten randomizesehenswuerdigkeiten() {
		Random randomizer = new Random();
		randomIndex = randomizer.nextInt(sehenswuerdigkeitenArray.length);
		return this.sehenswuerdigkeitenArray[randomIndex];
}

}