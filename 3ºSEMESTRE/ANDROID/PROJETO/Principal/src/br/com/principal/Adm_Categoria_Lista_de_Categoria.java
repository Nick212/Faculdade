package br.com.principal;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class Adm_Categoria_Lista_de_Categoria extends ListActivity {

	List<String> lista=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SQLiteDatabase db = new DBHelper(this, "db_books",1).getWritableDatabase();
		Cursor rs = db.rawQuery("SELECT codigo,nome,descricao FROM tb_categoria", null);

		lista = new ArrayList<String>();
		if (rs.moveToFirst()){
			while (rs.moveToNext()) {
				lista.add(rs.getString(1));
			}
		}

		setListAdapter(new CategoriaAdapter());  
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
	
		super.onListItemClick(l, v, position, id);
	 
		//Pegar o item clicado
		Object o = this.getListAdapter().getItem(position);
		String text = o.toString();

		Intent it = new Intent(this, Adm_Categoria_Manutencao_da_Categoria.class);
		it.putExtra("nome",text);
		startActivity(it);
		
	}
	
		
		
    class CategoriaAdapter extends ArrayAdapter<String>  
    {  
	 	CategoriaAdapter()  
        {  
            super(Adm_Categoria_Lista_de_Categoria.this,R.layout.row,R.id.text,lista);  
        }  
  
        @Override  
        public View getView(int position, View convertView, ViewGroup parent) {  
            View row = super.getView(position, convertView, parent);  
            ImageView imagev = (ImageView) row.findViewById(R.id.image);  
            return(row) ;  
        }  
          
    }  
    
    public void btnVoltar_Click(View view){
		Intent it = new Intent(this, Administracao.class);
		startActivity(it);
		
	}
}

	

