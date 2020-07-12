package application;

import java.util.Scanner;

public class Exercicie03 {
    public static void main(String[] args) {
        //3. Faça um programa que leia dez números inteiros e calcule a diferença entre o maior e o menor número do conjunto.

        Scanner sc = new Scanner(System.in);

        int vect[] = new int[10];

        System.out.println("Digite 10 números inteiros :");
        for (int i = 0; i < 10; i++) {
            vect[i] = sc.nextInt();
        }
        int higherNumber = vect[0];
        int lowerNumber = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > higherNumber) {
                higherNumber = vect[i];
            }
            if (vect[i] < lowerNumber) {
                lowerNumber = vect[i];
            }
        }
        System.out.println("A diferençã entre o número maior e o número menor é: " + (higherNumber - lowerNumber));
    }
}
