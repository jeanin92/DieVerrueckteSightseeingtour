package com.dhbw.dvst.utilities;

import com.dhbw.dvst.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Meldung {

	protected boolean gedrueckterButton = false;

	public Meldung(Activity activity, String nachricht) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(nachricht);
		builder.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Meldung.this.gedrueckterButton  = false;
				dialog.cancel();											
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}
}