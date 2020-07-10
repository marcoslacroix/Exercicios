package lista01;

// Faça um programa para imprimir uma tabuada.

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada. ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

    }
}
