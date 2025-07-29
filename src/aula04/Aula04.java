package aula04;

public class Aula04 {

    // Estruturas de repetição: For, While, Do-While, break, continue
    // Aulas 27 a 31 do curso Maratona Java

    public static void main(String[] args) {

        System.out.println("--- Estruturas de Repetição ---");
        System.out.println("\n--- Exemplo 1: For ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }
        // O for é usado quando se sabe o número de iterações que serão feitas


        System.out.println("\n--- Exemplo 2: While ---");
        int j = 0;
        while (j < 5) {
            System.out.println("Contagem: " + j);
            j++;
        }
        // O while é usado quando não se sabe o número de iterações que serão feitas, mas se tem uma condição de parada
        // O while executa o bloco de código enquanto a condição for verdadeira
        // Se a condição for falsa na primeira iteração, o bloco de código não será executado


        System.out.println("\n--- Exemplo 3: Do-While ---"); // O do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez
        int k = 0;
        do {
            System.out.println("Contagem: " + k);
            k++;
        } while (k < 5);
        // O do-while executa o bloco de código primeiro e depois verifica a condição
        // Se a condição for falsa na primeira iteração, o bloco de código ainda será executado uma vez
        // O do-while é útil quando se quer garantir que o bloco de código seja executado pelo menos uma vez, independentemente da condição


        System.out.printf("\n--- Exemplo 4: Break e Continue ---");
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                System.out.println("Chegou no número 5, saindo do loop com break.");
                break; // O break interrompe o loop quando a condição é atendida
            }
            if (l % 2 == 0) {
                System.out.println("Número par: " + l);
                continue; // O continue pula a iteração atual e continua com a próxima
            }
            System.out.println("Número ímpar: " + l);
        }
        // O continue é usado para pular a iteração atual do loop e continuar com a próxima iteração



    }

}
