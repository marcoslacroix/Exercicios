package lista01;

// Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a leitura.

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect;

        System.out.print("Digite quantos números vai ter o vetor: ");
        vect= new int[sc.nextInt()];
        System.out.println("Digite uma seqüência de números");
        for (int i=0; i<vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        int[] vectAux = new int[vect.length];

        int count = 0;
        for (int i = vect.length-1; i >= 0; i--) {
            vectAux[count] = vect[i];
            count++;
        }
        for (int i : vectAux) {
            System.out.println(i);
        }


    }
}
