package com.iteso.singleton;

import java.util.ArrayList;

/**
 * Clase que realiza actividades de un carro de supermercado.
 */
public final class Cart {
    /**
     * Lista de productos que corresponden a este carro.
     */
    private ArrayList<Product> products = new ArrayList<Product>();
    /**
     * Instancia unica del carro porque implementa singleton.
     */
    private static Cart uniqueInstance;

    /**
     * Método para obtener la lista de productos de este carro.
     * @return products.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Constructor privado de Carro.
     */
    private Cart() {

    }

    /**
     * Método para añadir productos al carro.
     * @param product producto a añadir.
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Método para remover un producto del carro.
     * @param product producto a remover.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Método para imprimir la lista de los productos que hay en el carro.
     */
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     * Método para obtener el total de precio del carro.
     * @return precio total.
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
     * Método para obtener la instancia única (singleton) del carro.
     * @return uniqueInstance.
     */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**
     * Método para limpiar el carro.
     */
    public static void clearCart() {
        uniqueInstance = null;
    }
}
