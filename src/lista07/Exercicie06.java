package application;

import java.util.Scanner;

public class Exercicie06 {

    public static void main(String[] args) {
        //6. Faça um programa que calcule o valor total investido e o custo médio por CD.
        // O usuário deverá informar a quantidade de CDs e o valor para em cada um.

        Scanner sc = new Scanner(System.in);
        double[] vectQuantidadeDeCds;
        double valorTotalInvestido = 0;

        System.out.println("Informe a quantidade de CD's: ");
        vectQuantidadeDeCds = new double[sc.nextInt()];

        System.out.println("Informe o valor de cada CD: ");
        for (int i = 0; i < vectQuantidadeDeCds.length; i++) {
            vectQuantidadeDeCds[i] = sc.nextDouble();
            valorTotalInvestido += vectQuantidadeDeCds[i];
        }
        System.out.println("O valor total investido foi de: "
                + valorTotalInvestido
                + " e o valor médio de cada cd "
                + "foi de: "
                + (valorTotalInvestido / vectQuantidadeDeCds.length));


    }
}
