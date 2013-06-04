package com.dhbw.dvst.unit.activities;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

import com.dhbw.dvst.activities.StartActivity;
import com.dhbw.dvst.models.Spiel;

public class StartActivityTest extends
		ActivityUnitTestCase<StartActivity> {
	private Activity mActivity;
	private Button btn_start;

	public StartActivityTest() {
		super(StartActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), StartActivity.class);
		startActivity(intent, null, null);
		mActivity = getActivity();
		btn_start = (Button)mActivity.findViewById(com.dhbw.dvst.R.id.btn_start);
	}
	
	public void testObSpielerNeuGesetzt(){		
		btn_start.performClick();
		assertTrue("Spieler wurden nicht neu gesetzt", Spiel.getInstance().getAlleSpieler().size()==0);		
	}
	
	public void testObStartListenerDefiniert(){
		assertTrue("kein Listener für Startbutton definiert", btn_start.performClick());
	}
	
	public void testObSpielInstanceExistiert(){
		btn_start.performClick();
		assertNotNull("Spiel wurde nicht initialisiert", Spiel.getInstance());
	}
	
	public void testObFigurenInitialisiert(){
		btn_start.performClick();
		assertTrue("Spielfiguren wurden nicht initialisiert", Spiel.getInstance().getAlleSpielfiguren().size()==0);
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
