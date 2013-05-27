package com.dhbw.dvst.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

import com.dhbw.dvst.R;

public class LoeschDialog {

	public LoeschDialog(Activity activity, String message, OnClickListener posListener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(message);
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
