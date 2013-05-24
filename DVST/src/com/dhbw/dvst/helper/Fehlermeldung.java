package com.dhbw.dvst.helper;

import android.app.Activity;

public class Fehlermeldung extends PopupService{

	public Fehlermeldung(Activity activity, String fehler) {
		super(activity, fehler);
	}
}