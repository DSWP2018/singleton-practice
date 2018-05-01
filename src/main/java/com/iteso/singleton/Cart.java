package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Cart class.
 */
public final class Cart {
    /**
     * Instance of cart.
     */
    private static Cart myCart;

    /**
     * List of products.
     */
    private ArrayList<Product> products;

    /**
     * Constructor for Cart.
     */
    private Cart() {
        products = new ArrayList<Product>();
    }

    /**
     *
     * @return Unique cart instance.
     */
    public static Cart getInstance() {
        if (myCart == null) {
            myCart = new Cart();
        }

        return myCart;
    }

    /**
     * Deletes cart instance.
     */
    public void cleanInstance() {
        products.clear();
        myCart = null;
    }

    /**
     * Adds a product to cart.
     * @param product Producto to be added.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Removes a product from cart.
     * @param product Producto to be deleted.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Prints a the list of products.
     */
    public void listProductsInCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        for (Product product: products) {
            System.out.println(product.getName());
        }

    }

    /**
     * Prints the total price.
     * @return Total price.
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
