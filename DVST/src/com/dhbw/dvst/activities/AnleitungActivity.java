package com.dhbw.dvst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.views.AnleitungView;

public class AnleitungActivity extends Activity {
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private AnleitungView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = (AnleitungView)View.inflate(this, R.layout.anleitung, null);
		view.setViewListener(viewListener);
		setContentView(view);
	}
	
	/**
	 * This is how we receive events from the view.(Funktionen, die im View im Template aufgerufen werden)
	 * The view takes user actions
	 * The controller/activity responds to user actions
	 */
	private AnleitungView.ViewListener viewListener = new AnleitungView.ViewListener() {
		
		@Override
		public void onStart() {
        	Spiel.resetInstance();
            kommunikation.navigieren(AnleitungActivity.this, ModusActivity.class);
		}
	};
}
