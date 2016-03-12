package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class Cadastro_de_Livro extends Activity {

	EditText txtISBN;
	EditText txtTitulo;
	EditText txtSubTitulo;
	EditText txtEdicao;
	EditText txtAutor;
	EditText txtPagina;
	EditText txtAno;
	EditText txtEditora;
	ExpandableListView lstCategoria;
	EditText txtIDImagem;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_de_livro);
		
		txtISBN = (EditText) findViewById(R.id.txtISBN);
		txtTitulo = (EditText) findViewById(R.id.txtTitulo);
		txtSubTitulo = (EditText) findViewById(R.id.txtSubTitulo);
		txtEdicao = (EditText) findViewById(R.id.txtEdicao);
		txtAutor = (EditText) findViewById(R.id.txtAutor);
		txtAno = (EditText) findViewById(R.id.txtAno);
		txtPagina = (EditText) findViewById(R.id.txtPagina);
		txtEditora = (EditText) findViewById(R.id.txtEditora);
		lstCategoria = (ExpandableListView) findViewById(R.id.lstCategoria);
		txtIDImagem = (EditText) findViewById(R.id.txtIDImagem);
	}

  public void btnVoltar_Click(View view){
		Intent it = new Intent(this, Administracao.class);
		startActivity(it);
		
  }
	  

  public void btnCadastrar_Click(View view){

	  	String ISBN = txtISBN.getText().toString();
	  	String Titulo = txtTitulo.getText().toString();
	  	String SubTitulo = txtSubTitulo.getText().toString();
	  	String Edicao = txtEdicao.getText().toString();
	  	String Autor = txtAutor.getText().toString();
	  	String Ano = txtAno.getText().toString();
	  	String Pagina = txtPagina.getText().toString();
	  	String Editora = txtEditora.getText().toString();
	  	long IDCategoria = lstCategoria.getSelectedId();
	  	String IDImagem = txtIDImagem.getText().toString();
		
	  	boolean valido=true;
	  	
		if (ISBN.equals("")){
			Toast.makeText(this, "Entre com o ISBN!", Toast.LENGTH_SHORT).show();
			valido=false;
			txtISBN.requestFocus();
		}
		if (Titulo.equals("")){
			Toast.makeText(this, "Entre com o Titulo!", Toast.LENGTH_SHORT).show();
			valido=false;
			txtISBN.requestFocus();
		}
		if (Autor.equals("")){
			Toast.makeText(this, "Entre com o Autor!", Toast.LENGTH_SHORT).show();
			valido=false;
			txtISBN.requestFocus();
		}
		if (Ano.equals("")){
			Toast.makeText(this, "Entre com o Ano!", Toast.LENGTH_SHORT).show();
			valido=false;
			txtISBN.requestFocus();
		}
		if (Editora.equals("")){
			Toast.makeText(this, "Entre com o Editora!", Toast.LENGTH_SHORT).show();
			valido=false;
			txtISBN.requestFocus();
		}
		if (IDCategoria == 0){
			Toast.makeText(this, "Entre com o Categoria!", Toast.LENGTH_SHORT).show();
			valido=false;
			lstCategoria.requestFocus();
		}
		
		if (valido)
		{
			SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
					
			Cursor rsCount = db.rawQuery("SELECT CASE WHEN Max(codigo) IS NULL THEN 0 ELSE  Max(codigo) END codigo FROM tb_livro",null);
			int ID=1;
			String strValor;
			if (rsCount.moveToFirst())
				ID = rsCount.getInt(0)+1;
			
			
			strValor = String.valueOf(ID);

		  //	string sql = "INSERT INTO tb_tb_livro (codigo,isbn,titulo,subtitulo,";
		  //	/sql += "edicao,autor,ano,pagina,editora,idCategoria,IDImagem"
			//db.execSQL(VALUES(?,?,?) ",new String[]{strValor, categoria, desc});
		//	Toast.makeText(this, "Categoria inserida com sucesso!", Toast.LENGTH_SHORT).show();
				
			//	txtCategoria.setText(null);
			///	txtCategoria.requestFocus();
		}
  }
 
}
  

