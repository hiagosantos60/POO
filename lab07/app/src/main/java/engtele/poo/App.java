package engtele.poo;
import java.util.ArrayDeque;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import engtele.poo.baralho.CartaGrafica;
import engtele.poo.baralho.Naipes;
import engtele.poo.baralho.Valor;

public class App implements DrawListener {
    private Draw draw;
    private ArrayDeque<CartaGrafica> baralho = new ArrayDeque<CartaGrafica>();

    public App(){
        this.draw = new Draw();
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3);
        this.draw.setTitle("Jogo de cartas");

        // essa classe que vai fazer o tratamento das entradas
        this.draw.addListener(this);

        this.draw.clear(Draw.GREEN);
        this.draw.show();

        int cX = 100;
        int cY = 300;

        for (Naipes naipes : Naipes.values()) {
            for (Valor valor : Valor.values()) {
                CartaGrafica carta = new CartaGrafica(naipes, valor, cX, cY);
                baralho.add(carta);
                cX = cX + 20;
            }
        }

        for (CartaGrafica cartaGrafica : baralho) {
            cartaGrafica.desenhar(draw);
        }
    }

    @Override
    public void mouseClicked(double x, double y) {
        for (CartaGrafica c : baralho) {
            if(c.clicouDentro(x, y)){
                c.virarCarta();
                c.desenhar(draw);
            }
        }
        draw.show();
    }


    public static void main(String[] args) {
        App app = new App();
    }
}
