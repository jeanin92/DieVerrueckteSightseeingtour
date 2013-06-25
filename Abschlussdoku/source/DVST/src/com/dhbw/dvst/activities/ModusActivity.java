package com.dhbw.dvst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.dhbw.dvst.R;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.views.ModusView;

public class ModusActivity extends Activity {
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private ModusView view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = (ModusView)View.inflate(this, R.layout.modus, null);
		view.setViewListener(viewListener);
		setContentView(view);
	}

	/**
	 * This is how we receive events from the view.(Funktionen, die im View im Template aufgerufen werden)
	 * The view takes user actions
	 * The controller/activity responds to user actions
	 */
	private ModusView.ViewListener viewListener = new ModusView.ViewListener() {
		
		@Override
		public void onEinspielerModus(){
        	//TODO: einspieler modus
		}
		
		@Override
		public void onMehrspielerModus() {
			kommunikation.navigieren(ModusActivity.this, GeraeteActivity.class);			
		}
	};

}
