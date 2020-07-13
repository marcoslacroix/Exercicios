package lista01;

// Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres existente
// entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir
// mensagem de erro. Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9

import java.util.Scanner;

public class Exercicio59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String primeiraLetra = sc.nextLine();
        String segundaLetra = sc.nextLine();

        int comp = primeiraLetra.compareTo(segundaLetra);

        int n = Math.abs(comp) - 1;
        if (comp < 0) {
            System.out.println("o número de caracteres entre eles é: " + n);
        }else if (comp > 0) {
            System.out.println("Error!!");
        }else {
            System.out.println("As letras são iguais");
        }


    }
}
