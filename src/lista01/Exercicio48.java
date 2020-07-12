package lista01;

// Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que tenha idade
// entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de beleza.
// Foram inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações foram
// armazenadas em 2 vetores distintos. Faça um programa para imprima o vetor que contém os nomes das candidatas
// aptas a concorrer a uma vaga para a campanha milionária.

import java.util.ArrayList;

public class Exercicio48 {

    public static void main(String[] args) {

        String[] nomesVector = {"Maria", "Julia", "Ana", "Clara", "Roberta", "Carolina", "Carol", "Michele", "Micaela",
                "Joana", "Julia", "Janeta", "Cris", "Ana", "Maria", "Luia", "Joice", "Sona", "Clarice", "Claudia"};
        int[] idadeVector = {15, 17, 26, 17, 26, 21, 25, 17, 14, 18, 17, 19, 16, 18, 17, 18, 19, 18, 19, 18};


        int tamanhoVector = idadeVector.length;
        for (int i=0; i<tamanhoVector; i++){
            if (idadeVector[i] >= 18 && idadeVector[i] <= 20) {
                System.out.println(nomesVector[i]);
            }
        }
    }
}
