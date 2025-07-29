package aula02;

public class Aula02 {

    //  Tipos primitivos, variáveis, operadores e concatenção
    // Aulas 10 a 19 do curso Maratona Java

    public static void main(String[] args) {

        // Tipos primitivos : int, double, float, char, byte, short, long, boolean
        int idade = 30;
        double salario = 2500.50;
        char letra = 'A';
        boolean ativo = true;
        float pi = 3.14f;             // 'f' sufixo obrigatório
        byte codigo = 127;            // -128 a 127
        short ano = 2025;             // -32,768 a 32,767
        long populacao = 7800000000L; // 'L' sufixo para long


        // Variáveis
        String nome = "João"; // String (sequência de caracteres)


        // Operadores e expressões
        int soma = idade + 5; // soma
        double aumento = salario * 1.10; // aumento de 10%

        System.out.println("\n--- Dados Iniciais ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("PI: " + pi);
        System.out.println("Letra: " + letra);
        System.out.println("Ativo: " + ativo);
        System.out.println("Código: " + codigo);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Soma: " + soma);
        System.out.println("Salário com aumento: " + aumento);


        // Exemplo de operadores
        int a = 10;
        int b = 5;
        System.out.println("\n--- Operadores Aritméticos ---");
        System.out.println(a + " + " + b + " = " + (a + b));  // soma
        System.out.println(a + " - " + b + " = " + (a - b));  // subtração
        System.out.println(a + " * " + b + " = " + (a * b));  // multiplicação
        System.out.println(a + " / " + b + " = " + (a / b));  // divisão
        System.out.println(a + " % " + b + " = " + (a % b));  // módulo (resto da divisão)


        // Exemplo de concatenação
        System.out.println("\n--- Concatenação ---");
        String saudacao = "Olá, " + nome + "!";
        System.out.println(saudacao);


        // Exemplo de operadores lógicos
        System.out.println("\n--- Operadores Lógicos ---");
        boolean condicao1 = true;
        boolean condicao2 = false;
        System.out.println("true && false = " + (condicao1 && condicao2)); // AND
        System.out.println("true || false = " + (condicao1 || condicao2)); // OR
        System.out.println("!true = " + (!condicao1));                     // NOT


        // Exemplo de operadores de comparação
        System.out.println("\n--- Operadores de Comparação ---");
        int x = 10, y = 20;
        System.out.println(x + " > " + y + "  = " + (x > y));   // Imprime: Maior que: false
        System.out.println(x + " < " + y + "  = " + (x < y));   // Imprime: Menor que: true
        System.out.println(x + " == " + y + " = " + (x == y));  // Imprime: Igual: false
        System.out.println(x + " != " + y + " = " + (x != y));  // Imprime: Diferente: true
        System.out.println(x + " >= " + y + " = " + (x >= y));  // Imprime: Maior ou igual: false
        System.out.println(x + " <= " + y + " = " + (x <= y));  // Imprime: Menor ou igual: true


        // Exemplo de operadores de atribuição
        System.out.println("\n--- Operadores de Atribuição ---");
        int contador = 0;
        System.out.println("contador = 0");
        contador += 1; System.out.println("contador += 1 → " + contador);  // incremento (contador = contador + 1)
        contador -= 1; System.out.println("contador -= 1 → " + contador);  // decremento (contador = contador - 1)
        contador *= 2; System.out.println("contador *= 2 → " + contador);  // multiplicação (contador = contador * 2)
        contador /= 2; System.out.println("contador /= 2 → " + contador);  // divisão (contador = contador / 2)
        contador %= 3; System.out.println("contador %= 3 → " + contador);  // módulo (contador = contador % 3)


        // Exemplo de operadores de incremento e decremento
        System.out.println("\n--- Incremento/Decremento ---");
        int numero = 5;
        numero++; // incremento (numero = numero + 1)
        System.out.println("Número após incremento: " + numero); // Imprime: Número após incremento: 6
        numero--; // decremento (numero = numero - 1)
        System.out.println("Número após decremento: " + numero); // Imprime: Número após decremento: 5


        // Exemplo de operador ternário
        System.out.println("\n--- Operador Ternário ---");
        int idadePessoa = 18;
        String resultadoIdade = (idadePessoa >= 18) ? "Maior de idade" : "Menor de idade"; // operador ternário
        System.out.println("Resultado da idade: " + resultadoIdade); // Imprime: Resultado da idade: Maior de idade


        // Exemplo de operadores bit a bit
        System.out.println("\n--- Operadores Bit a Bit ---");
        int aBit = 5; // 0101 em binário
        int bBit = 3; // 0011 em binário
        int resultadoEBit = aBit & bBit;   // AND bit a bit (resultado: 0001 em binário, que é 1 em decimal)
        int resultadoOUBit = aBit | bBit;  // OR bit a bit (resultado: 0111 em binário, que é 7 em decimal)
        int resultadoXORBit = aBit ^ bBit; // XOR bit a bit (resultado: 0110 em binário, que é 6 em decimal)
        int resultadoNaoBit = ~aBit;       // NOT bit a bit (resultado: 1010 em binário, que é -6 em decimal, considerando complemento de dois)
        System.out.println("Resultado AND bit a bit: " + resultadoEBit);   // Imprime: Resultado AND bit a bit: 1
        System.out.println("Resultado OR bit a bit: " + resultadoOUBit);   // Imprime: Resultado OR bit a bit: 7
        System.out.println("Resultado XOR bit a bit: " + resultadoXORBit); // Imprime: Resultado XOR bit a bit: 6
        System.out.println("Resultado NOT bit a bit: " + resultadoNaoBit); // Imprime: Resultado NOT bit a bit: -6


        // Exemplo de operadores de deslocamento
        System.out.println("\n--- Deslocamento de Bits ---");
        int num = 8;
        System.out.println(num + " << 2 = " + (num << 2));  // 1000 → 100000 (32)
        System.out.println(num + " >> 2 = " + (num >> 2));  // 1000 → 0010 (2)

        // Exemplo de operadores de atribuição compostos
        System.out.println("\n--- Atribuição Composta ---");
        int valor = 10;
        System.out.println("valor = " + valor);
        valor += 5; System.out.println("valor += 5 → " + valor); // equivalente a valor = valor + 5
        valor -= 3; System.out.println("valor -= 3 → " + valor); // equivalente a valor = valor - 3
        valor *= 2; System.out.println("valor *= 2 → " + valor); // equivalente a valor = valor * 2
        valor /= 4; System.out.println("valor /= 4 → " + valor); // equivalente a valor = valor / 4
        valor %= 3; System.out.println("valor %= 3 → " + valor); // equivalente a valor = valor % 3
    }


}
