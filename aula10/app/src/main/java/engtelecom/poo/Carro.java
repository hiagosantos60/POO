package engtelecom.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual;

    public void acelerar(int v) {
        if (v > 200) velocidadeAtual = 200;
        else velocidadeAtual = velocidadeAtual + v;
    }

    public void freiar(int v) {
        if (v < velocidadeAtual) velocidadeAtual = 0;
        else velocidadeAtual = velocidadeAtual - v;
    }
}
