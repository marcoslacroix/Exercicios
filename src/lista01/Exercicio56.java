package lista01;

// Fazer um programa para ler um vetor de inteiros positivos de 50 posições. Imprimir a quantidade de números
// pares e de múltiplos de 5.

import java.util.Random;

public class Exercicio56 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] vect = new int[50];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(6);
        }

        int countNumerosParMaiorQue5 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0 && vect[i] % 5 == 0) {
                countNumerosParMaiorQue5++;
            }
        }
        System.out.println("A quantidade de números pares e múltiplos de cinco é: " + countNumerosParMaiorQue5);

    }
}
