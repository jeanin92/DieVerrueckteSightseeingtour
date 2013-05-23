package com.dhbw.dvst.helper;

import java.util.HashMap;

import com.dhbw.dvst.R;
import com.dhbw.dvst.model.Spieler;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class DeleteDialogue {

	public DeleteDialogue(Activity activity, String fehler) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(fehler)
			.setPositiveButton(R.string.ja, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
				}
			})
			.setNegativeButton(R.string.nein, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();											
				}
			});
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	
}
