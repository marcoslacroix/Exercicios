package lista01;

// Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
// possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);

    }
}
