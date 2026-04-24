package engtelecom.poo;

public class Telefone {
    private static int cont = 0;
    private String valor;
    private String rotulo;
    private int id;

    public Telefone(String rotulo, String valor) {
        this.id = ++cont;
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
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " ";
    }
}
