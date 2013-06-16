package com.dhbw.dvst.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.dhbw.dvst.models.Sehenswuerdigkeit;
import com.dhbw.dvst.models.Spiel;

public class KarteZiehenView extends ImageView {
	
	/**
	 * Constructor for xml layouts
	 */
	public KarteZiehenView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * Find our references to the objects in the xml layout
	 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		Sehenswuerdigkeit ziel = Spiel.getInstance().getSpielerAnDerReihe().getZiel();
		this.setImageResource(getResources().getIdentifier(ziel.getMotivURL(), "drawable", "com.dhbw.dvst"));
		
	}
}
