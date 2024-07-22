package ru.gb.vending.product.vending;

import ru.gb.vending.product.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public Product getByName(String nameProduct) {
        for (Product product : products) {
            if (product.getName().equals(nameProduct)) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product : products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
}
