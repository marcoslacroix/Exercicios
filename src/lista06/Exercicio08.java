package lista06;

// Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas
// em pesos respectivos de 1, 2 e 3).

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 notas: ");
        double primeiraNota = sc.nextDouble();
        double segundaNota = sc.nextDouble();
        double terceiraNota = sc.nextDouble();

        double resultado = ((primeiraNota * 1) + (segundaNota * 2) + ( terceiraNota * 3)) / (1+2+3);

        System.out.printf("A média pondera do aluno é: %.2f", resultado);


    }
}
