package lista01;

// Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através de um método chamado VERIFICA_QUADRANTE,
// que deve receber um valor para x e um valor para y.

import java.util.Scanner;

public class Exercicio60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println(verificaQuadrante(x, y));


    }
    public static int verificaQuadrante(int x, int y) {
        boolean quadX, quadY;
        if (x >= 0 ) {
            quadX = true;
        }else {
            quadX = false;
        }
        if (y >= 0) {
            quadY = true;
        }else {
            quadY = false;
        }
        if (x==0 || y==0) {
            return 0;
        } else if (quadX && quadY) {
            return 1;
        } else if (!quadX && quadY) {
            return 2;
        } else if (quadX && !quadY) {
            return 3;
        }else {
            return 4;
        }
    }
}


