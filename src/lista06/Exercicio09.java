package lista06;

// Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente
// por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias
// e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorTamanhoPequeno = 10;
        int valorTamanhoMedio = 12;
        int valorTamanhoGrande = 15;

        System.out.print("Informe a quantidade de camisetas pequenas: ");
        int quantidadePequenas = sc.nextInt();
        System.out.print("Informe a quantidade de camisetas médias: ");
        int quantidadeMedias = sc.nextInt();
        System.out.print("Informe a quantidade de camisetas grandes: ");
        int quantidadeGrandes = sc.nextInt();

        int resultado = (quantidadePequenas * valorTamanhoPequeno) + (quantidadeMedias * valorTamanhoMedio) + (quantidadeGrandes * valorTamanhoGrande);

        System.out.println("O valor total vendido foi de R$" + resultado);
    }
}
