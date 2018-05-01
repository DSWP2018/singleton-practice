package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Singleton por compra.
 */
public final class Cart {
    /**
     * Productos en el carro.
     */
    private ArrayList<Product> products;
    /**
     * Singleton.
     */
    private static Cart uniqueInstance;

    /**
     * Constructor.
     */
    private Cart() {
        products = new ArrayList<Product>();
    }

    /**
     * Devuelve la instancia.
     * @return carrito.
     */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**
     * Getter productos.
     * @return productos.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Agrega un producto al caror. No usado.
     * @param product Producto a agregar.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Saca un producto del carro.
     * @param product Producto a sacar.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Imprime los productos.
     */
    public void listProductsInCart() {
        if (products == null) {
            System.out.println("Vacío\n");
        }
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     * Devuelve el total de la compra.
     * @return total.
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
     * Limpia la instancia.
     */
    public void clearCart() {
        this.uniqueInstance = null;
    }
}
