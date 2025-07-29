package aula05;

public class Aula05 {

    //Aula 05 - Classes e Objetos

    public static void main(String[] args) {


        // Exemplo de uso da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");

        // Exemplo de uso da classe Carro
        Carro carro = new Carro("Fusca", "Volkswagen");
        System.out.println("O carro é um " + carro.getModelo() + " da marca " + carro.getMarca() + ".");



    }


}
