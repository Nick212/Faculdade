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

public class Adm_Categoria_Cadastro extends Activity {

	EditText txtCategoria;
	EditText txtDesc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adm_categoria_cadastro_old);
		
		txtCategoria = (EditText) findViewById(R.id.txtCategoria);
		txtDesc = (EditText) findViewById(R.id.txtDesc);
	}

	public void btnCadastrar_Click(View view){
		
		String categoria = txtCategoria.getText().toString();
		String desc = txtDesc.getText().toString();
		
		if (categoria.equals("")){
			Toast.makeText(this, "Entre com a Categoria!", Toast.LENGTH_SHORT).show();
			txtCategoria.requestFocus();
		}
		else
		{
			SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
					
			Cursor rs = db.rawQuery("SELECT * FROM tb_categoria WHERE nome = ?", new String[]{ categoria });
					
			if (rs.getCount() > 0) {
				Toast.makeText(this, "Categoria já cadastrada!", Toast.LENGTH_SHORT).show();
				txtCategoria.requestFocus();
			}
			else{
				Cursor rsCount = db.rawQuery("SELECT CASE WHEN Max(codigo) IS NULL THEN 0 ELSE  Max(codigo) END codigo FROM tb_categoria",null);
				int ID=1;
				String strValor;
				if (rsCount.moveToFirst())
					ID = rsCount.getInt(0)+1;
				
				
				strValor = String.valueOf(ID);
				
				db.execSQL("INSERT INTO tb_categoria (codigo,nome,descricao) VALUES(?,?,?) ",new String[]{strValor, categoria, desc});
				Toast.makeText(this, "Categoria inserida com sucesso!", Toast.LENGTH_SHORT).show();
				
				txtCategoria.setText(null);
				txtDesc.setText(null);
				txtCategoria.requestFocus();
				
			} 
		}
		
	}
	
	public void btnVoltar_Click(View view){
		Intent it = new Intent(this, Administracao.class);
		startActivity(it);
		
	}

}
