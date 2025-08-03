package aula05;

public class Aula05 {

    // Arrays
    // Aulas 32 a 38 do curso Maratona Java

    public static void main(String[] args) {

            System.out.println("--- Trabalhando com Arrays em Java ---");

            System.out.println("\n--- Exemplo 1: Declaração e Atribuição ---");
            int[] numeros = new int[5]; // Criando um array de inteiros com 5 posições
            numeros[0] = 10;
            numeros[1] = 20;
            numeros[2] = 30;
            numeros[3] = 40;
            numeros[4] = 50;

            System.out.println("Valor na posição 0: " + numeros[0]);
            System.out.println("Valor na posição 4: " + numeros[4]);

            // Os arrays têm tamanho fixo e índices que começam em 0
            // Ao tentar acessar um índice inválido, será lançada uma ArrayIndexOutOfBoundsException

            System.out.println("\n--- Exemplo 2: Inicialização Direta ---");
            String[] nomes = {"Vinicius", "Ana", "Carlos", "Beatriz"};

            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Nome na posição " + i + ": " + nomes[i]);
            }
            // O atributo length indica o tamanho do array
            // Pode-se usar o for para percorrer os elementos do array

            System.out.println("\n--- Exemplo 3: For-Each (enhanced for) ---");
            for (String nome : nomes) {
                System.out.println("Nome: " + nome);
            }
            // O for-each é uma forma simplificada de iterar sobre arrays
            // Útil quando não precisamos do índice, apenas dos valores

            System.out.println("\n--- Exemplo 4: Soma de valores com array ---");
            int[] valores = {5, 10, 15, 20, 25};
            int soma = 0;
            for (int valor : valores) {
                soma += valor;
            }
            System.out.println("Soma dos valores: " + soma);

            // Podemos usar arrays para armazenar e processar dados em massa
            // Aqui, calculamos a soma dos valores contidos no array

            System.out.println("\n--- Exemplo 5: Arrays Multidimensionais (Matriz) ---");
            int[][] matriz = {
                    {1, 2},
                    {3, 4},
                    {5, 6}
            };

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Valor na posição [" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
            // Arrays multidimensionais são usados para representar tabelas ou grids
            // Acessamos os elementos usando dois índices: linha e coluna

            System.out.println("\n--- Fim da aula sobre arrays em Java ---");


    }

}

