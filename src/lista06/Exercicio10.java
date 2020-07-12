package lista06;

// Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada ponto é um par
// ordenado (x,y).

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 2 dados do ponto A");
        int xA = sc.nextInt();
        int xB = sc.nextInt();
        System.out.println("Digite os 2 dados do ponto B");
        int yA = sc.nextInt();
        int yB = sc.nextInt();

        // ???????????????????
        int x = (xB - xA);
        x = x * x;
        int y = (yB - yA);
        y = y * y;
        int result = x + y;
        double resultFinal = Math.sqrt(result);
        System.out.println("O resultado é: " + resultFinal);




    }
}
