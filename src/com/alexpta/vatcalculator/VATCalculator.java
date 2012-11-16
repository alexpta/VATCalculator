package com.alexpta.vatcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class VATCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vatcalculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_vatcalculator, menu);
		return true;
	}

}
