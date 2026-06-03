package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Caixa<String> c = new Caixa<>("Teste tipo Object");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa("João"));

        String s = c.getConteudo();

        String errado = d.getConteudo();
    }
}

