package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dhbw.dvst.R;

public class SpielView extends LinearLayout {

	
	/**
	 * The interface to send events from the view to the controller
	 */
	public static interface ViewListener {
		public void onBeenden();
		public void onReadManual();
		public void onNachLinksDrehen();
		public void onNachRechtsDrehen();
	}

	private ViewListener viewListener;
	private Button btn_beenden;
	private Button btn_anleitung;
	private ImageButton btn_rechts_drehen;
	private ImageButton btn_links_drehen;
	private ImageView img_aktive_platte;
	
	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}
	
	public SpielView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		btn_beenden = (Button)findViewById(R.id.btn_beenden);
		btn_anleitung = (Button)findViewById(R.id.btn_anleitung);
		btn_rechts_drehen = (ImageButton)findViewById(R.id.btn_rechts_drehen);
		btn_links_drehen = (ImageButton)findViewById(R.id.btn_links_drehen);
		img_aktive_platte = (ImageView) findViewById(R.id.img_aktive_platte);
		
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
		
		btn_rechts_drehen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				viewListener.onNachRechtsDrehen();
			}
		});
		
		btn_links_drehen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				viewListener.onNachLinksDrehen();	
			}
		});
		
		img_aktive_platte.setBackground();
	}
}
