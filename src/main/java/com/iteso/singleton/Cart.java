package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Clase cart.
 */
public final class Cart {
    /**
     * Instancia del Cart.
     */
    private static Cart uniqueInstance;
    /**
     * ArrayList de Products.
     */
    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Agrega productos al carro.
     * @param product el producto a agregar.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Remueve un producto del carrito.
     * @param product producto a remover.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Imprime la lista de productos en el carrito.
     */
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     * Nos da el total del valor.
     * @return el total del carrito.
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
     * Constructor privado.
     */
    private Cart() {

    }

    /**
     * Para obtener la instancia.
     * @return instancia del carro.
     */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**
     * Para eliminar la instancia.
     */
    public void clear() {
        uniqueInstance = null;
    }
}
