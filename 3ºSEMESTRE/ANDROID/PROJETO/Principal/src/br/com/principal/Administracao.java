package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Administracao extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.administracao);
	}

	public void CadCategorias(View view){
		Intent it = new Intent(this, Adm_Categoria_Cadastro.class);
		startActivity(it);
		
		
	}
	public void ListaCategorias(View view){
		Intent it = new Intent(this, Adm_Categoria_Lista_de_Categoria.class);
		startActivity(it);
		
	}
	
	public void CadLivros(View view){
		Intent it = new Intent(this, Cadastro_de_Livro.class);
		startActivity(it);
		
		
	}
	public void ListaLivros(View view){
		Intent it = new Intent(this, Lista_de_Livros.class);
		startActivity(it);
		
	}
	public void btnAdmDados_Click(View v){
		Intent it = new Intent(this, Alterar_Dados_Usuario.class);
		startActivity(it);
	}
	
	public void alterarSenha(View v){
		Intent it = new Intent (this, Alterar_Senha_Usuario.class);
		startActivity(it);
		
	}
}

