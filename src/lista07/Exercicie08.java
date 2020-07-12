package application;

public class Exercicie08 {
    public static void main(String[] args) {
        //8. Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e
        //que a população do país B seja, aproximadamente, de 200.000 habitantes com uma taxa de crescimento anual de 1,5%.
        //Fazer um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
        //ou iguale a população do país B, mantidas essas taxas de crescimento.

        float primeiroPais = 80000;
        float segundoPais = 200000;
        int i = 0;

        while (primeiroPais < segundoPais) {
            primeiroPais = (float) (primeiroPais + primeiroPais * 0.03);
            segundoPais = (float) (segundoPais + segundoPais * 0.015);
            i++;
        }
        System.out.println("O primeiro pais ficará igual o segundo pais em " + i +  " anos.");

    }
}
