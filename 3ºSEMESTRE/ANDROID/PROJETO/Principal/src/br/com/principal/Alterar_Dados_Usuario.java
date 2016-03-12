package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Alterar_Dados_Usuario extends Activity {

	EditText txtNome;
	EditText txtIdImagem;
	EditText txtEmail;
	EditText txtTelefone;
	EditText txtEndereco;
	EditText txtComplemento;
	EditText txtBairro;
	EditText txtCidade;
	EditText txtUf;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alterar__dados__usuario);

		txtNome = (EditText) findViewById(R.id.txtNome1);
		txtIdImagem = (EditText) findViewById(R.id.txtIdImagem);
		txtEmail = (EditText) findViewById(R.id.txtEmail);
		txtTelefone = (EditText) findViewById(R.id.txtTelefone);
		txtEndereco = (EditText) findViewById(R.id.txtEndereco);
		txtComplemento = (EditText) findViewById(R.id.txtComplemento);
		txtBairro = (EditText) findViewById(R.id.txtBairro);
		txtCidade = (EditText) findViewById(R.id.txtCidade);
		txtUf = (EditText) findViewById(R.id.txtUf);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alterar__dados__usuario, menu);
		return true;

	}

	public void salvarAlteracao(View v) {

		SQLiteDatabase db = new DBHelper(this, "db_dadosUsuario", 1)
				.getWritableDatabase();

		String nome = txtNome.getText().toString();
		String idImagem = txtIdImagem.getText().toString();
		String email = txtEmail.getText().toString();
		String telefone = txtTelefone.getText().toString();
		String endereco = txtEndereco.getText().toString();
		String complemento = txtComplemento.getText().toString();
		String bairro = txtBairro.getText().toString();
		String cidade = txtCidade.getText().toString();
		String uf = txtUf.getText().toString();

		db.execSQL(
				"INSERT INTO tb_dadosUsuario (login,nome,idImagem,email,"
						+ "telefone,endereco,complemento,bairro,cidade,uf) values(?,?,?,?,?,?,?,?,?)",
				new String[] { nome, nome, idImagem, email, telefone, endereco,
						complemento, bairro, cidade, uf});

		Toast.makeText(this, "Usuário cadastrado com sucesso!",
				Toast.LENGTH_SHORT).show();

		// Cursor rs =
		// db.rawQuery("UPDATE * FROM tb_usuario WHERE login = ? AND senha = ?",
		// new String[]{ login, senha });

	}
	
	//cadastrarNovoProduto
}
