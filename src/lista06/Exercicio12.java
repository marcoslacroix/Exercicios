package lista06;

// Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento, desconte 8% de impostos.
// Imprima o salário inicial, o salário com o aumento e o salário final.

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: ");
        double salario = sc.nextInt();

        double valorAumento = salario + (salario * 0.15);
        double valorDesconto = valorAumento - (valorAumento * 0.08);
        System.out.println("O valor do salário ficou em R$" + valorDesconto);

    }
}
