package com.dhbw.dvst.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spieler;

public class FortschrittArrayAdapter extends ArrayAdapter<Spieler> {
    private Activity activity;
	private int position;

    /**
     * 
     * @param context momentaner Kontext
     * @param textViewId ID des Textviews in der Layout-Datei
     * @param alleSpieler Listenobjekte
     */
    public FortschrittArrayAdapter(Activity activity, int textViewId,
        ArrayList<Spieler> alleSpieler) {
    	super(activity, textViewId, alleSpieler);
    	this.activity = activity;
    }

    @Override
    public boolean hasStableIds() {
      return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	this.position = position;
	    return fillListViewItem();
    }

	private View fillListViewItem() {
		LinearLayout listItem = new LinearLayout(activity);
	    listItem.addView(getSpielerName());
	    listItem.addView(getFortschritt());
	    return listItem;
	}
	
	private View getSpielerName() {
		TextView textView = new TextView(activity);
		SpannableString content = new SpannableString(getItem(this.position).toString());
	    if(getItem(this.position).isAnDerReihe()){
	    	content.setSpan(new StyleSpan(Typeface.BOLD), 0, content.length(), 0);
	    }
	    else{
	    	content.setSpan(new StyleSpan(Typeface.NORMAL), 0, content.length(), 0);
	    }		
	    textView.setText(content);
	    textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0.5f));
	    return textView;
	}
	
	private View getFortschritt(){
		TextView textView = new TextView(activity);
	    textView.setText(activity.getString(R.string.besucht)+": "+getItem(this.position).getFortschritt());
	    textView.setGravity(Gravity.RIGHT);
	    textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0.5f));
	    return textView;
	}

}
