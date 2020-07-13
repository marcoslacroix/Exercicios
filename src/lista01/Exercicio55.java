package lista01;

//Fazer um programa que leia uma frase de até 50 caracteres e imprima a frase sem os espaços em branco.
// Imprimir também a quantidade de espaços em branco da frase.

import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase de até 50 caracteres.");
        String read = sc.nextLine();
        int count = read.length()-read.replaceAll(" ", "").length();

        while (read.contains(" ")){
            read = read.replaceAll(" ", "");
            count++;
        }

        System.out.println(read);
        System.out.println(count + " espaços na string");

    }
}
