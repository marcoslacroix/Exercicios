package lista01;

// Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou seja, realizar
// a soma de todos dos resultados da multiplicação de x[i] por y[i].

import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[5];

        System.out.println("Digite 5 números para o vetor x!");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Digite 5 números para o vetor y!");
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma = soma + x[i] * y[i];
        }
        System.out.print("A soma dos dois vetores é: " + soma);

    }
}
