package lista01;

// Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
// resultado.

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;


        System.out.print("Digige um número: ");
        int read = sc.nextInt();

        if (read > 0) {
            a = read;
            System.out.println(a);
        }else {
            b = read;
            System.out.println(b);
        }



    }
}
