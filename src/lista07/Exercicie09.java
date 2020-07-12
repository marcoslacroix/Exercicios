package application;

import java.util.Scanner;

public class Exercicie09 {

    public static void main(String[] args) {
        //9. Faça um programa que calcule e mostre a soma dos números pares entre 100 e 200 (inclusive).
        //O usuário deve ter a opção de repetir quantas vezes quiser esta operação.

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos numeros par é de: " + soma);
    }
}
