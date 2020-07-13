package lista01;

// Escreva um programa que verifique se um número é par ou ímpar através de um método chamado VERIFICA.
// O método deverá receber um número inteiro (n) e deverá retornar a mensagem “PAR” ou “ÍMPAR”.

public class Exercicio63 {

    public static void main(String[] args) {

        System.out.println(verifica(100));
    }

    public static String verifica(int n) {
        if (n % 2 ==0) {
            return "PAR";
        }else{
            return "IMPAR";
        }
    }
}


