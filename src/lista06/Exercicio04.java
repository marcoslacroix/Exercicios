package lista06;

// Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui. Considere
// sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida; veja um
// exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();

        int resultado = idade * 365;
        System.out.println(nome + ", você já viveu " + resultado);

    }
}
