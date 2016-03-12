package br.com.principal;

public class Categoria {
	private String nome;
	private int IDImagem;
	
	public Categoria(String nome,int IDImagem){
		this.nome = nome;
		this.IDImagem= IDImagem;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIDImagem() {
		return IDImagem;
	}
	public void setIDImagem(int IDImagem) {
		IDImagem = IDImagem;
	}

}
