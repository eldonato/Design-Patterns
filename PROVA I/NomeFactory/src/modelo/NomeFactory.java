package modelo;

public class NomeFactory {
	
	public NomeFactory() {}
	
	public Nome getNome(String nome) {
		
		if (nome.contains(",")) {
			String[] nomes = nome.split(", ", 2);
			String primeiroNome = nomes[nomes.length-1];
			String sobrenome = nomes[0];
			return new Nome(primeiroNome, sobrenome);
			
		} else {
			String [] nomes = nome.split(" ");
			String primeiroNome = nomes[0];
			String sobrenome = nomes[nomes.length-1];
			return new Nome(primeiroNome, sobrenome);
		}
	}

}
