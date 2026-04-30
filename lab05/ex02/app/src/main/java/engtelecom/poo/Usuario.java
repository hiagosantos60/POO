package engtelecom.poo;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean avaliarFilme(Filme filme, int nota, String comentario) {
        if(nota > 5 || nota < 0) return false;
        return false;
        // implementar depois de implementar Filme   
    }

    @Override
    public String toString() {
        return """
                INFORMAÇÕES DO USUÁRIO
                Nome: %s
                Email: %s
                """.formatted(nome, email);
    }
    
}
