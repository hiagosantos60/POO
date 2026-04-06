package engtelecom.poo;

import java.util.HashMap;

public class App {

    HashMap<String, Livro> acervo = new HashMap<>();

     public void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar iSBN e imprimir todos os livros");
        System.out.println("3 - Consultar por iSBN e imprimir todos os livros");
        System.out.println("4 - Consultar livro por autor e imprimir os dados do livro");
        System.out.println("5 - Atualizar dados de um livro, exceto o iSBN");
        System.out.println("6 - Remover livro pelo iSBN ");
        System.out.println("7 - Sair");
    }

    public void executarMenu(int opcao) {
        switch (opcao) {
            case 1:
                String iSBN = IO.readln("Entre com o iSBN: ");
                String titulo = IO.readln("Entre com o título do livro: ");
                String autor = IO.readln("Entre com o nome do autor: ");
                int ano = Integer.parseInt(IO.readln("Entre com a data de lançamento do livro: "));
                cadastrarLivro(iSBN, titulo, autor, ano);
                break;
            case 2:
                listarLivros();
                break;
            case 3:
                iSBN = IO.readln("Entre com o iSBN: ");
                consultarPorISBN(iSBN);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void cadastrarLivro(String iSBN, String titulo, String autor, int ano) {
        if (!acervo.containsKey(iSBN)) {
            Livro v = new Livro(iSBN, titulo, autor, ano);
            acervo.put(iSBN, v);
        } else String.format("Livro já cadastrado...\n");
    }

    private void listarLivros() {
        for(Livro livro: acervo.values()){
            System.out.println(livro);
        }
    }

    private void consultarPorISBN(String iSBN) {
        if(acervo.containsKey(iSBN)){
            System.out.println(acervo.get(iSBN));
        }
    }

    public static void main(String[] args) {

        /*
        1 - Cadastrar livro
        2 - Listar ISBN e título de todos os livros
        3 - Consultar por ISBN e imprimir todos os livros
        4 - Consultar livro por autor e imprimir os dados do livro
        5 - Atualizar dados de um livro, exceto o ISBN
        6 - Remover livro pelo ISBN 
        7 - Sair
        */
        
        App app = new App();
        int opcao = 0; 

        while (opcao!=7) {
            app.exibirMenu();

            if(opcao != 7){
                opcao = Integer.parseInt(IO.readln("O que deseja fazer: "));
                app.executarMenu(opcao);
            } else {
                break;
            }
        }


    }
}
