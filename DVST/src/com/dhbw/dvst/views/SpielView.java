package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.dhbw.dvst.R;
import com.dhbw.dvst.adapters.PlayerListArrayAdapter;
import com.dhbw.dvst.adapters.SpielbrettAdapter;
import com.dhbw.dvst.models.Spiel;

public class SpielView extends LinearLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onBeenden();
		public void onReadManual();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_beenden;
	private Button btn_anleitung;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public SpielView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_beenden = (Button)findViewById(R.id.btn_beenden);
		btn_anleitung = (Button)findViewById(R.id.btn_anleitung);
		
		btn_beenden.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onBeenden();
			}
		});
		
		btn_anleitung.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onReadManual();
			}
		});
	}
}
