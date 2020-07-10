package lista01;

// Faça um programa que:
//  - Leia a cotação do dólar
//  - Leia um valor em dólares
//  - Converta esse valor para Real
//  - Mostre o resultado

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorDolar = 5.28;

        System.out.print("Digite o valor em dólar para converter em real: ");
        double quantidadeDolar = sc.nextDouble();
        System.out.println(valorDolar * quantidadeDolar + " reais");
    }
}
