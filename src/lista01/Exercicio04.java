package lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        //Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
        //valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
        //A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
        //com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo
        //devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println((a+b) + " " + (a+c) + " " + (a+d) + " " + (b+c) + " " + (b+d) + " " + (c+d));
        System.out.println((a*b) + " " + (a*c) + " " + (a*d) + " " + (b*c) + " " + (b*d) + " " + (c*d));
    }
}
