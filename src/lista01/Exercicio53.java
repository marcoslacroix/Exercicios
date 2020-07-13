package lista01;

// Durante uma corrida de automóveis com N voltas de duração foram anotados para um piloto, na ordem, os tempos
// registrados em cada volta. Fazer um programa para ler os tempos das N voltas, calcular e imprimir:
// i. melhor tempo;
// ii. a volta em que o melhor tempo ocorreu;
// iii. tempo médio das N voltas;

import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vectTempo;

        System.out.print("Digite o número de voltas: ");
        vectTempo = new double[sc.nextInt()];

        System.out.println("Digite os tempos");
        for (int i = 0; i < vectTempo.length; i++) {
            vectTempo[i] = sc.nextDouble();
        }
        double melhorTempo = vectTempo[0];
        int voltas = 1;
        double tempoMedio = 0;
        for (double n : vectTempo) {
            if (n < melhorTempo) {
                melhorTempo = n;
                voltas++;
            }
            tempoMedio+= n;
        }
        tempoMedio = tempoMedio / vectTempo.length;
        System.out.printf("Melhor tempo: " + melhorTempo + " foi na volta número " + voltas + " o tempo médiu ficou " +
                "em %.2f", tempoMedio);

    }
}
