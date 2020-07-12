package lista01;

// Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada um dos N alunos e calcular a
// média aritmética das notas. Contar quantos alunos estão com a nota acima de 7.0. Obs.: Se nenhum aluno
// tirou nota acima de 5.0, imprimir mensagem: Não há nenhum aluno com nota acima de 5.

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect;
        double notas = 0;
        double media = 0;
        int quantidadeAlunosAcimaDaMedia = 0;
        int quantidadeNotasAcimaDeCinco = 0;

        System.out.print("Informe a quantidade de alunos: ");
        vect = new int[sc.nextInt()];

        for (int n : vect) {
            System.out.print("Informe a nota: ");
            double nota = sc.nextDouble();
            notas += nota;
            if (nota >= 7.00) {
                quantidadeAlunosAcimaDaMedia++;
            }else if (nota >= 5.0) {
                quantidadeNotasAcimaDeCinco++;
            }
        }
        media = notas / vect.length;
        System.out.printf("A média da turma ficou em %.2f%n", media);
        if (quantidadeNotasAcimaDeCinco == 0) {
            System.out.println("Não há nenhum aluno com nota acima de 5");
        }
        else if (quantidadeAlunosAcimaDaMedia >= 0) {
            System.out.println(quantidadeAlunosAcimaDaMedia + " aluno com nota acima da média.");
        }


    }
}
