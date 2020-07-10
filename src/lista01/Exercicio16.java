package lista01;

// Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
// menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe 2 números: ");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O número maior é " + primeiroNumero);
            System.out.println("E o número menor é " + segundoNumero);
        } else if (segundoNumero > primeiroNumero){
            System.out.println("O número maior é " + segundoNumero);
            System.out.println("E o número menor é " + primeiroNumero);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
