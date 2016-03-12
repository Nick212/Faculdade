package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esqueceu_a_Senha extends Activity {

	
	EditText txtUsuario;
	EditText txtSenha;
	EditText txtConfSenha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.esqueceu_a_senha);
		
		txtUsuario = (EditText) findViewById(R.id.txtUsuario);
		txtSenha =  (EditText) findViewById(R.id.txtSenha);
		txtConfSenha =  (EditText) findViewById(R.id.txtConfSenha);
		
	}

	public void btnOK_Click(View view){
	
		String login = txtUsuario.getText().toString();
		String senha = txtSenha.getText().toString();
		String confSenha = txtConfSenha.getText().toString();
		
		if (!senha.equals(confSenha)){
			Toast.makeText(this, "Senha diferente da confirmação!", Toast.LENGTH_SHORT).show();
			txtSenha.requestFocus();
		}
		else
		{
			SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
					
			Cursor rs = db.rawQuery("SELECT * FROM tb_usuario WHERE login = ?", new String[]{ login });
					
			if (rs.moveToNext() == true) {
				db.execSQL("UPDATE tb_usuario SET senha = ? WHERE login = ? ",new String[]{senha, login});
				Toast.makeText(this, "Senha alterada com sucesso!", Toast.LENGTH_SHORT).show();
				Intent it = new Intent(this, Login.class);
				startActivity(it);
				
			} else {
				Toast.makeText(this, "Usuário não encontrado!", Toast.LENGTH_SHORT).show();
				txtUsuario.requestFocus();
				
			}
		}
		
	}

}
