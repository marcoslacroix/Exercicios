package lista01;

// Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
// utilizando as seguintes fórmulas: (h = altura)
// - Para homens: (72.7*h) - 58
// - Para mulheres: (62.1 *h) - 44.7

import java.util.Scanner;

public class Exericico25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite seu sexo H para homens ou M para mulheres: ");
        String read = sc.nextLine();

        double result = 0;
        if (read.equals("H")) {
            result = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal é: %.2f", result);
        }else if (read.equals("M")) {
            result = (62.1 * altura) - 44.7;
            System.out.printf("O seu peso ideal é: %.2f ", result);
        }else {
            System.out.println("Não foi possível indentificar o sexo H para homens ou M para mulheres.");
        }
    }
}
