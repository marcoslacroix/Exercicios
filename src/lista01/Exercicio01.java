package lista01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Faça um programa para calcular o estoque médio de uma peça, sendo que:
        // ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.

        Scanner sc = new Scanner(System.in);

        double quantidadeMinima = sc.nextDouble();
        double quantidadeMaxima = sc.nextDouble();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.print("Estoque médio = " + estoqueMedio);
    }
}
