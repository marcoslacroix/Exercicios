package lista01;

// Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em C que imprima todos os elementos
// comuns aos dois vetores.

import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vectA = new int[5];
        int[] vectB = new int[8];

        System.out.println("Dê 5 números para o vetor A");
        for (int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }
        System.out.println("Dê 8 números para o vetor B");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }
        System.out.print("Os números em comum são: ");
        for (int i = 0; i < vectA.length; i++) {
            for (int j = 0; j < vectB.length; j++) {
                if (vectB[j] == vectA[i]) {
                    System.out.print(vectB[j] + " ");
                }
            }
        }

    }
}
