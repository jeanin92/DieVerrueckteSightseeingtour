package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.dhbw.dvst.R;
import com.dhbw.dvst.activities.AnleitungActivity;

public class AnleitungView extends RelativeLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onStart();
		public void onBack();
	}
	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_weiter;
	private AnleitungActivity context;
	
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
		btn_weiter = (Button)findViewById(R.id.btn_start);
		
		context = (AnleitungActivity)getContext();
		if(context.imSpiel){
			btn_weiter.setText(R.string.zurueck);
			btn_weiter.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					viewListener.onBack();
				}
			});
		}
		else{
			btn_weiter.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					viewListener.onStart();
				}
			});
		}		
	}
}
