package com.dhbw.dvst.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielplatte;

public class SpielbrettAdapter extends ArrayAdapter<Spielplatte> {
    private Activity activity;
	private int position;
	private int plattenHoehe;
	private RelativeLayout platte;

    /**
     * 
     * @param context momentaner Kontext
     * @param resourceId ID der Layout-Datei
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param spielbrett Listenobjekte
     */
    public SpielbrettAdapter(Activity activity, int resourceId, int textViewId, ArrayList<Spielplatte> spielbrett) {
    	super(activity, resourceId, textViewId, spielbrett);
    	this.activity = activity;
    	DisplayMetrics metrics = activity.getResources().getDisplayMetrics(); 
		this.plattenHoehe = Math.round(metrics.heightPixels/7);
    }

    @Override
    public boolean hasStableIds() {
      return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	this.position = position;
	    return fillGridViewItem();
    }

	private View fillGridViewItem() {
		platte = new RelativeLayout(activity);		
		platte.addView(buildPlatte());
		if(this.getItem(this.position).getZiel()!=null){
			platte.addView(buildSehenswuerdigkeit());
		}
		if(this.getItem(this.position).getFigur()!=null){
			platte.addView(buildFigur());
		}	
		platte.setLayoutParams(new LayoutParams(this.plattenHoehe, this.plattenHoehe));
	    platte.setPadding(0, 0, 0, 0);
	    centerChildren(platte);
	    setzePlattenKlickbar();
		return platte;
	}
	
	private View buildPlatte(){
		ImageView motiv = new ImageView(activity);
		int resID = activity.getResources().getIdentifier(this.getItem(this.position).getMotivURL(), "drawable", "com.dhbw.dvst");
		motiv.setImageResource(resID);
		motiv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//		Achtung: erst ab API11 möglich!!!
		motiv.setRotation(this.getItem(this.position).getAusrichtung().getRotation());
		return motiv;
	}
	
	private View buildFigur(){
		ImageView motiv = new ImageView(activity);
		int resID = activity.getResources().getIdentifier(this.getItem(this.position).getFigur().getMotivUrl(), "drawable", "com.dhbw.dvst");
		motiv.setImageResource(resID);
		int dimens = activity.getResources().getDimensionPixelOffset(R.dimen.dim_figur);
		motiv.setLayoutParams(new LayoutParams(dimens, dimens));
		return motiv;
	}
	
	private View buildSehenswuerdigkeit(){
		ImageView motiv = new ImageView(activity);
		int resID = activity.getResources().getIdentifier(this.getItem(this.position).getZiel().getMotivURL(), "drawable", "com.dhbw.dvst");
		motiv.setImageResource(resID);		
		motiv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		motiv.setPadding(5, 5, 5, 5);
		return motiv;
	}
	
	private void centerChildren(RelativeLayout platte){
		for (int i = 0; i < platte.getChildCount(); i++) {
		    View view = platte.getChildAt(i);
		    LayoutParams layout = (LayoutParams)view.getLayoutParams();
			layout.addRule(RelativeLayout.CENTER_IN_PARENT);
			view.setLayoutParams(layout);
		}
	}
	
	private void setzePlattenKlickbar() {
		if(Spiel.getInstance().getAblauf().isPlatteEinschieben()) {
			if(this.getItem(this.position).isSchiebbar()==false){
		    	platte.setClickable(true);
		    }
		    else{
		    	platte.setClickable(false);
		    }
		} else if(Spiel.getInstance().getAblauf().isFigurZiehen()) {
			platte.setClickable(false);
		}
	}
}
