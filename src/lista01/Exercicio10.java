package lista01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
        //entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.

        Scanner sc = new Scanner(System.in);

        int primeiroNumbero = 0;
        int segundoNumbero = 0;

        System.out.print("Digite 2 números inteiros: ");
        primeiroNumbero = sc.nextInt();
        segundoNumbero = sc.nextInt();

        if (primeiroNumbero > segundoNumbero) {
            System.out.println("Primeiro número é maior!");
        }else {
            System.out.println("Segundo número é maior!");
        }
        if (primeiroNumbero < segundoNumbero) {
            System.out.println("Primeiro número é menor!");
        } else {
            System.out.println("Segundo número é menor!");
        }
        if (primeiroNumbero == segundoNumbero) {
            System.out.println("Os dois números são iguais!");
        }
        if (primeiroNumbero != segundoNumbero) {
            System.out.println("Os dois números são diferentes!");
        }
    }
}
