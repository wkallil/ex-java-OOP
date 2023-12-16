package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = s.nextLine();
        System.out.print("Price: ");
        product.price = s.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = s.nextInt();
        System.out.println();

        System.out.print("Product data: " + product);
        System.out.println();
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = s.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.print("Updated data: " + product);
        System.out.println();
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = s.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.print("Updated data: " + product);


        s.close();
    }
}
