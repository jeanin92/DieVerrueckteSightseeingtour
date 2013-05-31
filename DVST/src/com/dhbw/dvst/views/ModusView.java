package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.dhbw.dvst.R;

public class ModusView extends RelativeLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onEinspielerModus();
		public void onMehrspielerModus();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private Button btn_einspieler;
	private Button btn_mehrspieler;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public ModusView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_einspieler = (Button)findViewById(R.id.btn_einspieler);
		btn_mehrspieler = (Button)findViewById(R.id.btn_mehrspieler);
		
		btn_einspieler.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onEinspielerModus();
			}
		});
		
		btn_mehrspieler.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				viewListener.onMehrspielerModus();
			}
		});
	}
}
