package com.dhbw.dvst.helper;

import java.util.ArrayList;
import java.util.HashMap;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.dhbw.dvst.model.Spieler;

public class SimpleArrayAdapter extends ArrayAdapter<Spieler> {

	/**
	 * Speichert alle Spieler als Key und einen hochzählenden int-Wert als Value
	 */
    HashMap<Spieler, Integer> mIdMap = new HashMap<Spieler, Integer>();

    public SimpleArrayAdapter(Context context, int textViewResourceId,
        ArrayList<Spieler> alleSpieler) {
      super(context, textViewResourceId, alleSpieler);
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



}
