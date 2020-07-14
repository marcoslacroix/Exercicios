package lista06;

// Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um algoritmo para
// ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que Carlos e André não
// paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da conta: ");
        double valorConta = sc.nextDouble();

        double carlos = valorConta / 3;
        int andre = (int) valorConta / 3;
        double felipe = valorConta / 3;
        System.out.println(carlos);
        System.out.println(andre);
        System.out.println(felipe);
        

    }
}
