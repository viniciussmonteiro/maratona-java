package aula03;

public class Aula03 {

    // Estruturas condicionais: If, Else, Else If,Switch
    // Aulas 20 a 26 do curso Maratona Java

    public static void main(String[] args) {

        int idade = 20;
        boolean maiorDeIdade = idade >= 18;

        System.out.println("\n--- Exemplo 1: If ---");
        if (maiorDeIdade) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        }
        if (!maiorDeIdade) {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        System.out.println("\n--- Exmplo 2: If-Else ---");
        if (maiorDeIdade) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        System.out.println("\n--- Exemplo 3: If-Else If-Else ---");
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Aprovado com louvor.");
        } else if (nota >= 70) {
            System.out.println("Aprovado.");
        } else if (nota >= 50) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.println("\n--- Exemplo 4: Switch ---"); // o switch é usado para comparar uma variável com vários valores possíveis
        // O switch é mais legível quando se tem muitos casos a serem verificados
        // O switch é mais eficiente que vários if-else aninhados
        // O switch pode ser usado com tipos primitivos (int, char, byte, short), String e enum
        // O switch não suporta intervalos de valores, apenas valores exatos
        // O switch não suporta operadores lógicos, apenas igualdade
        // O switch pode ter um caso default, que é executado se nenhum caso for correspondido
        // O switch pode ter múltiplos casos que executam o mesmo bloco de código

        String dia = "Segunda";
        switch (dia) {
            case "Segunda":
                System.out.println("Hoje é segunda-feira.");
                break;
            case "Terça":
                System.out.println("Hoje é terça-feira.");
                break;
            case "Quarta":
                System.out.println("Hoje é quarta-feira.");
                break;
            case "Quinta":
                System.out.println("Hoje é quinta-feira.");
                break;
            case "Sexta":
                System.out.println("Hoje é sexta-feira.");
                break;
            case "Sábado":
                System.out.println("Hoje é sábado.");
                break;
            case "Domingo":
                System.out.println("Hoje é domingo.");
                break;
            default:
                System.out.println("Dia inválido.");


        }

    }

}
