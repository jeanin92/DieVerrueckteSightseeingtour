package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.dhbw.dvst.R;

public class SpielerView extends RelativeLayout{
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public boolean onTastaturVerstecken(int keyCode, KeyEvent event);
		public void onSpielerSpeichern();
	}

	
	/**
	 * The listener reference for sending events
	 */
	private ViewListener viewListener;
	private EditText et_name;
	private Button btn_speichern;
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	/**
	 * Constructor for xml layouts
	 */
	public SpielerView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		
		this.et_name = (EditText) findViewById(R.id.et_name);
		btn_speichern = (Button) findViewById(R.id.btn_erstellen);
		
		et_name.setOnKeyListener(new OnKeyListener() {
		    public boolean onKey(View v, int keyCode, KeyEvent event) {
		        return viewListener.onTastaturVerstecken(keyCode, event);
		    }
		});
		
		btn_speichern.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	viewListener.onSpielerSpeichern();        	
	        }
	    });
	}
}
