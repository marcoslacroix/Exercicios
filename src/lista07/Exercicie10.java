package application;

import java.util.Scanner;

public class Exercicie10 {

    public static void main(String[] args) {
        //10. Faça um programa que peça dois números inteiros (base e expoente),
        //calcule e mostre o primeiro número elevado ao segundo número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois numeros inteiros: ");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        // Usando método math pow
        System.out.println(Math.pow(primeiroNumero, segundoNumero));

        // Usando for
        double novoresult = 0;
        for (int i = 0; i < segundoNumero; i++) {
            novoresult += primeiroNumero * primeiroNumero;
        }
        System.out.println(novoresult);
    }
}
