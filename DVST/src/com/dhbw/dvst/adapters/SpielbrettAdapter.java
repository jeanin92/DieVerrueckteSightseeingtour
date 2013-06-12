package com.dhbw.dvst.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spielplatte;

public class SpielbrettAdapter extends ArrayAdapter<Spielplatte> {
    private Activity activity;
	private int position;

    /**
     * 
     * @param context momentaner Kontext
     * @param resourceId ID der Layout-Datei
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param spielbrett Listenobjekte
     */
    public SpielbrettAdapter(Activity activity, int resourceId, int textViewId,
        ArrayList<Spielplatte> spielbrett) {
    	super(activity, resourceId, textViewId, spielbrett);
    	this.activity = activity;
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

	private View fillGridViewItem(){
		RelativeLayout platte = new RelativeLayout(activity);		
		platte.addView(buildPlatte());
		if(this.getItem(this.position).getZiel()!=null){
			platte.addView(buildSehenswuerdigkeit());
		}
		if(this.getItem(this.position).getFigur()!=null){
			platte.addView(buildFigur());
		}	
		platte.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	    platte.setPadding(0, 0, 0, 0);
		return platte;
	}
	
	private View buildPlatte(){
		ImageView motiv = new ImageView(activity);
		int resID = activity.getResources().getIdentifier(this.getItem(this.position).getMotivURL(), "drawable", "com.dhbw.dvst");
		motiv.setImageResource(resID);
		int dimens = activity.getResources().getDimensionPixelOffset(R.dimen.dim_platte);
		motiv.setLayoutParams(new LayoutParams(dimens, dimens));
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
		int dimens = activity.getResources().getDimensionPixelOffset(R.dimen.dim_sight);
		motiv.setLayoutParams(new LayoutParams(dimens, dimens));
		return motiv;
	}

}
