package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Manutencao_do_Livo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manutencao_do__livro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manutencao_do__livo, menu);
		return true;
	}

}
