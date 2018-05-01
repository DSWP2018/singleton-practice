package com.iteso.singleton;

import java.util.ArrayList;

/***
 * Clase del Singleton Cart.
 */
public final class Cart {

    /**Carrito unico de la instancia. */
    private static  Cart uniqueCart;
    /**Productos. */
    private ArrayList<Product> products;

    /**
     * getProducts.
     * @return ArrayList of Products.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * setProducts.
     * @param productos productos.
     */
    public void setProducts(final ArrayList<Product> productos) {
        this.products = productos;
    }

    /***
     * Agregar un producto.
     * @param product producto.
     */
    public void addProduct(final Product product) {
        products.add(product);
        return;
    }

    /***
     * Quitar un producto.
     * @param product producto.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
        return;
    }

    /**
     * Constructor privado.
     */
    private Cart() {
        products = new ArrayList<Product>();
    }

    /**
     * Obtener instancia unica del carrito.
     * @return carrito de compras.
     */
    public static Cart getUniqueCart() {
        if (uniqueCart == null) {
            uniqueCart = new Cart();
        }
        return uniqueCart;
    }

    /**
     * Imprimir la lista en el carrito.
     */
    public void listProductsInCart() {
        if (products.isEmpty()) {
            System.out.println("No tienes productos en el carrito");
        }
        for (Product product: products) {
            System.out.println(product.getName());
        }
        return;
    }

    /**
     * Obtener el total del valor del carrito.
     * @return total.
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * Limpiar el carrito.
     */
    public void cleanCart() {
        products.clear();
        uniqueCart = null;
        return;
    }
}
