package lista08;

// Implemente um algoritmo para gerar a canção "Um elefante incomoda muita gente".
// letra https://www.letras.mus.br/galinha-pintadinha/1785852/


public class Exercicio01 {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            if (i == 1) {
                System.out.println(i + " elefante incomoda muita gente");
                i++;
                System.out.println(i + " elefantes " + incomodam(i) + "muito mais");
            }else if(i == 10 || i < 10){
                System.out.println(i + " elefantes incomodam muita gente");
                i++;
                System.out.println(i + " elefantes " + incomodam(i) + "muito mais");
            }
        }
        for (int i = 10; i>0; i--) {
            if (i == 2) {
                System.out.println(i + " elefantes incomodam muita gente");
                i--;
                System.out.println(i + " elefante incomoda muito menos");
            }else {
                System.out.println(i + " elefantes incomodam muita gente");
                i--;
                System.out.println(i + " elefantes " + incomodam(i) + "muito menos");
            }
        }
    }
    public static String incomodam(int vezesIncomodam){
        String incomodam = "";
        String fraseIncomodam = "incomodam ";
        for (int i = 0; i < vezesIncomodam; i++) {
            incomodam += fraseIncomodam;
        }
        return incomodam;
    }

}
