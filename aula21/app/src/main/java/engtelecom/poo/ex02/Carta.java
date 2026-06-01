package engtelecom.poo.ex02;

public class Carta {
    private Naipes naipe;
    private Valor valor;

    public Carta(Naipes naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipes getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
    }
}
