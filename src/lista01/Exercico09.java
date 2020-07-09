package lista01;

import java.util.Scanner;

public class Exercico09 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
        //pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias

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
