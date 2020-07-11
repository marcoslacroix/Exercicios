package lista01;

// A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente
// poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
// indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias
// do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
// notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a notificação
// adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário responder "S"
// na seguinte pergunta, "Deseja encerrar o programa?".

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a indice de poluição: ");
            double indice = sc.nextDouble();
            if (indice >= 0 && indice < 0.3) {
                System.out.println("Índice de poluição aceitável.");
            }
            else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("O 1º grupo deve suspender as atividades.");
            }else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("O 1º e 2º grupo devem suspender as atividades.");
            }else{
                System.out.println("Todos os grupos devem paralizar as atividades.");
            }


            System.out.print("Deseja encerrar o programa?");
            String read = sc.nextLine();
            if (read.equals("S") || read.equals("s")) {
                break;
            }
        }



    }
}
