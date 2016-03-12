package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	
	EditText txtUsuario;
	EditText txtSenha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		txtUsuario = (EditText) findViewById(R.id.txtUsuario);
		txtSenha =  (EditText) findViewById(R.id.txtSenha);
		
		txtUsuario.requestFocus();
		
	}
	public void btnOK_Click(View view){
		

		SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
				
		String login = txtUsuario.getText().toString();
		String senha = txtSenha.getText().toString();
		Cursor rs = db.rawQuery("SELECT * FROM tb_usuario WHERE login = ? AND senha = ?", new String[]{ login, senha });
				
		if (rs.moveToNext() == true) {
			Intent it = new Intent(this, Administracao.class);
			startActivity(it);
		} else {
			Toast.makeText(this, "Usuário ou senha inválida!", Toast.LENGTH_SHORT).show();
			
		}
		
	}
	
	public void btnEsqueceu_Click(View view){
		Intent it = new Intent(this, Esqueceu_a_Senha.class);
		startActivity(it);
		
		
	}

}
