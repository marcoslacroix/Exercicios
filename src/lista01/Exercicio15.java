package lista01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
        // aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
        // do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
        // apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
        // apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do aluno

        Scanner sc = new Scanner(System.in);
        double[] vect = new double[4];

        System.out.print("Informe o nome do aluno: ");
        String nomeDoAluno = sc.nextLine();

        double sum = 0;
        for (int i=0; i < 4; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double media = sum / vect.length;
        if (media >= 7) {
            System.out.println("O aluno " + nomeDoAluno + " foi aprovado sua média foi: " + media);
        } else {
            System.out.println("Informe a nota de recuperação do aluno: ");
            media += sc.nextDouble();
            media = media / 2;
            if (media >= 7) {
                System.out.println("O aluno " + nomeDoAluno + " foi aprovado na recuperação sua nova média foi: " + media);
            } else {
                System.out.println("O aluno " + nomeDoAluno + " foi reprovado sua média foi: " + media);
            }
        }



    }
}
