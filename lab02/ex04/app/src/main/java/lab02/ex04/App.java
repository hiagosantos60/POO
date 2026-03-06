package lab02.ex04;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random(); 

        String[][] matriz = new String[10][10]; 

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = "."; 
            }
        }

        int c = 0;
        while (c <= 10) {
            int x = r.nextInt(10); 
            int y = r.nextInt(10);
            //char carac = matriz[x][y].charAt(0);
            matriz[x][y] = "*";
            c++;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char caracter = matriz[i][j].charAt(0); 
                IO.print(caracter);
            }
            IO.println("");
        }
    }
}
