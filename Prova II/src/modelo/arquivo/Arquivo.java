package modelo.arquivo;

public class Arquivo {

    private String nomeArquivo;
    private String caminhoArquivo;
    private String data;
    private String proprietario;
    private String email;
    private boolean autImpressao;
    private boolean autCopia;

    Arquivo(){}

    Arquivo(String nomeArquivo, String caminhoArquivo,
                   String data, String proprietario,
                   String email, boolean autImpressao, boolean autCopia) {
        this.nomeArquivo = nomeArquivo;
        this.caminhoArquivo = caminhoArquivo;
        this.data = data;
        this.proprietario = proprietario;
        this.email = email;
        this.autImpressao = autImpressao;
        this.autCopia = autCopia;
    }

    public Arquivo (Arquivo arquivo) {
        if (arquivo != null) {
            this.nomeArquivo = arquivo.nomeArquivo + " (cópia)";
            this.caminhoArquivo = arquivo.caminhoArquivo;
            this.data = arquivo.data;
            this.proprietario = arquivo.proprietario;
            this.email = arquivo.email;
            this.autImpressao = arquivo.autImpressao;
            this.autCopia = arquivo.autCopia;
        }

    }

    public Arquivo clonar(){
        return new Arquivo(this);
    }

    public void escrever(){
        System.out.println("Escreveu no arquivo");
    }

    public void ler(){
        System.out.println("Leu arquivo");
    }

    public boolean isAutCopia(){
        return autCopia;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", caminhoArquivo='" + caminhoArquivo + '\'' +
                ", data='" + data + '\'' +
                ", proprietario='" + proprietario + '\'' +
                ", email='" + email + '\'' +
                ", autImpressao=" + autImpressao +
                ", autCopia=" + autCopia +
                '}';
    }
}
