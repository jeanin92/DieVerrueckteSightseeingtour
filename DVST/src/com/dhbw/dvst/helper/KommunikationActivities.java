package com.dhbw.dvst.helper;

import android.app.Activity;
import android.content.Intent;

public class KommunikationActivities{
	
	public void navigieren(Activity quelle, Class ziel) {
		Intent intent = new Intent(quelle, ziel);                
		quelle.startActivity(intent);
	}

}
