package com.dhbw.dvst.helper;

import android.app.Activity;

public class SimpleErrorMessage extends PopupService{

	public SimpleErrorMessage(Activity activity, String fehler) {
		super(activity, fehler);
	}
}