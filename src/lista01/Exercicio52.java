package lista01;

// Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas vezes aparece o número 1, 3 e 4,
// nesta ordem. O vetor terá no máximo 100 posições. Sair do programa quando for digitado -1

import java.util.Random;
import java.util.Scanner;

public class Exercicio52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] vect = new int[100];
        int count = 0;

        while (true) {
            for (int i = 0; i < vect.length; i++) {
                vect[i] = random.nextInt(5);
            }

            for (int i = 0; i < vect.length; i++) {
                if (vect[i] == 1) {
                    if (vect[i] < 98) {
                        if (vect[i + 1] == 3) {
                            if (vect[i + 2] == 4) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println("Deu a sequencia " + count + " vezes.");
            System.out.println("-1 pra sair do programa.");
            String read = sc.nextLine();
            if (read.equals("-1")) {
                break;
            }
        }
    }
}