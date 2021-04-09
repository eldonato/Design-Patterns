package visao;

import model.FactoryUsuario;
import model.Usuario;

public class App {
	
	public static void main(String[] args) {
		
		FactoryUsuario fabrica = new FactoryUsuario();
		
		Usuario uh = fabrica.getUsuario("m", "José");
		
		System.out.println(uh.saudacoes());
		
		Usuario um = fabrica.getUsuario("f", "Maria");
		System.out.println(um.saudacoes());
		
		Usuario ui = fabrica.getUsuario(" ", "Gabi");
		System.out.println(ui.saudacoes());
		
		
		
		
	}

}
