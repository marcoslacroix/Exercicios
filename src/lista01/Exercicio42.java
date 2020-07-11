package lista01;

//Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de um
// valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO)

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 2 números.");
            int primeiroNumero = sc.nextInt();
            if (primeiroNumero == 0) {
                break;
            }
            int segundoNumero = sc.nextInt();
            if (segundoNumero == 0) {
                break;
            }

            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro número é maior");
            }else {
                System.out.println("Segundo número maior");
            }
        }

    }
}
