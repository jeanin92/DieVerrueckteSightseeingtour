package com.dhbw.dvst.utilities;

import com.dhbw.dvst.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Fehlermeldung {

	protected boolean gedrueckterButton = false;

	public Fehlermeldung(Activity activity, String fehler) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(fehler);
		builder.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Fehlermeldung.this.gedrueckterButton  = false;
				dialog.cancel();											
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}
}