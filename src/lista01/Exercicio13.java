package lista01;

// Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        Collections.sort(list);

        for (int a : list) {
            System.out.println(a);
        }







    }

}

