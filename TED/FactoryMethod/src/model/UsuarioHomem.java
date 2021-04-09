package model;

public class UsuarioHomem extends Usuario{

	private String nome;
	
	public UsuarioHomem(String nome) {
		this.nome = nome;
	}
	
	public String saudacoes() {
		return "Bem-vindo Sr. " + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
