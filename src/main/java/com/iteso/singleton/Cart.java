package com.iteso.singleton;

import java.util.ArrayList;

/**Clase Cart singleton. */
public final class Cart {
    /**Declaracion de varibales. */
    private static  ArrayList<Product> products; /**Lista de productos. */
    private static  Cart uniqueInstance; /**Instancia singleton de cart. */

    /**Constructor de cart. */
    private Cart() {
        products = new ArrayList<Product>();
    }
    /**Funcion para retornar la instancia del singelton. */
    /**@return cart. */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }
    /**Funcion para eliminar la instancia. */
    private static void eliminateInstance() {
        products.clear();
        uniqueInstance = null;
    }
    /**Funcion para añadir un producto al carro. */
    /**@param product productor a agregar. */
    public void addProduct(final Product product) {
        products.add(product);
    }
    /**Funcion para remover el producto del carrito. */
    /**@param product producto a remover. */
    public void removeProduct(final Product product) {
        products.remove(product);
    }
    /**Funcion para obtener la lista de productos en el carro. */
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    /**@return total que es el total de la cuenta del carro. */
    public double getCartTotal() {
        double total = 0;
        for (Product product
                : products) {
            total += product.getPrice();
        }
        return total;
    }
}
