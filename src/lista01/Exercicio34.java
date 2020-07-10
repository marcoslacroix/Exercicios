package lista01;

// Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o
// número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
// fim dos dados.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Digite números positivos para adicionar na lista se quiser sair digite um número " +
                "negativo");
        while (true) {
            int numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            list.add(numero);
        }
        int numeroMaior = list.get(0);
        int numeroMenor = list.get(0);

        for (int n : list) { // Usando uma lógica
            if (n > numeroMaior) {
                numeroMaior = n;
            }else if (n < numeroMenor) {
                numeroMenor = n;
            }
        }
        System.out.println(numeroMaior);
        System.out.println(numeroMenor);

// Usando métodos próprio do java
//        Collections.sort(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(list.size() -1));

    }
}
