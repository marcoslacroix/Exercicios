package lista01;

// Escreva um programa que calcule e retorne o salário atualizado através do método REAJUSTE. O método deve receber
// o valor do salário e o índice de reajuste.

import java.util.Scanner;

public class Exercicio61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salario: ");
        double salary = sc.nextDouble();
        System.out.print("Informe o reajuste: ");
        double porcentagem = sc.nextDouble();

        double novoSalary = salary + reajuste(salary, porcentagem);
        System.out.println(novoSalary);
    }

    public static double reajuste(double salary, double porcentagem) {
        return salary * porcentagem;
    }
}
