package lista01;

// Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um
// operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a
// 50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora
// excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O
// programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
// programa?"

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horasExcedente = 0;
        double resultado = 0;
        double resultadoHorasExcedente = 0;

        while (true) {
            System.out.print("Digite o código: ");
            int codigo = sc.nextInt();
            System.out.print("Digite o número de horas: ");
            int horas = sc.nextInt();
            if (horas > 50) {
                horasExcedente = horas - 50;
                resultadoHorasExcedente = horasExcedente * 20.00;
                System.out.println("deu " + resultadoHorasExcedente + " em horas extras");
            }
            resultado = horas * 10;
            System.out.println("Seu salário foi " + resultado);
            System.out.print("Deseja encerrar o programa? ");
            sc.nextLine();
            String read = sc.nextLine();
            if (read.equals("S")) {
                break;
            }
        }

    }
}
