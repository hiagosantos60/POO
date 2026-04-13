package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private ArrayList<Capitulo> livro = new ArrayList<>();

    public Livro(String titulo, String autor, ArrayList<Capitulo> livro) {
        this.titulo = titulo;
        this.autor = autor;
        this.livro = livro;
    }
}
