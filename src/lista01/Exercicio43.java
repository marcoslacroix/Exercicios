package lista01;

// Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de
// alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de
// xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros subseqüentes, o dobro do
// quadro anterior. A rainha achou o trabalho barato e pediu que o serviço fosse executado, sem se  dar
// conta de que seria impossível efetuar o pagamento. Faça um programa para calcular o número de grãos que
// o monge esperava receber.

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {

        long[][] vect = new long[8][8];

        long graos = 1;
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect.length; j++) {
                vect[i][j] = graos;
                if (graos == 1) {
                    graos++;
                }else {
                    graos = graos *2;
                }
            }
        }
        System.out.println("A quantidade de grãos foi: " + vect[7][6]);

    }
}
