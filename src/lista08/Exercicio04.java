package lista08;

// Implemente um algoritmo para cálculo de fatorial.

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para fazer o cálculo fatorial: ");
        int number = sc.nextInt();

        int count = 1;
        int aux = number;
        int otherAux = number-1;
        int result = 0;
        while (count < number) {
            if (count == 1) {
                result += aux * otherAux;
            }else {
                result = result * otherAux;
            }
            count++;
            otherAux--;
        }
        System.out.println(result);
    }


}
