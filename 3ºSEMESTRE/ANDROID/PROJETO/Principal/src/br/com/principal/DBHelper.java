package br.com.principal;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public DBHelper(Context context, String name, int version) {
		super(context, name, null, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		
		//String que representa o SQL da criação da tabela aluno
		String sql = "CREATE TABLE tb_usuario (login VARCHAR PRIMARY KEY, senha VARCHAR NOT NULL)";
		db.execSQL(sql);
		sql = "INSERT INTO tb_usuario (login,senha) VALUES('admin','123')";
		db.execSQL(sql);
		
		sql = "CREATE TABLE tb_categoria (codigo INT, nome VARCHAR, descricao VARCHAR)";
		db.execSQL(sql);
		sql = "INSERT INTO tb_categoria (codigo,nome,descricao) values(1,'FICCAO','ASASASASASA')";
		db.execSQL(sql);
		
		//Table of information Users
		sql = "CREATE TABLE tb_dadosUsuario (" +
				"login VARCHAR PRIMARY KEY, " +
				"nome VARCHAR NOT NULL," +
				"idImagem VARCHAR NOT NULL,"+
				"email VARCHAR NOT NULL,"+
				"telefone VARCHAR,"+
				"endereco VARCHAR,"+
				"complemento VARCHAR,"+
				"bairro VARCHAR,"+
				"cidade VARCHAR,"+
				"uf VARCHAR"+")";
		db.execSQL(sql);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
}





















