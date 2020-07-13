package lista02;

// Implementar uma classe Caneta que deve possuir como características marca, cor e tamanho. Nesta classe devem ser
// implementados os métodos construtores, getters, setters e toString. Em uma outra classe chamada CanetaTeste deverá
// ser criado um objeto do tipo Caneta, atribuir valores e exibir os dados deste objeto

public class Exercicio01 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", "Verde", 1.2);
        System.out.println(c1);


    }
    public static class Caneta {

        String marca;
        String cor;
        double tamanho;

        public Caneta(String marca, String cor, double tamanho) {
            this.marca = marca;
            this.cor = cor;
            this.tamanho = tamanho;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public double getTamanho() {
            return tamanho;
        }

        public void setTamanho(double tamanho) {
            this.tamanho = tamanho;
        }

        @Override
        public String toString() {
            return "Caneta{" +
                    "marca='" + marca + '\'' +
                    ", cor='" + cor + '\'' +
                    ", tamanho=" + tamanho +
                    '}';
        }
    }
}
