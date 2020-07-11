package lista01;

// Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é
// positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta,
// "Deseja encerrar o programa?" .

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é impar.");
            }
            if (numero < 0) {
                System.out.println(numero + " é negativo.");
            } else {
                System.out.println(numero + " é positivo.");
            }
            sc.nextLine();
            System.out.print("Deseja encerrar o programa? ");
            String read = sc.nextLine();
            if (read.equals("S")) {
                break;
            }
        }
    }
}
