package modelo;

public class PizzaBaiana extends Pizza{

    String[] queijosUsados = {"Muçarela", "Parmesão"};
    String[] carnesUsadas = {"Calabresa moída", "Ovos"};
    String[] vegetaisUsados = {"Pimenta", "Cebola", "Tomate"};

    @Override
    void addQueijo() {
        System.out.print("Adicionando queijos: ");
        for (String queijo : queijosUsados){
            System.out.print(queijo + " ");
        }
    }

    @Override
    void addCarne() {
        System.out.print("Adicionando carnes: ");
        for (String carne : carnesUsadas){
            System.out.print(carne + " ");
        }
    }

    @Override
    void addVegetais() {
        System.out.print("Adicionando vegetais: ");
        for (String vegetal : vegetaisUsados){
            System.out.print(vegetal + " ");
        }
    }
}
