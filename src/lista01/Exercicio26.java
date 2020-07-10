package lista01;

// Escreva um programa que leia:
// - a quantidade de números que deverá processar;
// - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial.
// Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número que deseja ver seu fatorial: ");
        int fatorial = sc.nextInt();

        int result = 0;
        int count = 1;
        for (int i = 1; i <= fatorial; i++) {
            System.out.println(count *= i);
        }

    }
}
