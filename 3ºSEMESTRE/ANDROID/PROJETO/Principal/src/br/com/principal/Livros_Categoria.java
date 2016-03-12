package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Livros_Categoria extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.livros_categoria);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.livros__categoria, menu);
		return true;
	}

}
