package visao;

import java.util.ArrayList;

import modelo.Nome;
import modelo.NomeFactory;

public class App {
	
	public static void main(String[] args) {
		
		NomeFactory fabrica = new NomeFactory();
		ArrayList<String> stringNomes = new ArrayList<>();
		ArrayList<Nome> nomes = new ArrayList<>();
		
		stringNomes.add("Leonardo Victor Andrade Donato");
		stringNomes.add("Yasmin Ferreira da Silva");
		
		stringNomes.add("Leonardo Donato");
		stringNomes.add("Yasmin da Silva");
		
		stringNomes.add("Donato, Leonardo");
		stringNomes.add("Silva, Yasmin");
		
		for (String n : stringNomes) {
			nomes.add(fabrica.getNome(n));
		}
		
		for (Nome n : nomes) {
			System.out.println(n.toString());
		}
	}
	

}
