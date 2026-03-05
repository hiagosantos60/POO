package lab02.ex03;

public class App {
    public static void main(String[] args) {
        
        String tipo = "triangulo"; // para o tipo de figura que meu usuário irá passar 
        tipo = tipo.toLowerCase();

        int tam = Integer.parseInt(args[1]);
        int alt = Integer.parseInt(args[2]);       

        if (tam < 2) {
            IO.println("Entrada invalida! ");
            return;
        } 

        if (tipo.equals("triangulo")) {
            int c = 0;
            while (c <= tam) {
                IO.print("*".repeat(c));
                IO.println("");
                c++;
            }
        }

        if (tipo.equals("losango")) {
            if (tam%2 == 0){ // evita entrada de numeros pares
                IO.println("Impossivel represetar nesse tamanho... ");
                return;
            }

            int meio = Math.round(tam/2);

            

        }

    }
}
