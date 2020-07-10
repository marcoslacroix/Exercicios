package lista01;

// Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos
// ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Digite um número maior que 0 e menor que 10: ");
        int numero = sc.nextInt();
        while(numero <= 0 || numero >= 10) {
            numero = sc.nextInt();
        }
        for (int i = numero; i < 40 + numero; i++) {
            if (i % 2 == 1) {
                resultado += i * i;
            }
        }
        System.out.println(resultado);
    }
}
