package modelo.arquivo;


public class ArquivoDiretor {

    public void arquivoSimples(ArquivoBuilder builder, String nomeArquivo, String caminhoArquivo){
        builder.nomeArquivo(nomeArquivo)
                .caminhoArquivo(caminhoArquivo)
                .autCopia(false);
    }

    public void arquivoCompleto(ArquivoBuilder builder, String nome, String caminhoArquivo,
                                String data, String proprietario, String email,
                                boolean autImpressao, boolean autCopia){
        if (proprietario.equals("")){
            proprietario = "não informado";
        }
        if (email.equals("")){
            email = "não informado";
        }

        builder.nomeArquivo(nome)
                .caminhoArquivo(caminhoArquivo)
                .data(data)
                .proprietario(proprietario)
                .email(email)
                .autImpressao(autImpressao)
                .autCopia(autCopia);
    }


}
