package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.dhbw.dvst.R;

public class GeraeteView extends RelativeLayout{
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onGeraeteZahlAuswaehlen(int radioButton);
		public void onGeraetezahlBestaetigen();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private RadioButton einGeraet;
	private RadioButton mehrereGeraete;
	private Button okay;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public GeraeteView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		
		einGeraet = (RadioButton)findViewById(R.id.rb_eins);
		mehrereGeraete = (RadioButton)findViewById(R.id.rb_mehrere);
		okay = (Button)findViewById(R.id.btn_ok);
		
		einGeraet.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onGeraeteZahlAuswaehlen(R.id.rb_eins);
			}
		});
		
		mehrereGeraete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onGeraeteZahlAuswaehlen(R.id.rb_mehrere);
			}
		});
		
		okay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				viewListener.onGeraetezahlBestaetigen();	
			}
		});
	}
}
