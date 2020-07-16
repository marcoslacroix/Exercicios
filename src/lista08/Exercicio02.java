package lista08;

// O Léo acabou de nascer e seus pais gostariam de fazer uma poupança para o futuro dele. Para isso, gostariam
//de ter uma simulação do valor que o Léo terá disponível quando fizer 18 anos.
//Considere que irão depositar R$25 todos os meses, desde o seu nascimento até os 18 anos, e que a
//remuneração mensal é fixa em 0,35% a.m. (ao mês).

public class Exercicio02 {

    public static void main(String[] args) {

        long contaLeo = 0;
        for (int i = 0; i < 18; i++) {
                for (int j = 0; j < 12; j++) {
                    if (contaLeo > 0) {
                        contaLeo += contaLeo * 0.35;
                        contaLeo += 25.00;
                    }else {
                        contaLeo+= 25.00;
                    }
                }
        }
        System.out.println(contaLeo);


    }
}
