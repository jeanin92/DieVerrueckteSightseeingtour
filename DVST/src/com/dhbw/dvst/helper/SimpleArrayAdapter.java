package com.dhbw.dvst.helper;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.dhbw.dvst.R;
import com.dhbw.dvst.activities.SpielerUebersichtActivity;
import com.dhbw.dvst.model.Spieler;

public class SimpleArrayAdapter extends ArrayAdapter<Spieler> implements OnItemClickListener {

	/**
	 * Speichert alle Spieler als Key und einen hochzählenden int-Wert als Value
	 */
    private HashMap<Spieler, Integer> mIdMap = new HashMap<Spieler, Integer>();
    private Context context;

    /**
     * 
     * @param context momentaner Kontext
     * @param resourceId ID der Layout-Datei
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param alleSpieler Listenobjekte
     */
    public SimpleArrayAdapter(Context context, int resourceId, int textViewId,
        ArrayList<Spieler> alleSpieler) {
      super(context, resourceId, textViewId, alleSpieler);
      this.context = context;
      for (int i = 0; i < alleSpieler.size(); ++i) {
        mIdMap.put(alleSpieler.get(i), i);
      }
    }

    @Override
    public long getItemId(int position) {
      Spieler item = getItem(position);
      return mIdMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
      return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	LayoutInflater inflater = (LayoutInflater) context
    	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View zeilenansicht = inflater.inflate(R.layout.zeilenansicht, parent, false);  
	    
	    ImageView imageView = (ImageView) zeilenansicht.findViewById(R.id.img_gewaehlte_figur);
	    String figur = this.getItem(position).getSpielfigur().getFarbe().toString();
	    String farbe = this.getItem(position).getSpielfigur().getForm().toString();
	    String imageName = figur + farbe;
	    int resID = context.getResources().getIdentifier(imageName, "drawable", "com.dhbw.dvst");	    
	    imageView.setImageResource(resID);
	    
	    TextView textView = (TextView) zeilenansicht.findViewById(R.id.tv_gewaehlter_name);
	    textView.setText(getItem(position).toString());  
	    
	    Button btn_bearbeiten = (Button) zeilenansicht.findViewById(R.id.btn_spieler_bearbeiten);
	    btn_bearbeiten.setBackgroundResource(R.drawable.ic_launcher);
	    
	    Button btn_loeschen = (Button) zeilenansicht.findViewById(R.id.btn_spieler_loeschen);
	    btn_loeschen.setBackgroundResource(R.drawable.ic_launcher);
	    
	    return zeilenansicht;
    }

	@Override
	public void onItemClick(AdapterView parent, View v, int position, long id) {
		// TODO Auto-generated method stub

	}


}
