package lista01;

// Escreva um programa que deverá ter as seguintes opções:

// 1 - Carregar Vetor
// 2 - Listar Vetor
// 3 - Exibir apenas os números pares do vetor
// 4 - Exibir apenas os números ímpares do vetor
// 5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
// 6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
// 7 - Sair

import java.util.Scanner;

public class Exercicio64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vect = new int[10];
        boolean continuar = true;

        while (continuar) {
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor");
            System.out.println("6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor");
            System.out.println("7 - Sair");
            System.out.println("------------------------------------------------------------------");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    vect = carregarVetor(vect, sc);
                    break;
                case 2:
                    listarVetor(vect);
                    break;
                case 3:
                    listarPar(vect);
                    break;
                case 4:
                    listarImpar(vect);
                    break;
                case 5:
                    quantidadePar(vect);
                    break;
                case 6:
                    quantidadeImpar(vect);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Número inválido.");
            }
        }
    }

    public static int[] carregarVetor(int[] vect, Scanner sc) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        return vect;
    }

    public static void listarVetor(int[] vect) {
        for (int i : vect) {
            System.out.println(i);
        }
    }

    public static void listarPar(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
            }
        }
    }

    public static void listarImpar(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 1) {
                System.out.println(vect[i]);
            }
        }
    }

    public static void quantidadePar(int[] vect) {
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void quantidadeImpar(int[] vect) {
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }



}

