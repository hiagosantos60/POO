
package engtelecom.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] campo = new int[9][9];

        int t = 0;

        while(scan.hasNext()) {
            String linha = scan.nextLine();
            
            for (int i = 0; i < linha.length(); i++) { // fazendo a leitura e gravação em int 
                campo[t][i] = linha.charAt(i) == '.' ? 0 : 9; // "." == 0 && "*" == 9 que vamos guardar no campo 
            }
            t++;
        }


        System.out.println("Campo minado:");

        for (int y = 0; y < campo.length; y++) {
            for (int x = 0; x < campo.length; x++) { 
                if (campo[x][y] == 9) { // se for asteristico 
                    // fazer validação da posição a ser analisada, nao pode estourar limite
                    // variáveis auxiliares para validação do campo sem alterar a posição inicial
                    int k = x;
                    int j = y;

                
                }
            }
        }

        scan.close();
    }
}
