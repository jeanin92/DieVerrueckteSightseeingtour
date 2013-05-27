package com.dhbw.dvst.utilities;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.dhbw.dvst.R;

public class SpinnerBuilder {

	public Spinner initFormspinner(Activity activity) {
		Spinner spin_form = (Spinner) activity.findViewById(R.id.spin_figur);		
		ArrayAdapter<CharSequence> adapt_figur = ArrayAdapter.createFromResource(activity, R.array.figuren, android.R.layout.simple_spinner_item);
		spin_form.setAdapter(adapt_figur);
		return spin_form;
	}
	
	public Spinner initFarbspinner(Activity activity) {
		Spinner spin_farbe = (Spinner) activity.findViewById(R.id.spin_farbe);
		ArrayAdapter<CharSequence> adapt_farbe = ArrayAdapter.createFromResource(activity, R.array.farben, android.R.layout.simple_spinner_item);
		spin_farbe.setAdapter(adapt_farbe);
		return spin_farbe;
	}
}
