package lista01;

// Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número
// é positivo ou negativo. Pare a execução do programa quando o usuário requisitar.

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1 número (exit pra prar o programa) ");

        while (true) {
            String read = sc.nextLine();
            if (read.equals("exit")){
                break;
            }
            int a = Integer.parseInt(read);
            if (a > 0) {
                System.out.println("O número é positivo.");
            } else if (a == 0) {
                System.out.println("0 é neutro.");
            }
            else {
                System.out.println("O número é negativo.");
            }


        }


    }
}
