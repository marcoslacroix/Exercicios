package lista01;

// Order vector ordem crescente

import java.util.Scanner;

public class Exercicio65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vect = new int[10];
        int aux;

        System.out.println("Adicione 10 números no vetor.");
        for (int i=0; i<10; i++) {
            vect[i] = sc.nextInt();
        }

        for (int i=1; i<10; i++) {
            for (int j=0; j<10 -1; j++) {
                if (vect[j] > vect[j + 1]) {
                    aux = vect[j + 1];
                    vect[j+1] = vect[j];
                    vect[j] = aux;
                }
            }
        }
        for (int i : vect) {
            System.out.print(i + " ");
        }

    }

}
