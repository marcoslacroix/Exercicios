package lista01;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        //Escreva um programa que leia dois números e apresente a diferença do maior para o menor

        Scanner sc = new Scanner(System.in);

        int primeiroNumbero = sc.nextInt();
        int segundoNumbero = sc.nextInt();

        int diferenca = 0;

        if(primeiroNumbero > segundoNumbero) {
           diferenca = primeiroNumbero - segundoNumbero;
        }else{
            diferenca = segundoNumbero - primeiroNumbero;
        }
        System.out.println(diferenca);

    }
}
