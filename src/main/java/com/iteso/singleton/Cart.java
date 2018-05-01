package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Clase Cart implementada como Singleton.
 */
public final class Cart {
    /**Lista de productos en el carrito.*/
    private ArrayList<Product> products;
    /**Instancia única.*/
    private static Cart uniqueInstance = null;

    /**Constructor de la clase.*/
    private Cart() {
        products = new ArrayList<Product>();
    }

    /**Método para obtener la instancia única de la clase.
     * @return un objeto tipo Cart.
     */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**Método para limpiar el carrito.*/
    public void clearCart() {
        products.clear();
        uniqueInstance = null;
    }

    /**
     * Método para añadir un producto al carrito.
     * @param product para enviarle un producto al método.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Método para eliminar un producto del carrito.
     * @param product para enviarle un producto al método.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**Método para obtener la lista de productos en el carrito.*/
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     * Método para obtener el precio total de los productos
     * que contiene el carrito.
     * @return un número tipo double para mostrar el precio.
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
