package lista01;

// Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
// variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
// multiplicado pelo maior e o maior valor dividido pelo menor.

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Digie 3 números: ");
        while (a <= 0 || b <= 0 || c <= 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                break;
            }
            System.out.println("Todos números devem ser maiores que 0.");
        }

        int maior = 0;
        int menor = 0;
        if (a > b && a > c) {
            maior = a;
        }else if (b > c) {
            maior = b;
        }else {
            maior = c;
        }
        if (a < b && a < c) {
            menor = a;
        }else if (b < c) {
            menor = b;
        }else {
            menor = c;
        }

        System.out.println(menor * maior);
        System.out.println(maior / menor);

    }
}
