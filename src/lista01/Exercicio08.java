package lista01;

// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
// V =  3.14159 * R * R * A

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raioLata, alturaLata, VolumeLata;

        System.out.print("Cálculo de volume de lata de óleo\n\n");


        System.out.print("Digite diâmeto da lata (em cm): ");
        raioLata = sc.nextDouble()/2;

        System.out.print("Digite a altura da lata (em cm): ");
        alturaLata = sc.nextDouble();


        VolumeLata = Math.PI * raioLata * raioLata * alturaLata;

        System.out.print("\n O volume da lata é de " + VolumeLata + " cm³\n");



    }
}
