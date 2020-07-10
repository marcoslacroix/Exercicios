package lista01;

// Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
// ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o
// número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
// fim dos dados.

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int somaNumerosPares = 0;
        int somaNumerosImpar = 0;

        System.out.println("Digite alguns números inteiros e digite algum número negativo para sair.");
        int numero = sc.nextInt();
        while (true) {
            if (numero < 0) {
                break;
            }
            if (numero % 2 == 0) {
                somaNumerosPares += numero;
            }else {
                somaNumerosImpar += numero;
            }
            numero = sc.nextInt();
        }
        System.out.println("A soma dos números par é: " + somaNumerosPares);
        System.out.println("A soma dos números impar é: " + somaNumerosImpar);

    }
}
