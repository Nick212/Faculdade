package br.com.principal;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Adm_Categoria_Manutencao_da_Categoria extends Activity {

	
	EditText txtCategoria;
	EditText txtDesc;
	TextView txtCodigo;
	String categoria = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adm_categoria_manutencao_da_categoria);
		
		txtCategoria = (EditText) findViewById(R.id.txtCategoria);
		txtDesc = (EditText) findViewById(R.id.txtDesc);
		txtCodigo = (TextView) findViewById(R.id.txtCodigo);
		
		Intent it = getIntent();
		categoria =  it.getStringExtra("nome");

		pesquisaCategoria();
		txtCategoria.requestFocus();
	}

void pesquisaCategoria()
{
	SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
	
	
	Cursor rs = db.rawQuery("SELECT codigo,nome,descricao FROM tb_categoria WHERE nome=?", new String[] { categoria });

	if (rs.moveToNext() == true){
		txtCodigo.setText(rs.getString(0));
		txtCategoria.setText(categoria);
		txtDesc.setText(rs.getString(2));
	}
	
}
public void btnAlterar_Click(View view){
		
		String categoria = txtCategoria.getText().toString();
		String desc = txtDesc.getText().toString();
		String codigo = txtCodigo.getText().toString();
		
		if (categoria.equals(null)){
			Toast.makeText(this, "Entre com a Categoria!", Toast.LENGTH_SHORT).show();
			txtCategoria.requestFocus();
		}
		else
		{
			SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
			
			db.execSQL("UPDATE tb_categoria  SET nome=?,descricao=? WHERE codigo=?", new String[]{ categoria, desc, codigo});
			Toast.makeText(this, "Categoria alterada com sucesso!", Toast.LENGTH_SHORT).show();
			Intent it = new Intent(this, Adm_Categoria_Lista_de_Categoria.class);
			startActivity(it);
		
		}
		
	}
}
