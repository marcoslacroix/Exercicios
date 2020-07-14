package lista06;

// Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
// CENTENA = x DEZENA = x UNIDADE = x

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de três digitos: ");
        int numero = sc.nextInt();
        // 123


        int unidade = (numero%10);
        int dezena = (numero/10) % 10;
        int centena = (numero / 10) / 10;

        switch (dezena) {
            case 1: dezena = 10;break;
            case 2: dezena = 20;break;
            case 3: dezena = 30;break;
            case 4: dezena = 40;break;
            case 5: dezena = 50;break;
            case 6: dezena = 60;break;
            case 7: dezena = 70;break;
            case 8: dezena = 80;break;
            case 9: dezena = 90;break;
        }
        switch (centena) {
            case 1: centena = 100;break;
            case 2: centena = 200;break;
            case 3: centena = 300;break;
            case 4: centena = 400;break;
            case 5: centena = 500;break;
            case 6: centena = 600;break;
            case 7: centena = 700;break;
            case 8: centena = 800;break;
            case 9: centena = 900;break;
        }

        System.out.println("unidade "+unidade);
        System.out.println("dezena "+dezena);
        System.out.println("centena " +centena);

    }
}
