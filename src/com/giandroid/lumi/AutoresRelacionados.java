package com.giandroid.lumi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AutoresRelacionados extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autores_relacionados);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.autores_relacionados, menu);
		return true;
	}

}
