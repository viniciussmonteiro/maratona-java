package aula03;

public class Aula03 {

// Estruturas condicionais: If, Else, Else If,Switch

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

        System.out.println("\n--- Exemplo 2: If-Else ---");
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

        System.out.println("\n--- Exemplo 4: Switch ---");
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
