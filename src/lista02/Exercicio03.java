package lista02;

// Implementar uma classe Apolice com os seguintes atributos nome do segurado, idade do segurado e valor do prêmio d
// a apólice. Nesta classe Apolice devem ser implementados os métodos:

//  *imprimir () - este método não retorna valor e deverá mostrar na tela todos os atributos da classe Apolice.
//  Para imprimir em java usa-se o comando [System.out.println(nome do atributo);]

//  *calcularPremioApolice() - este método não retorna valor e deverá calcular o valor do prêmio seguindo as
//  seguintes regras: caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use a formula
//  valorPremio+=(valorPremio*20)/100. Quando a idade for superior a 25 e menor ou igual a 26, use a
//  formula valorPremio+=(valorPremio*15)/100. Quando a idade for superior a 36 use
//  a formula valorPremio+=(valorPremio*10)/100.

//  *oferecerDesconto() - este método não retorna valor, mas recebe o parâmetro cidade, que irá conter o nome da
//  cidade para o cálculo do desconto. Caso a cidade seja Curitiba, dê um desconto de no valor do premio de 20%,
//  caso seja Rio de Janeiro, dê um desconto no valor do premio de 15%, caso seja São Paulo dê um desconto no valor
//  do premio de 10% e se for Belo Horizonte dê um desconto no valor do premio de 5%.

import java.util.Scanner;

// Logo após implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequência de instruções para testar as funcionalidades da classe Apolice.
public class Exercicio03 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(input.nextLine());
        System.out.print("Digite o Valor do Premio da Apólice: ");
        double valorPremio = Double.parseDouble(input.nextLine());


        Apolice apolice01 = new Apolice(nome,idade,valorPremio);
        apolice01.imprimir();


        apolice01.calcularPremioApolice();

        System.out.print("Digite a cidade: ");
        String cidade = input.nextLine();
        apolice01.oferecerDesconto(cidade);

        apolice01.imprimir();

    }

    public static class Apolice {

        String nome;
        int idade;
        double valorPremio;

        public Apolice(String nome, int idade, double valorPremio) {
            this.nome = nome;
            this.idade = idade;
            this.valorPremio = valorPremio;
        }

        public void imprimir() {
            System.out.println(nome);
            System.out.println(idade);
            System.out.println(valorPremio);
        }

        public void calcularPremioApolice() {
            if (this.idade >= 18 && this.idade <= 25) {
                valorPremio+=(valorPremio*20)/100;
            }
            if (this.idade > 25 && this.idade < 26) {
                valorPremio+=(valorPremio*15)/10;
            }else{
                valorPremio+=(valorPremio*10)/100;
            }
        }

        public void oferecerDesconto(String cidade) {
            if (cidade.equals("Curitiba")){
                this.valorPremio-= valorPremio*0.20;
            }else if(cidade.equals("Rio de Janeiro")) {
                this.valorPremio-= valorPremio*0.15;
            }else if (cidade.equals("São Paulo")) {
                this.valorPremio-= valorPremio*0.10;

            }else if (cidade.equals("Belo Horizonte")) {
                valorPremio-= valorPremio*0.05;

            }

        }
    }
}
