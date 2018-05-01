package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Singleton Cart.
 * */

public final class Cart {

    /**
     * Private instance of a Cart.
     */
    private static Cart cart = null;

    /**
     * List of products.
     */
    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Private constructor of a Cart.
     */
    private Cart() {

    }

    /**
     * @return a instance of Cart.
     */
    public static Cart getCart() {

        if (cart == null) {
            cart = new Cart();
        }

        return cart;
    }

    /**
     * @param product new product to add.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * @param product to remove.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Print list of products within the car.
     */
    public void listProductsInCart() {
        for (Product product
                : products) {
            System.out.println(product.getName());
        }
    }

    /**
     * @return value in pesos.
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product
                : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * Clear all products.
     */
    public void clear() {
        products.clear();
    }

}
