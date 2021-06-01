package modelo;

public abstract class Pizza {

    boolean ingredientePosterior = false;

    final public void fazerPizza(){
        prepararMassa();
        if(querQueijo()){
            addQueijo();
            ingredientePosterior = true;
        }
        if(querCarne()){
            if(ingredientePosterior){
                System.out.println("");
            }
            addCarne();
            ingredientePosterior = true;
        }
        if(querVegetais()){
            if(ingredientePosterior){
                System.out.println("");
            }
            addVegetais();
            ingredientePosterior = true;
        }
        System.out.println("");
        assarPizza();
        embrulharPizza();
    }

    public void prepararMassa(){
        System.out.println("A massa foi preparada.");
    }

    abstract void addQueijo();
    abstract void addCarne();
    abstract void addVegetais();

    boolean querQueijo(){return true;}
    boolean querCarne(){return true;}
    boolean querVegetais(){return true;}

    public void assarPizza(){
        System.out.println("A pizza foi assada.");
    }

    public void embrulharPizza(){
        System.out.println("A pizza está embrulhada.");
    }
}
