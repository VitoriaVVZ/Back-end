package aula3;

import java.util.Scanner;

public class IfElse {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int idade = 18;

        if (idade < 18){
            IO.println("Foi barrado na porta");
        } else {
            IO.println("Liberado");
        }

        IO.print("Digite sua nota");
        int nota1 = sc.nextInt();
                if(nota1 < 4){
                    IO.println("Reprovado");
                } else {
                    IO.println("Aprovado");
                }
        IO.print("Digite sua nota");
        int nota2 = sc.nextInt();
                if (nota2 <= 6){
                    IO.println("Recuperação");
                } else {
                    IO.println("Aprovado");
                }
        IO.print("Digite sua nota");
        int nota3 = sc.nextInt();
                if (nota3 > 6){
                    IO.println("Aprovado");
                } else {
                    IO.println("Reprovado");
                }
                double media =(nota1 + nota2 + nota3) / 3;
                System.out.println("A média aritmética é:" +media);
    }
}
