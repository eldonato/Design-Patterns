package modelo.arquivo;

public class ArquivoBuilder {
    private String nomeArquivo;
    private String caminhoArquivo;
    private String data;
    private String proprietario;
    private String email;
    private boolean autImpressao;
    private boolean autCopia;

    public ArquivoBuilder nomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        return this;
    }

    public ArquivoBuilder caminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        return this;
    }

    public ArquivoBuilder data(String data) {
        this.data = data;
        return this;
    }

    public ArquivoBuilder proprietario(String proprietario) {
        this.proprietario = proprietario;
        return this;
    }

    public ArquivoBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ArquivoBuilder autImpressao(boolean autImpressao) {
        this.autImpressao = autImpressao;
        return this;
    }

    public ArquivoBuilder autCopia(boolean autCopia) {
        this.autCopia = autCopia;
        return this;
    }

    public Arquivo getArquivo() {
        return new Arquivo(nomeArquivo, caminhoArquivo, data, proprietario, email, autImpressao, autCopia);
    }
}