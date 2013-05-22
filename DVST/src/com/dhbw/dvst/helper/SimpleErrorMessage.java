package com.dhbw.dvst.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.dhbw.dvst.R;

public class SimpleErrorMessage {

	public SimpleErrorMessage(Activity activity, String fehler) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(fehler)
			.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();											
				}
			});
		AlertDialog alert = builder.create();
		alert.show();
	}
}