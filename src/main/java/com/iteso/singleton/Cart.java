package com.iteso.singleton;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * @author Yo
 * @version 0.0
 */
public final class Cart {
    /**
     * La lista de los productos.
     */
    private final ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Es la referencia al singleton.
     */
    private static Cart uniqueInstance;

    /**
     * Constructor privado para el singleton.
     */
    private Cart() {

    }

    /**
     * Obtiene la instancia singleton de la clase.
     * @return la instancia singleton.
     */
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }

    /**
     * Agrega el producto.
     * @param product es el p. a agregar
     */
    public void addProduct(final Product product) {
        products.add(product);
    }

    /**
     * Remueve el producto.
     * @param product es el p. a remover.
     */
    public void removeProduct(final Product product) {
        products.remove(product);
    }

    /**
     * Imprime en consola la cuenta.
     */
    public void listProductsInCart() {
        NumberFormat currencyFormatter =
                NumberFormat.getCurrencyInstance(Locale.getDefault());
        for (Product product: products) {
            System.out.printf("Producto: %s\tPrecio: %s\n", product.getName(),
                    currencyFormatter.format(product.getPrice()));
        }
        System.out.printf("****Total: %s****\n",
                currencyFormatter.format(getCartTotal()));
    }

    /**
     * Calcula el total del carrito.
     * @return El total.
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
     * Elimina la instancia singleton de esta instancia.
     */
    public void clear() {
        uniqueInstance = null;
    }

    /**
     * Hace que se calle el checkstyle.
     * @return la lista de productos.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }
}
