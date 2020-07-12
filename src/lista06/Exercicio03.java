package lista06;

//  A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho
//  custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e
//  broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para
//  fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas
//  , e depois calcular os dados solicitados.

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pao = 0.12;
        double broa = 1.50;

        System.out.print("Digite a quantidade de pães franceses vendido: ");
        int quantidadePao = sc.nextInt();
        System.out.print("Digite a quantidade de broas vendidas: ");
        int quantidadeBroa = sc.nextInt();

        double resultado = (pao * quantidadePao) + (broa * quantidadeBroa);
        double poupanca = resultado * 0.10;

        System.out.println("Foram arrecadados R$" + resultado + " no final do dia e o valor para depositar na conta " +
                "poupança é de R$" + poupanca);




    }
}
