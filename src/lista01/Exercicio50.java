package lista01;

// Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o número sorteado)
// tente acertar. Caso não acerte, o programa deve imprimir uma mensagem informando se o número sorteado é
// maior ou menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a quantidade de tentativas feitas

import java.util.Random;
import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int contador = 0;
        int numeroSorteado = random.nextInt(100);
        while (true) {

            System.out.print("Tente adivinhar o número sorteado: ");
            int numero = sc.nextInt();

            if (numero > numeroSorteado) {
                System.out.println("O número sorteado é menor!");
                System.out.println();
            }else if (numero < numeroSorteado) {
                System.out.println("O Número é maior!");
                System.out.println();
            }else {
                System.out.println("Você acertou o numero, você tentou " + contador + " vezes.");
                break;
            }
            contador++;
        }

    }
}
