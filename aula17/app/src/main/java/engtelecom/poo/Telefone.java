package engtelecom.poo;

public class Telefone {
    private String valor;
    private String rotulo;

    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }    

    public void setValor(String valor) {
        this.valor = valor;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    public String getValor() {
        return valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    @Override
    public String toString() {
        return rotulo + ": " + valor;
    }
}
