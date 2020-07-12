package application;

import java.util.Scanner;

public class Exercicie07 {
    public static void main(String[] args) {
        //7. Faça um programa que gere a tabuada de 1 a 10 de qualquer número. O usuário deve informar de qual número deseja ver a tabuada.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe qual tabuada deseja: ");
        int tabuada = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "*" + tabuada + " = " + i * tabuada);
        }

    }
}
