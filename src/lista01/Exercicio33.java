package lista01;

// Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova.
// O número de alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos da turma: ");
        int numeroDeAlunos = sc.nextInt();
        double notas = 0;

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.print("Digite a nota de um aluno: ");
            notas += sc.nextInt();
        }
        System.out.println("A média da turma foi de " + (notas / numeroDeAlunos));

    }
}
