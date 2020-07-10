package lista01;

// Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
// 1 – Adição
// 2 – Subtração
// 3 – Multiplicação
// 4 – Divisão

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números. ");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        System.out.println("1 - Adição ");
        System.out.println("2 – Subtração ");
        System.out.println("3 – Multiplicação ");
        System.out.println("4 – Divisão ");
        int read = sc.nextInt();

        switch (read) {
            case 1:
                System.out.println(primeiroNumero + segundoNumero);
                break;
            case 2:
                System.out.println(primeiroNumero - segundoNumero);
                break;
            case 3:
                System.out.println(primeiroNumero * segundoNumero);
                break;
            case 4:
                if (primeiroNumero > 0 && segundoNumero > 0) {
                    System.out.println(primeiroNumero / segundoNumero);
                    break;
                }
            default:
                System.out.println("Opção inválida.");
        }


    }
}
