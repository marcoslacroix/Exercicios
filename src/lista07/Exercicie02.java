package application;

import java.util.Scanner;

public class Exercicie02 {
    public static void main(String[] args) {
        //2. Faça um programa que peça dois números inteiros e gere os números pares que estão no intervalo entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 numeros inteiros: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        for(int i = 0; i < secondNumber; i++) {
            if (i > firstNumber && i < secondNumber) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
