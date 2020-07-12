package application;

import java.util.Scanner;

public class Exercicie01 {

    public static void main(String[] args) {
        ////1. Faça um programa que peça dois números inteiros e gere os números inteiros que estão no intervalo entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 numeros inteiros: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int count = 0;
        while (count < secondNumber) {
            if (count > firstNumber && count < secondNumber) {
                System.out.println(count);
            }
            count++;
        }
    }
}
