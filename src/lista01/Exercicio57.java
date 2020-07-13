package lista01;

// Fazer um programa que leia uma frase e imprima somente as vogais

import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String read = sc.nextLine();

        int vog = 0;

        for (int i = 0; i < read.length(); i++) {

            char c = read.charAt(i);
            if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vog++;
                continue;
            }
        }
        System.out.println("A quantidade de vogais da frase é " + vog);

    }
}
