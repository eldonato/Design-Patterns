package model;

//Pode ou não fazer extends para uma classe AbstractFactory
public class FactoryUsuario extends AbstractFactoryUsuario{

	public FactoryUsuario() {}
	
	public Usuario getUsuario(String sexo, String nome) {
		if (sexo.equals("m")) {
			return new UsuarioHomem(nome);
		}
		else if (sexo.equals("f")) {
			return new UsuarioMulher(nome);
		}
		else if (sexo.equals(" ")) {
			return new UsuarioIndefinido(nome);
		}
		else return null;
	}


}
