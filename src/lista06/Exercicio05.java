package lista06;

// Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro da
// gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do litro da gosilina: ");
        double valorLitro = sc.nextDouble();
        System.out.print("Digite o valor do pagamento: ");
        double valorTotalPagamento = sc.nextDouble();

        double resultado = valorTotalPagamento / valorLitro;

        System.out.println("O total de litros abastecido foi: " + resultado);
    }
}
