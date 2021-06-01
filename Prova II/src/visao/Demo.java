package visao;

import modelo.editor.Editor;
import modelo.factory.EditorApresentacaoFactory;
import modelo.factory.EditorFactory;
import modelo.factory.EditorPlanilhasFactory;
import modelo.factory.EditorTextoFactory;
import modelo.arquivo.ArquivoBuilder;
import modelo.arquivo.Arquivo;
import modelo.arquivo.ArquivoDiretor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {

    private static EditorFactory editor;

    private static final int EDITOR_TEXTO = 1;
    private static final int EDITOR_PLANILHAS = 2;
    private static final int EDITOR_APRESENTACAO = 3;

    public static void main(String[] args) {

        ArquivoDiretor diretor = new ArquivoDiretor();
        ArquivoBuilder builder = new ArquivoBuilder();

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a aplicação!");

        System.out.println("Insira o número referente ao editor que você deseja abrir");
        System.out.println("\n [1] - Editor de Texto \n [2] - Editor de Planilhas \n [3] - Editor de Apresentação");
        String opcao = scan.nextLine();
        System.out.println("\n");

        selecionarPrograma(opcao);

        Editor app = editor.getEditor();

        app.iniciar();

        System.out.println("\n");

        System.out.println("--- Informações obrigatórias do arquivo ---");

        System.out.print("Insira o nome do arquivo: ");
        String nomeArquivo = scan.nextLine();
        System.out.print("Insira o caminho do arquivo: ");
        String caminhoArquivo = scan.nextLine();

        System.out.print("Deseja inserir informações adicionais? [S/N] ");
        opcao = scan.nextLine().toLowerCase();

        if (opcao.equals("s")) {
            boolean autImpressao;
            boolean autCopia;

            System.out.println("\n---- Informações adicionais, caso não queira inserir apenas aperte ENTER ---- \n");
            System.out.print("Nome do autor: ");
            String proprietario = scan.nextLine();

            System.out.print("Email: ");
            String email = scan.nextLine();

            System.out.print("Autoriza impressão? [S/N] ");
            opcao = scan.nextLine().toLowerCase();
            autImpressao = opcao.equals("s");

            System.out.print("Autoria cópia? [S/N] ");
            opcao = scan.next().toLowerCase();
            autCopia = opcao.equals("s");

            String data = getData();

            diretor.arquivoCompleto(builder, nomeArquivo, caminhoArquivo, data, proprietario, email, autImpressao,
                    autCopia);
        } else {
            diretor.arquivoSimples(builder, nomeArquivo, caminhoArquivo);
        }

        Arquivo arquivo = builder.getArquivo();

        System.out.println(arquivo);

        arquivo.escrever();
        arquivo.ler();

        if (arquivo.isAutCopia()) {
            System.out.println("Criando cópia do arquivo..... ");
            Arquivo arquivoCopia = arquivo.clonar();
            System.out.println(arquivoCopia);
        }

        scan.close();
    }

    static void selecionarPrograma(String opcao) {
        int caso = Integer.parseInt(opcao);
        switch (caso) {
            case EDITOR_TEXTO -> editor = new EditorTextoFactory();
            case EDITOR_PLANILHAS -> editor = new EditorPlanilhasFactory();
            case EDITOR_APRESENTACAO -> editor = new EditorApresentacaoFactory();
        }
    }

    static String getData() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
