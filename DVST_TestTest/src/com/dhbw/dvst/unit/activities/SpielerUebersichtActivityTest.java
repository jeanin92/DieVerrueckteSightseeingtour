package com.dhbw.dvst.unit.activities;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;

import com.dhbw.dvst.activities.SpielerUebersichtActivity;

public class SpielerUebersichtActivityTest extends
		ActivityUnitTestCase<SpielerUebersichtActivity> {
	private Activity mActivity;

	public SpielerUebersichtActivityTest() {
		super(SpielerUebersichtActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), SpielerUebersichtActivity.class);
		startActivity(intent, null, null);
		mActivity = getActivity();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
