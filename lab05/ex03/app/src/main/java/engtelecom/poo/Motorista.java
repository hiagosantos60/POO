package engtelecom.poo;

import java.time.LocalDate;

public class Motorista {
    private String nome;
    private LocalDate dataNasc;
    private String categoriaCnh;
    
    public Motorista(String nome, LocalDate dataNasc, String categoriaCnh) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.categoriaCnh = categoriaCnh;
    }

    public boolean mudarCategoria(String categoria) {
        this.categoriaCnh = categoria;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
