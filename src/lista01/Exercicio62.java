package lista01;

// Escreva um programa que calcule e retorne o valor da hipotenusa através do método HIPOTENUSA. O método recebe
// o valor da base e da altura de um triângulo.

// Fórmulas: hipotenusa² = base² + altura²
//
//                      base x altura
//              área = ----------------------
//                          2

import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double altura = sc.nextDouble();
        System.out.println(hipotenusa(base, altura));

    }

    public static double hipotenusa(double base, double altura) {
        return Math.sqrt((base * base) + (altura * altura));
    }
}
