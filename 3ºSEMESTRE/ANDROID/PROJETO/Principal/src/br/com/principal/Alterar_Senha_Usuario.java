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
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;



public class Alterar_Senha_Usuario extends Activity {

	EditText usuario;
	EditText senhaNova;
	EditText confirmaSenha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alterar__senha__usuario);

		usuario = (EditText) findViewById(R.id.txtUsuario);
		senhaNova = (EditText) findViewById(R.id.txtSenhaNova);
		confirmaSenha = (EditText) findViewById(R.id.txtConfirmarSenha);
	}

	public void alterarSenha(View v) {

		String user = usuario.getText().toString();
		String senha = senhaNova.getText().toString();
		String confirma = confirmaSenha.getText().toString();

		boolean valido = true;

		if (user.equals("")) {
			Toast.makeText(this, "Entre com o usuario!", Toast.LENGTH_SHORT)
					.show();
			valido = false;
			usuario.requestFocus();
		}
		if (senhaNova.equals("")) {
			Toast.makeText(this, "Digite a senha Nova!", Toast.LENGTH_SHORT)
					.show();
			valido = false;
			senhaNova.requestFocus();
		}
		/*if (!(confirmaSenha.equals(senhaNova))) {
			Toast.makeText(this, "Confirmação  da Senha Inválida!",
					Toast.LENGTH_SHORT).show();
			valido = false;
			confirmaSenha.requestFocus();
		}*/

		if (valido) {
			SQLiteDatabase db = new DBHelper(this, "tb_usuario", 1)
					.getWritableDatabase();

			Cursor rsCount = db.rawQuery("SELECT CASE WHEN Max(codigo) IS NULL THEN 0 ELSE  Max(codigo) END codigo FROM tb_usuario",null);
			int ID=1;
			String strValor;
			if (rsCount.moveToFirst())
				ID = rsCount.getInt(0)+1;
			
			
			strValor = String.valueOf(ID);
			
			db.execSQL("UPDATE tb_usuario (senha) VALUES(?) WHERE login(?) ",new String[]{senha,user});
			Toast.makeText(this, "Senha Alterada", Toast.LENGTH_SHORT).show();
			
			usuario.setText(null);
			senhaNova.setText(null);
			confirmaSenha.setText(null);
			usuario.requestFocus();
		

		}
	}

}
