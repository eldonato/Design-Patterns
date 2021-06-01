package modelo;

public class PizzaQuatroQueijos extends Pizza{
    String[] queijosUsados = {"Muçarela", "Catupiry", "Provolone", "Parmesão"};

    boolean querCarne(){return false;}
    boolean querVegetais() {return false;}

    @Override
    void addQueijo() {
        System.out.print("Adicionando queijos: ");
        for (String queijo : queijosUsados){
            System.out.print(queijo + " ");
        }
    }

    @Override
    void addCarne() { }

    @Override
    void addVegetais() {

    }
}
