package lista06;

// 2. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos cavalos existem?");
        int quantidadeDeCavalos = sc.nextInt();

        int quantidadeDeFerraduras = quantidadeDeCavalos * 4;

        System.out.println("São necessárias " + quantidadeDeFerraduras + " ferraduras.");
    }
}
