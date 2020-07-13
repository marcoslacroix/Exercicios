package lista02;

// Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem
// , cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos construtores,
// getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTeste devem ser criados dois
// objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto. O programa deverá informar também qual
// das duas lâmpadas possui maior potência e também qual das lâmpadas é a mais cara

public class Exercicio02 {

    public static void main(String[] args) {
        Lampada l1 = new Lampada(12, "Amarela", "marca1", 15.50, 15, null);
        Lampada l2 = new Lampada(20, "Verde", "marca2", 22.50, 20, null);

        if (l1.getPotencia() > l2.getPotencia()){
            System.out.println(l1 + " tem mais potência");
        }else{
            System.out.println(l2 + " tem mais potência");
        }
        if (l1.getPreco() > l2.getPreco()) {
            System.out.println(l1 + " é mais cara");
        }else {
            System.out.println(l2 + " é mais cara");
        }

    }


    public static class Lampada {

        double voltagem;
        String cor;
        String marca;
        double preco;
        double potencia;
        boolean status;

        public Lampada(double voltagem, String cor, String marca, double preco, double potencia, Boolean status) {
            this.voltagem = voltagem;
            this.cor = cor;
            this.marca = marca;
            this.preco = preco;
            this.potencia = potencia;
            this.status = status;
        }

        public double getVoltagem() {
            return voltagem;
        }

        public void setVoltagem(double voltagem) {
            this.voltagem = voltagem;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public double getPotencia() {
            return potencia;
        }

        public void setPotencia(double potencia) {
            this.potencia = potencia;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public void ascender() {
            this.status = true;
        }

        public void apagar() {
            this.status = false;
        }

        @Override
        public String toString() {
            return "Lampada{" +
                    "voltagem=" + voltagem +
                    ", cor='" + cor + '\'' +
                    ", marca='" + marca + '\'' +
                    ", preco=" + preco +
                    ", potencia=" + potencia +
                    ", status=" + status +
                    '}';
        }
    }
}
