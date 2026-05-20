package engetelecom.poo;

import edu.princeton.cs.algs4.Draw;
import engetelecom.poo.relogios.Display;

public class App {
    public static void main(String[] args) {
        // Inicializa a tela com as configurações do laboratório
        Draw desenho = new Draw();
        desenho.setCanvasSize(800, 800);
        desenho.setXscale(0, 800);
        desenho.setYscale(0, 800);
        desenho.enableDoubleBuffering();
        desenho.clear(Draw.BLACK);

        // Instancia os displays
        Display display1 = new Display();
        Display display2 = new Display();

        // Diz qual número cada um vai mostrar
        display1.setDigito(4); 
        display2.setDigito(2); 

        // Desenha o primeiro display menor no canto
        display1.desenhar(desenho, 100, 100, 1); 

        // Desenha o segundo display MAIOR e mais pro centro
        display2.desenhar(desenho, 400, 400, 2); 

        // Mostra na tela
        desenho.show();
    }
}
