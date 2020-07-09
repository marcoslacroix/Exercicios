package lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        //Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
        //temperatura a ser utilizada é F = (C * 1.8 ) + 32, em que a variável F representa é a temperatura em graus
        //Fahrenheit e a variável C representa é a temperatura em graus Celsius.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus celsius: ");
        double temperaturaGrauCelsius = sc.nextDouble();

        final double formula = (temperaturaGrauCelsius * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f ", formula);
    }
}
