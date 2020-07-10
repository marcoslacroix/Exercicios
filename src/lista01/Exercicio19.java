package lista01;

// Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
// lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
// eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
// contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
// ocorrência.

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Informe três valores de um triângulo. ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if (a < c + b && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.print("O triângulo é Eqüilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.print("O triângulo é Isósceles.");
            } else {
                System.out.print("O triângulo é Escaleno.");
            }
        } else {
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }

    }
}
