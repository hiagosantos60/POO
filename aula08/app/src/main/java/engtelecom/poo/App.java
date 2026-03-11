package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Lampada a = new Lampada();
        Lampada b = new Lampada();

        // System.out.println(a.isLigada());
        // a.ligar();
        // System.out.println(a.isLigada());
        // System.out.println(b.isLigada());
         
        a.LigaDesliga();
        System.out.println(a.isLigada());
        a.LigaDesliga();
        System.out.println(a.isLigada());
    }
}
