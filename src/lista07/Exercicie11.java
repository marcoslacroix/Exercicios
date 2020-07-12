package application;

import java.util.Scanner;

public class Exercicie11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println("Área do triangulo X: " + x.area());
        System.out.println("Área do triangulo Y: " + y.area());
        if (x.area() > y.area()) {
            System.out.println("A área maior é: A" );
        }else{
            System.out.println("A área maior é: Y");
        }
    }

    public static class Triangle{

        public double a;
        public double b;
        public double c;

        public double area() {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }


    }
}
