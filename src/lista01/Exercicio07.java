package lista01;

// Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
// temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus
// Fahrenheit e a ariável C é a temperatura em graus Celsius

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = sc.nextDouble();

        final double formula = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.printf("A temperatura em grau celcius é %.2f", formula);
    }
}
