package lista01;

// Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
// 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
// Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
// Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
// fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média
// tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com
// valores reais.

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo de viagem: ");
        double tempoViagem = sc.nextDouble();
        System.out.print("Informe a velocidade média: ");
        double velocidadeMedia = sc.nextDouble();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double litrosUsados = distanciaPercorrida / 12;

        System.out.printf("Distância percorrida %.2f foi utilizado %.2f litros", distanciaPercorrida, litrosUsados);

    }
}
