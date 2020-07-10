package lista01;

// Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
// comissão será de 5% do total da venda e que você tem os seguintes dados:
//  - Identificação do vendedor
//  - Código da peça
//  - Preço unitário da peça
//  - Quantidade vendida

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeVendedor = "";
        int codigoPeca = 0;
        double valorUnitario = 0;
        int quantidadeVendida = 0;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = sc.nextLine();

        System.out.print("Digite o código da peça: ");
        codigoPeca = sc.nextInt();

        System.out.print("Digite o preço da peça: ");
        valorUnitario = sc.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        quantidadeVendida = sc.nextInt();

        double comissao = (valorUnitario * quantidadeVendida) * 0.05;
        System.out.print("Comissão do vendendor " + nomeVendedor + " é de " + comissao);
    }
}
