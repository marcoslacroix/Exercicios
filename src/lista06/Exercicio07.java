package lista06;

// Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a questão
// dos anos bissextos e considere sempre que um mês possui 30 dias.

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos dias: ");
        int dias = sc.nextInt();
        System.out.print("Informe quantos mêses: ");
        int mes = sc.nextInt();

        int resultado = (mes * 30) + dias;

        System.out.println("Passou " + resultado + " dias");



    }
}
