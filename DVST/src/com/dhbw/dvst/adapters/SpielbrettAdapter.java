package com.dhbw.dvst.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dhbw.dvst.models.Spielplatte;

public class SpielbrettAdapter extends ArrayAdapter<Spielplatte> {

	/**
	 * Speichert alle Spieler als Values und einen hochzählenden int-Wert als Key
	 */
    private Activity activity;
	private int position;

    /**
     * 
     * @param context momentaner Kontext
     * @param resourceId ID der Layout-Datei
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param alleSpieler Listenobjekte
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
		platte.addView(buildPlattenMotiv());
	    return platte;
	}
	
	private View buildPlattenMotiv(){
		ImageView motiv = new ImageView(activity);
		int resID = activity.getResources().getIdentifier(this.getItem(this.position).getMotivURL(), "drawable", "com.dhbw.dvst");
		motiv.setImageResource(resID);
//		Achtung: erst ab API11 möglich!!!
		motiv.setRotation(this.getItem(this.position).getAusrichtung().getRotation());
		return motiv;
	}

}
