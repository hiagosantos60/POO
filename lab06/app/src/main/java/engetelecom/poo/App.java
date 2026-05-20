package engetelecom.poo;

import edu.princeton.cs.algs4.Draw;
import engetelecom.poo.relogios.RelogioDigitalDisplay;

public class App {
    public static void main(String[] args) {
        Draw canvas = new Draw();
        
        // Tamanho da janela no Windows
        canvas.setCanvasSize(800, 400);
        
        // ZOOM OUT: Área virtual gigante para caber os 6 dígitos grandes
        canvas.setXscale(0, 2500);
        canvas.setYscale(0, 1200);
        
        canvas.enableDoubleBuffering();

        // Criando o relógio
        RelogioDigitalDisplay relogio = new RelogioDigitalDisplay(100, 200, RelogioDigitalDisplay.TAM_MEDIO);
        
        relogio.setHorario();

        while (true) {
            canvas.clear(Draw.BLACK); 
            
            relogio.avancarTempo();
            relogio.desenhar(canvas);
            
            canvas.show();
            canvas.pause(1000); 
        }
    }
}