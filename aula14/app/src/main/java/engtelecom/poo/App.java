
package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Motor mo = new Motor(10, 4);
        Carro c = new Carro("ford", mo);
    
        c.acelerar(10);
        System.out.println(mo.getGiroAtual());
    }
}
