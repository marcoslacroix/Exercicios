package lista06;

// A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia
// de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a
// rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a
// fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float queijo = (float) (0.50 * 2);
        float presunto = (float) (0.50 * 1);
        float hamburguer = (float) (0.100 * 1);

        System.out.print("Informe a quantidade de sanduíches a fazer: ");
        int quantidadeSanduiches = sc.nextInt();

        float totalQueijo = quantidadeSanduiches * queijo;
        float totalPresunto = quantidadeSanduiches * presunto;
        float totalHamburguer = quantidadeSanduiches * hamburguer;

        System.out.println(presunto * 10 * 10);
        System.out.println(totalQueijo + " kilos de queijo");
        System.out.println(totalPresunto + " kilos de presunto");
        System.out.println(totalHamburguer + " kilos de hamburguer");

    }
}
