package com.dhbw.dvst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.views.StartView;

public class StartActivity extends Activity {
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private StartView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		view = (StartView)View.inflate(this, R.layout.start, null);
		view.setViewListener(viewListener);
		setContentView(view);
	}
	
	/**
	 * This is how we receive events from the view.(Funktionen, die im View im Template aufgerufen werden)
	 * The view takes user actions
	 * The controller/activity responds to user actions
	 */
	private StartView.ViewListener viewListener = new StartView.ViewListener() {
		
		@Override
		public void onStartSettings() {
        	Spiel.resetInstance();
            kommunikation.navigieren(StartActivity.this, ModusActivity.class);
		}

		@Override
		public void onReadManual() {
			kommunikation.navigieren(StartActivity.this, AnleitungActivity.class);
		}
	};
}
