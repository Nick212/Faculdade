package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Pesquisar_Livros extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pesquisar__livros);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pesquisar__livros, menu);
		return true;
	}

}
