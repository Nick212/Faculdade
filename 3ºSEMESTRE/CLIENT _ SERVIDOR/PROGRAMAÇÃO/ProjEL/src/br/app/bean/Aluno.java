package br.app.bean;

public class Aluno {

	private String rgm, nome, email;
	
	public Aluno(){};
	
	public Aluno (String rgm, String nome, String email){
		
		this.rgm = rgm;
		this.nome = nome;
		this.email=email;
	}

	public String getRgm() {
		return rgm;
	}

	public void setRgm(String rgm) {
		this.rgm = rgm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
