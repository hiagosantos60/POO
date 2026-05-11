package eng.telecom;

import eng.telecom.produtos.Dimensao;
import eng.telecom.produtos.SemFio;
import eng.telecom.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        Dimensao d = new Dimensao(20, 20, 20);
        Dimensao d2 = new Dimensao(30, 30, 30);
        Telefone t1 = new Telefone(1, "1", "a1", 10, d);
        SemFio s1 = new SemFio(1, "2", "a2", 30, d2, 30, 5, 100);

        System.out.println(t1);
        System.out.println(s1);
    }
}
