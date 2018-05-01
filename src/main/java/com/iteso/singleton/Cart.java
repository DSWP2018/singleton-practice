package com.iteso.singleton;

import java.util.ArrayList;
/**
 * Cart class singleton.
 * */
public final class Cart {
    /**
     * Arraylist of products.
     * */
    private ArrayList<Product> products = new ArrayList<Product>();
    /**
     * create an object of cart.
     * */
    private static Cart instance = new Cart();
    /**
     * create an object of cart.
     * */
    private static Cart thisInstance = null;
    /**
     * Get the only object available.
     * @return instance
     * */
    public static Cart getInstance() {
        return instance;
    }
    /**
     * create an object of cart.
     * */
    public static void resetInstance() {
        thisInstance = new Cart();
    }
    /**
     * make the constructor private so that this.
     * class cannot be instantiated.
     * */
    private Cart() {
    }
    /**
     * @param product parametro.
     * */
    public void addProduct(final Product product) {
        products.add(product);
    }
    /**
     * @param rProduct parametro.
     * */
    public void removeProduct(final Product rProduct) {
        products.remove(rProduct);
    }
    /**
     * show products in cart.
     * */
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    /**
     * @return total
     * */
    public double getCartTotal() {
        double total = 0;
        for (Product product
                :products) {
            total += product.getPrice();
        }
        return total;
    }
}
