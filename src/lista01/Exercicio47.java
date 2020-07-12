package lista01;

// Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro, também positivo e
// maior que zero. Faça um programa para:
//   a. ler pelo teclado o vetor;
//   b. ler pelo teclado o número X;
//   c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        System.out.println("Digite 10 números positivos maiores que zero.");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        System.out.println("Digite um número X.");
        int x = sc.nextInt();

        int numerosMaiorQueX = 0;
        int numerosMenorQueX = 0;
        int igualX = 0;

        for (int n : vect) {
            if (n > x) {
                numerosMaiorQueX++;
            }else if (n < x) {
                numerosMenorQueX++;
            }else{
                igualX++;
            }
        }
        System.out.println("Números maiores que X: " + numerosMaiorQueX);
        System.out.println("Números menores que X: " + numerosMenorQueX);
        System.out.println("Números iguais a X: " + igualX);

    }
}
