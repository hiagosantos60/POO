package engetelecom.poo;

import java.util.ArrayList;
import java.util.Scanner;

import edu.princeton.cs.algs4.Draw;
import engetelecom.poo.relogios.*;

public class App {
    public static void main(String[] args) {
        Draw canvas = new Draw();
        canvas.setXscale(0, 800);
        canvas.setYscale(0, 600);
        canvas.enableDoubleBuffering();

        ArrayList<Relogio> listaDeRelogios = new ArrayList<>();
 
        RelogioAnalogico anal = new RelogioAnalogico(400, 350, 150); 
        RelogioDigitalDisplay digi = new RelogioDigitalDisplay(50, 100, 1); 
        
        listaDeRelogios.add(anal);
        listaDeRelogios.add(digi);

        Thread menuTerminal = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("\n======================================");
                System.out.println("        CONTROLE DOS RELÓGIOS         ");
                System.out.println("======================================");
                System.out.println("1. Relógio Normal (Hora do Sistema)");
                System.out.println("2. Cronômetro Progressivo");
                System.out.println("3. Temporizador Regressivo");
                System.out.print("Escolha o modo: ");
                
                if (scanner.hasNextInt()) {
                    int opcao = scanner.nextInt();
                    
                    if (opcao == 1) {
                        for (Relogio r : listaDeRelogios) {
                            if (r instanceof RelogioDigital) {
                                ((RelogioDigital) r).setModoRelogio();
                            }
                        }
                        System.out.println("\n[OK] Todos os relógios digitais voltaram para o horário do sistema!");
                        
                    } else if (opcao == 2) {
                        System.out.print("Contar ATÉ (horas minutos segundos) Ex: 0 1 30 -> ");
                        int hProg = scanner.nextInt();
                        int mProg = scanner.nextInt();
                        int sProg = scanner.nextInt();
                        
                        for (Relogio r : listaDeRelogios) {
                            if (r instanceof RelogioDigital) {
                                ((RelogioDigital) r).setModoRelogio(hProg, mProg, sProg, 2);
                            }
                        }
                        System.out.println("\n[OK] Modo Progressivo iniciado com sucesso!");
                        
                    } else if (opcao == 3) {
                        System.out.print("Contar A PARTIR DE (horas minutos segundos) Ex: 0 5 0 -> ");
                        int hReg = scanner.nextInt();
                        int mReg = scanner.nextInt();
                        int sReg = scanner.nextInt();
                        
                        for (Relogio r : listaDeRelogios) {
                            if (r instanceof RelogioDigital) {
                                ((RelogioDigital) r).setModoRelogio(hReg, mReg, sReg, 3);
                            }
                        }
                        System.out.println("\nModo Regressivo iniciado com sucesso!");
                        
                    } else {
                        System.out.println("\nOpção inválida! Digite 1, 2 ou 3.");
                    }
                } else {
                    scanner.next(); 
                    System.out.println("\nEntrada inválida! Por favor, digite um número.");
                }
            }
        });
        
        menuTerminal.start();

        while (true) {
            canvas.clear(Draw.BLACK);

            for (Relogio r : listaDeRelogios) {
                r.avancarTempo();
                r.desenhar(canvas);
            }

            canvas.show();
            canvas.pause(1000);
        }
    }
}