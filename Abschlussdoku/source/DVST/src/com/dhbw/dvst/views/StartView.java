package com.dhbw.dvst.views;

import com.dhbw.dvst.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class StartView extends RelativeLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onStartSettings();
		public void onReadManual();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_start;
	private Button btn_anleitung;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public StartView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_start = (Button)findViewById(R.id.btn_start);
		btn_anleitung = (Button)findViewById(R.id.btn_anleitung);
		
		btn_start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onStartSettings();
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
