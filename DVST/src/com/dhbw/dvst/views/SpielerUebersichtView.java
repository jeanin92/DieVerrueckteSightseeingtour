package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.dhbw.dvst.R;

public class SpielerUebersichtView extends RelativeLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onNeuerSpieler();
		public void onModusWechseln();
		public void onSpielStarten();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_neu;
	private Button btn_moduswechsel;
	private Button btn_zumSpiel;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public SpielerUebersichtView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_neu = (Button)findViewById(R.id.btn_neu);
		btn_moduswechsel = (Button)findViewById(R.id.btn_modus_wechseln);
		btn_zumSpiel = (Button)findViewById(R.id.btn_zum_spiel);
		
		btn_neu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onNeuerSpieler();
			}
		});
		
		btn_moduswechsel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onModusWechseln();
			}
		});
		
		btn_zumSpiel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onSpielStarten();
			}
		});
	}
}
