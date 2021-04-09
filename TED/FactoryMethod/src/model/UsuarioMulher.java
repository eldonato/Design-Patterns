package model;

public class UsuarioMulher extends Usuario {

	private String nome;

	public UsuarioMulher(String nome) {
		this.nome = nome;
	}

	public String saudacoes() {
		return "Bem-vindo Sra. " + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
