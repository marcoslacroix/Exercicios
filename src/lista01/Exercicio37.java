package lista01;

// Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as seguintes
// opções:
//  1 – Adição
//  2 – Subtração
//  3 – Multiplicação
//  4 – Divisão
//  Informe a opção

// A partir da opção escolhida, o programa deverá solicitar para que o usuário digite dois números. Em seguida, o
// programa deve exibir o resultado da opção indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao
// menu principal. Caso a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar o programa.

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int primeiroNumero = 0;
        int segundoNumero = 0;

        while (true) {
            System.out.println("Escolha uma das opção: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int opcao = sc.nextInt();
            if (opcao < 4 && opcao > 0) {
                System.out.println("Sua opção foi: " + opcao);
                System.out.println("Ok, digite dois números inteiros.");
                primeiroNumero = sc.nextInt();
                segundoNumero = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
                    break;
                case 2:
                    System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
                    break;
                case 3:
                    System.out.println(primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero * segundoNumero));
                    break;
                case 4:
                    if (primeiroNumero <= 0 || segundoNumero <= 0) {
                        System.out.println("Numero inválido.");
                    } else {
                        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero / segundoNumero));
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            sc.nextLine();
            System.out.println("Deseja voltar para o menu principal? (s ou S)");
            String read = sc.nextLine();
            if (read.equals("s") || read.equals("S")) {
                continue;
            }else {
                break;
            }
        }




    }
}
