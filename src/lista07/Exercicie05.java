package application;

import java.util.Scanner;

public class Exercicie05 {
    public static void main(String[] args) {
        //5. Faça um programa que calcule o número médio de alunos por turma.
        //Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

        Scanner sc = new Scanner(System.in);

        int[] vectAlunos;
        int numeroAlunos = 0;

        System.out.println("Informe a quantidade de turmas: ");
        vectAlunos = new int[sc.nextInt()];

        System.out.println("Informe a quantidade de alunos em cada turma: ");
        for (int i = 0; i < vectAlunos.length; i++) {
            int quantidadeDeAlunos = sc.nextInt();
            if (quantidadeDeAlunos <= 40){
                vectAlunos[i] = quantidadeDeAlunos;
                numeroAlunos += quantidadeDeAlunos;
            }
        }
        System.out.println("A quantidade média de alunos por turma é de: " + numeroAlunos / vectAlunos.length);

    }
}
