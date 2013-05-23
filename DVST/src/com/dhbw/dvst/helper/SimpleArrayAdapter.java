package com.dhbw.dvst.helper;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.activities.SpielerBearbeitenActivity;
import com.dhbw.dvst.model.Spieler;

public class SimpleArrayAdapter extends ArrayAdapter<Spieler>{

	/**
	 * Speichert alle Spieler als Key und einen hochzählenden int-Wert als Value
	 */
    private HashMap<Integer, Spieler> mIdMap = new HashMap<Integer, Spieler>();
    private Activity activity;
    private int position;

    /**
     * 
     * @param context momentaner Kontext
     * @param resourceId ID der Layout-Datei
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param alleSpieler Listenobjekte
     */
    public SimpleArrayAdapter(Activity activity, int resourceId, int textViewId,
        ArrayList<Spieler> alleSpieler) {
    	super(activity, resourceId, textViewId, alleSpieler);
    	this.activity = activity;
    	for (int i = 0; i < alleSpieler.size(); ++i) {
    		mIdMap.put(i, alleSpieler.get(i));
    	}
    }

    @Override
    public boolean hasStableIds() {
      return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	LayoutInflater inflater = (LayoutInflater) activity
    	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View zeilenansicht = inflater.inflate(R.layout.zeilenansicht, parent, false);  
	    ImageView imageView = (ImageView) zeilenansicht.findViewById(R.id.img_gewaehlte_figur);
	    String figur = this.getItem(position).getSpielfigur().getForm().getText_de();
	    String farbe = this.getItem(position).getSpielfigur().getFarbe().getText_de();
	    String imageName = figur +"_"+ farbe;
	    int resID = activity.getResources().getIdentifier(imageName, "drawable", "com.dhbw.dvst");	    
	    imageView.setImageResource(resID);
	    
	    TextView textView = (TextView) zeilenansicht.findViewById(R.id.tv_gewaehlter_name);
	    textView.setText(getItem(position).toString());  
	    
	    Button btn_bearbeiten = (Button) zeilenansicht.findViewById(R.id.btn_spieler_bearbeiten);
	    btn_bearbeiten.setTag(position);
	    //TODO: bearbeitungsicon
	    btn_bearbeiten.setBackgroundResource(R.drawable.ic_launcher);
	    btn_bearbeiten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {     
            	Intent intent_edit_spieler = new Intent(activity,SpielerBearbeitenActivity.class)
					.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            	intent_edit_spieler.putExtra("spieler_index", (Integer)v.getTag());
            	activity.startActivity(intent_edit_spieler);
            }
	    });
	    
	    Button btn_loeschen = (Button) zeilenansicht.findViewById(R.id.btn_spieler_loeschen);
	    btn_loeschen.setTag(getItem(position));
	    //TODO: löschicon
	    btn_loeschen.setBackgroundResource(R.drawable.ic_launcher);
	    btn_loeschen.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				DeleteDialogue loeschen = new DeleteDialogue(activity, activity.getString(R.string.wirklich_loeschen), (Spieler)v.getTag());
				
			}
	    });
	    
	    return zeilenansicht;
    }

}
