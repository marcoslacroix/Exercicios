package lista06;

// A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
//Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
//funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
//impostos.

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double desconto = salario * 0.10;
        salario = salario - desconto;
        System.out.println("O salário com o desconto é de " + salario);

    }
}
