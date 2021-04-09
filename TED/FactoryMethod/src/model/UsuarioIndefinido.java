package model;

public class UsuarioIndefinido extends Usuario {

	private String nome;
	
	public UsuarioIndefinido(String nome) {
		this.nome = nome;
	}
	
	public String saudacoes() {
		return "Bem-vindo " + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
