
public class Cliente {
    private String nome;
    private int pontosDeAlugadorFrequente;


    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public void adicionarPontos(int valor) {
    	pontosDeAlugadorFrequente += valor;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public int getPontos() {
    	return pontosDeAlugadorFrequente;
    }
    
    
}