package com.dhbw.dvst.functionaltests;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

import com.dhbw.dvst.activities.StartActivity;

public class StartActivityTest extends
		ActivityUnitTestCase<StartActivity> {
	private Activity mActivity;
	private int button_id;

	public StartActivityTest() {
		super(StartActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), StartActivity.class);
		startActivity(intent, null, null);
		mActivity = getActivity();
	}
	
	public void testLayout(){
		button_id = com.dhbw.dvst.R.id.btn_start;
		assertNotNull(mActivity.findViewById(button_id));
		Button view = (Button) mActivity.findViewById(button_id);
		assertEquals("falscher Text für Startbutton", mActivity.getString(com.dhbw.dvst.R.string.spiel_starten), view.getText());
		
		button_id = com.dhbw.dvst.R.id.btn_anleitung;
		assertNotNull(mActivity.findViewById(button_id));
		view = (Button) mActivity.findViewById(button_id);
		assertEquals("falscher Text für Anleitungsbutton", mActivity.getString(com.dhbw.dvst.R.string.anleitung_lesen), view.getText());
	}
	
	public void testIntentViaOnClick(){
		button_id = com.dhbw.dvst.R.id.btn_start;
		Button view = (Button) mActivity.findViewById(button_id);
		assertNotNull("Button not allowed to be null", view);
		view.performClick();
		Intent intent = getStartedActivityIntent();
		assertNotNull("intent was null", intent);
		
		button_id = com.dhbw.dvst.R.id.btn_anleitung;
		view = (Button) mActivity.findViewById(button_id);
		assertNotNull("Button not allowed to be null", view);
		view.performClick();
		intent = getStartedActivityIntent();
		assertNotNull("intent was null", intent);
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
