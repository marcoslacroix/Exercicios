package lista06;

// Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um algoritmo para ler
// uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este tipo de conversão).

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double grauCelcius = sc.nextDouble();

        double f = (1.8 * grauCelcius) + 32;
        System.out.printf("A temperatura em Fahrenhei é: %.2f", f);

    }
}
