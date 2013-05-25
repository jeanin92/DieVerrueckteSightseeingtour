package com.dhbw.dvst.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

import com.dhbw.dvst.R;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;
import com.dhbw.dvst.model.Spieler;

public class LoeschDialog {

	public LoeschDialog(Activity activity, String fehler, OnClickListener posListener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(fehler);
		builder.setPositiveButton(R.string.ja, posListener);
		builder.setNegativeButton(R.string.nein, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();											
				}
		});
		AlertDialog alert = builder.create();
		alert.show();
	}
}
