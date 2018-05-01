package com.iteso.singleton;

import java.util.ArrayList;

public final class Cart {

    private ArrayList<Product> products = new ArrayList<Product>();
    private static Cart uniqueInstance;
    private Cart() {
    }

    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**
     *
     * @param product add product to arraylist
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     *
     * @param product remove from arraylist
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     *
     * @return total amount
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearProducts() {
        products.clear();
        uniqueInstance = null;
    }
}
