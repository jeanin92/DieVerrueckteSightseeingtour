package com.dhbw.dvst.utilities;

import android.app.Activity;
import android.content.Intent;

public class ActivityInteraction{
	
	public void navigieren(Activity quelle, Class ziel) {
		Intent intent = new Intent(quelle, ziel);                
		quelle.startActivity(intent);
	}

}
