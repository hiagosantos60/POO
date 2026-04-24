package engtelecom.poo;

public class Email {
    private static int cont = 0;
    private String rotulo;
    private String valor;
    private int id;

    public Email(String rotulo, String valor) {
        this.id = ++cont;
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }
    public String getValor() {
        return valor;
    }
    public int getId() {
        return id;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Email [rotulo=" + rotulo + ", valor=" + valor + "]";
    }
}
