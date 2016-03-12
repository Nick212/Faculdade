package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Lista_de_Livros extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_de__livros);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_de__livros, menu);
		return true;
	}

}
