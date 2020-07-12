package lista06;

//  O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o peso do
//  prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorQuilo = 12.00;

        System.out.print("Informe o peso do prato em quilos");
        double pesoPrato = sc.nextDouble();

        double resultado = valorQuilo * pesoPrato;

        System.out.println("O valor a ser pago é: " + resultado);
    }
}
