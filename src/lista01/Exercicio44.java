package lista01;

// Faça um programa que exiba as opções:
// 1 – Conversão de Graus Celsius em Graus Fahrenheit
// 2 – Conversão de Graus
// 3 – Peso ideal do homem
// 4 – Peso ideal da mulher
// O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar
// o programa?” Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 – Conversão de Graus ");
            System.out.println("3 – Peso ideal do homem");
            System.out.println("4 – Peso ideal da mulher ");
            int escolha = sc.nextInt();
            double result;
            double altura;

            switch (escolha) {
                case 1:
                    System.out.print("Digite a temperatura em graus celsius: ");
                    double temperaturaGrauCelsius = sc.nextDouble();
                    final double formula = (temperaturaGrauCelsius * 1.8) + 32;
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n ", formula);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double temperaturaFahrenheit = sc.nextDouble();
                    final double segundaFormlula = (temperaturaFahrenheit - 32) * 5 / 9;
                    System.out.printf("A temperatura em grau celcius é %.2f\n ", segundaFormlula);
                    break;
                case 3:
                    System.out.print("Digite sua altura: ");
                    altura = sc.nextDouble();
                    result = (72.7 * altura) - 58;
                    System.out.printf("O seu peso ideal é: %.2f\n", result);
                    break;
                case 4:
                    System.out.print("Digite sua altura: ");
                    altura = sc.nextDouble();
                    result = (62.1 * altura) - 44.7;
                    System.out.printf("O seu peso ideal é: %.2f\n ", result);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
            sc.nextLine();
            System.out.print("Deseja encerrar o programa? ");
            String read = sc.nextLine();
            if(read.equals("S") || read.equals("s")) {
                break;
            }
        }
    }
}
