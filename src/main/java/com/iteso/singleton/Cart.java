package com.iteso.singleton;

import java.util.ArrayList;

/** */
public final class Cart {
    /** */
    private static Cart theOneAndOnlyCart;
    /** */
    private ArrayList<Product> products = new ArrayList<Product>();

    /** */
    private Cart() {

    }

    /**
     * @return Cart cart
     */
    public static Cart getCartInstance() {
        if (theOneAndOnlyCart == null) {
            theOneAndOnlyCart = new Cart();
        }
        return theOneAndOnlyCart;
    }

    /** */
    public static void clearInstance() {
        theOneAndOnlyCart = null;
    }

    /**
     * @param product product
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * @param product product
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /** */
    public void listProductsInCart() {
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }

    /**
     * @return double double
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param pr final the products to set
     */
    public void setProducts(final ArrayList<Product> pr) {
        this.products = pr;
    }
}
