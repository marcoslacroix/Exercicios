package lista06;

//  A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
// dimensões de um terreno e depois exibir a área do terreno.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura do terreno: ");
        int altura = sc.nextInt();
        System.out.print("Informe a largura do terreno: ");
        int largura = sc.nextInt();
        sc.nextLine();
        int dimensao = altura * largura;
        System.out.println("A dimensão do terreno é de " + dimensao + " cm2");
    }
}
