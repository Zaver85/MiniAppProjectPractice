package ru.gb.vending.product;

import ru.gb.vending.product.product.Bottle;
import ru.gb.vending.product.product.Product;
import ru.gb.vending.product.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("coca-cola", 110, 2);
        Product product3 = new Product("lays", 80);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);


    }
}