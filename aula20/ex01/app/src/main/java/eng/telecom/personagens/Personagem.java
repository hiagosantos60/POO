package eng.telecom.personagens;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;
    protected String identificacao;

    public Personagem(int vida, int ataque, double velocidade, String identificacao) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
        this.identificacao = identificacao;
    }

    public String andar() {
        return "Estou andando!";
    }

    
    public String atacar() {    
        return String.format("Estou atacando com força", this.ataque); 
    }

    @Override
    public String toString() {
        return "Personagem [vida=" + vida + ", ataque=" + ataque + ", velocidade=" + velocidade + ", identificacao="
                + identificacao + "]";
    }
}
