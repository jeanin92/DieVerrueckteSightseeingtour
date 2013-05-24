package com.dhbw.dvst.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.dhbw.dvst.R;
import com.dhbw.dvst.activities.SpielerActivity;
import com.dhbw.dvst.activities.SpielerUebersichtActivity;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;
import com.dhbw.dvst.model.Spieler;

public class DeleteDialogue {
	private Spiel spiel = Control.getInstance();
	private Spieler spieler;

	public DeleteDialogue(Activity activity, String fehler, Spieler spieler) {
		this.spieler = spieler;
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setMessage(fehler)
			.setPositiveButton(R.string.ja, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					spiel.spielerLoeschen(DeleteDialogue.this.spieler);
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
