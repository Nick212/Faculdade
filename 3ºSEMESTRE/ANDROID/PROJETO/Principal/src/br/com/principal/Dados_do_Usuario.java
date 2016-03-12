package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Dados_do_Usuario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dados_do__usuario);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dados_do__usuario, menu);
		return true;
	}
	
	public void alterarSenhaUsuario(View v){
		Intent it = new Intent(this, Alterar_Senha_Usuario.class);
		startActivity(it);
	}

	public void alterarDadosUsuario(View v){
		
		Intent it = new Intent(this, Alterar_Dados_Usuario.class);
		startActivity(it);
		
	}
	
}
