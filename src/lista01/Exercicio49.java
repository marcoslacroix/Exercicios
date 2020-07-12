package lista01;

// Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes que
// V1 e V2 possuem valores idênticos nas mesmas posições.

import java.util.Random;

public class Exercicio49 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vectX = new int[50];
        int[] vectY = new int[50];

        for (int i =0; i < vectX.length; i++) {
            vectX[i] = random.nextInt(20);
            vectY[i] = random.nextInt(20);
        }
        int contador = 0;
        for (int i = 0; i<vectX.length; i++) {
            if (vectX[i] == vectY[i]) {
                contador++;
            }
            System.out.println("Vetor X " + vectX[i] + " Vetor Y " + vectY[i]);
        }
        System.out.println("Foram repetidos os mesmo valores na mesma posição " + contador);
    }
}
