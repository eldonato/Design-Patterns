package visao;

import modelo.Pizza;
import modelo.PizzaBaiana;
import modelo.PizzaQuatroQueijos;

public class Pizzaria {

    public static void main(String[] args) {

        Pizza pedidoUm = new PizzaBaiana();
        System.out.println("Preparando pizza baiana:");
        pedidoUm.fazerPizza();

        Pizza pedidoDois = new PizzaQuatroQueijos();
        System.out.println("Preparando pizza de quatro queijos:");
        pedidoDois.fazerPizza();
    }
}
