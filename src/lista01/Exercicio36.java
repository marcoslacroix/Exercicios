package lista01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Faça um programa que leia 10 valores inteiros e positivos e:
// - Encontre o maior valor
// - Encontre o menor valor
// - Calcule a média dos números lidos
public class Exercicio36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Digite 10 números inteiros");

        while (list.size() < 10) {
            int numero= sc.nextInt();
            if (numero > 0) {
                list.add(numero);
            }
        }
        Collections.sort(list);
        System.out.println("O menor número é: " + list.get(0));
        System.out.println("O maior número é: " + list.get(list.size() - 1));
    }
}
