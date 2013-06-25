package com.dhbw.dvst.utilities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Sehenswuerdigkeit;
import com.dhbw.dvst.models.Spiel;

public class KarteZiehenDialog {

	public KarteZiehenDialog(Activity activity, OnClickListener okListener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		Sehenswuerdigkeit ziel = Spiel.getInstance().getSpielerAnDerReihe().getZiel();
		builder.setMessage(activity.getString(R.string.naechstesZiel)+" "+ziel.name());
		LayoutInflater factory = LayoutInflater.from(activity);
		final View view = factory.inflate(R.layout.karte_ziehen, null);
		builder.setView(view);
		builder.setNeutralButton(R.string.OK, okListener);
		AlertDialog alert = builder.create();
		alert.show();
	}
}
