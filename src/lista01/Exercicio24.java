package lista01;

// Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja realizar:
// 1 – Verificar se um dos números lidos é ou não múltiplo do outro
// 2 – Verificar se os dois números lidos são pares
// 3 – Verificar se a média dos dois números é maior ou igual a 7.
// 4 – Sair

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 números: ");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro");
        System.out.println("2 – Verificar se os dois números lidos são pares");
        System.out.println("3 – Verificar se a média dos dois números é maior ou igual a 7.");
        System.out.println("4 - Sair");

        int escolha = sc.nextInt();
        int soma = primeiroNumero / segundoNumero;

        switch (escolha) {
            case 1:
                if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
                    System.out.println("Um dos números são múltiplos.");
                }else{
                    System.out.println("Não são múltiplos.");
                }
                break;
            case 2:
                if (primeiroNumero % 2 == 0 && segundoNumero % 2 == 0) {
                    System.out.println("Os dois números são par.");
                } else {
                    System.out.println("Pelo menos um número não é par.");
                }
                break;
            case 3:
                if (soma >= 7) {
                    System.out.println("Média é maior que 7.");
                }else {
                    System.out.println("Média menor que 7.");
                }
                break;
            case 4:
                System.out.println("Saindo.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
