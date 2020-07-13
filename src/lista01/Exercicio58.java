package lista01;

// Fazer um programa para armazenar em um vetor, vários números inteiros e positivos e calcular a média. Imprimir
// também o maior. A quantidade de números lidos será definida pelo usuário.

import java.util.Scanner;

public class Exercicio58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect;

        System.out.print("Digite o tamanho do vetor: ");
        vect = new int[sc.nextInt()];

        System.out.println("Digite " + vect.length + " números.");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        int count = 0;
        int numeroMaior = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > numeroMaior) {
                numeroMaior = vect[i];
            }
            count+= vect[i];
        }
        double media = (double)count / vect.length;
        System.out.println("A média ficou " + media + " e o número maior é: " + numeroMaior);
    }
}
