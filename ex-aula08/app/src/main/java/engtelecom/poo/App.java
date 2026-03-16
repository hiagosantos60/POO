package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.setValor(50);
        IO.println(c.getValor());
        c.incrementar();
        IO.println(c.getValor());
    }
}
