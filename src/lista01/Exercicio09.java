package lista01;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
// pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();

        System.out.print("Digite os meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite os dias: ");
        int dias = sc.nextInt();

        System.out.printf("Você possui %d dias de vida", idade * 365 + meses * 30 + dias);
    }
}
