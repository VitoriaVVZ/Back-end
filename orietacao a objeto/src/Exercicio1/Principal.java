package Exercicio1;

import java.util.Scanner;

public class Principal {
    void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Qual o nome do animal?");
        String nome = sc.next();
        IO.println("Qual o sexo do animal?");
        String sexo = sc.next();
        IO.println("Qual a raça do animal?");
        String raca = sc.next();
        IO.println("Qual a idade do animal?");
        int idade = sc.nextInt();

        Cachorro cachorro = new Cachorro(nome, sexo, raca, idade);
        IO.println(cachorro);

        Scanner sv= new Scanner(System.in);

        IO.println("Qual o nome do animal?");
        String nomee = sv.next();
        IO.println("Qual o sexo do animal?");
        String sexoo = sv.next();
        IO.println("Qual a raça do animal?");
        String racaa = sv.next();
        IO.println("Qual a idade do animal?");
        int idadee = sv.nextInt();

        Gato gato = new Gato(nomee, sexoo, racaa, idadee);

        IO.println(gato);
    }
}
