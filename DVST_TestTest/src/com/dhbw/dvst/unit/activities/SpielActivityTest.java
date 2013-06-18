package com.dhbw.dvst.unit.activities;

import android.app.Activity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import com.dhbw.dvst.activities.SpielActivity;

public class SpielActivityTest extends
		ActivityUnitTestCase<SpielActivity> {
	private Activity mActivity;

	public SpielActivityTest() {
		super(SpielActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), SpielActivity.class);
		startActivity(intent, null, null);
		mActivity = getActivity();		
	}
	
//	nicht zu testen, da Löschdialog als Popup verwendet wird
//	public void testObBeendenListenerDefiniert(){
//		assertTrue("kein Listener für Startbutton definiert", btn_beenden.performClick());
//		
//	}
//	
//	public void testObSpielerGeloeschtNachBeenden(){	
//		btn_beenden.performClick();
//		assertTrue("Spieler wurden nicht gelöscht", Spiel.getInstance().getAlleSpieler().size()==0);		
//	}
//	
//	public void testObSpielkartenGeloeschtNachBeenden(){
//		btn_beenden.performClick();
//		assertNull("Kartenstapel wurde nicht gelöscht", Spiel.getInstance().getKartenstapel());
//	}
//	
//	public void testObSpielbrettGeloeschtNachBeenden(){
//		btn_beenden.performClick();
//		assertNull("Spielbrett wurde nicht gelöscht", Spiel.getInstance().getSpielbrett());
//	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
