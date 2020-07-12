package application;

import java.util.Scanner;

public class Exercicie12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        p1.setName(sc.nextLine());
        System.out.print("Price: ");
        p1.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        p1.setQuantity(sc.nextInt());

        System.out.println(p1.toString());
        System.out.print("Enter the number of products to be added in stock: ");
        p1.addItem(sc.nextInt());
        System.out.print("Enter the number of products to remove in stock: ");
        p1.removeItem(sc.nextInt());

    }

    public static class Product {

        private String name;
        private double price;
        private int quantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double removeItem(double product) {
            double aux = this.quantity -= product;
            System.out.println("Updated data: " + this.name + ", " + this.quantity + " units, total: " + this.quantity * this.price);
            return aux;

        }
        public double addItem(double product) {
            double aux = this.quantity += product;
            System.out.println("Updated data: " + this.name + ", " + this.quantity + " units, total: " + this.quantity * this.price);
            return aux;

        }

        @Override
        public String toString() {
            return "Product data: "
                    + this.name
                    + ", $ "
                    + this.price
                    + ", "
                    + this.quantity
                    + " units, total: $ "
                    + this.price * this.quantity;
        }
    }
}
