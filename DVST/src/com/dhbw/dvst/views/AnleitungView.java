package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dhbw.dvst.R;

public class AnleitungView extends RelativeLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onStart();
	}
	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_start;
	private TextView hd_anleitung;
	private TextView tv_text;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public AnleitungView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_start = (Button)findViewById(R.id.btn_start);
		tv_text = (TextView)findViewById(R.id.tv_anleitung);
		hd_anleitung = (TextView)findViewById(R.id.hd_anleitung);
		
		btn_start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onStart();
			}
		});
	}
}
