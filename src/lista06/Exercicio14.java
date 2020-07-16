package lista06;

//  Calcule a área de uma pizza que possui um raio R (pi=3.14).

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;
        final double PI = 3.14;

        System.out.print("Informe o raio: ");
        raio = sc.nextDouble();

        area = PI * Math.pow(raio, 2);
        System.out.println("O valor da área da pizza é: " + area);
    }
}
