package application;

import java.util.Scanner;

public class Exercicie04 {
    public static void main(String[] args) {
        //4. Faça um programa que calcule e mostre a média bimestral da turma.
        //O usuário deve informar a quantidade de notas, bem como cada nota.

        Scanner sc = new Scanner(System.in);

        double[] vectNotas;
        double somaDasNotas = 0;

        System.out.print("Digite a quantidade de alunos: ");
        vectNotas = new double[sc.nextInt()];

        System.out.println("Informe as notas: ");
        for (int i = 0; i < vectNotas.length; i++) {
            vectNotas[i] = sc.nextDouble();
            somaDasNotas += vectNotas[i];
        }
        System.out.println("A média da turma é: " + somaDasNotas / vectNotas.length);


    }
}
