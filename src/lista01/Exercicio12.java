package lista01;

// Escreva um programa que leia um número inteiro e exiba o seu módulo.
// O módulo de um número x é:
// x se x é maior ou igual a zero
// x * (-1) se x é menor que zero

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("O módulo do número é: " + numero);
        }else{
            System.out.println("O módulo do número é: " + numero * (-1));
        }


    }
}
