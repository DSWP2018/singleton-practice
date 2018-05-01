package com.iteso.singleton;


import java.util.ArrayList;

/**
 * clase cart.
 */
public final class Cart {
    /**
     * productos.
     */
    private final ArrayList<Product> products = new ArrayList<Product>();

    /**
     * asdfasdf.
     * @return asdfasdf
     */
    public ArrayList<Product> getProducts() {
        return products;
    }


    /**
     * asdfasdf.
     * @param instancep asdfasdf.
     */
    public static void setInstance(final Cart instancep) {
        Cart.instance = instancep;
    }

    /**
     * instancia.
     */
    private static Cart instance;

    /**
     * instancia.
     * @return instancia.
     */
    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    /**
     * agregar.
     * @param productp asfdz.
     */
    public void addProduct(final Product productp) {
        products.add(productp);
    }

    /**
     *
     * @param productp asfdasf.
     */
    public void removeProduct(final Product productp) {
        products.remove(productp);
    }

    /**
     * asdfasdf.
     */
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    /**
     * asdfasdf.
     * @return asdfaf.
     */
    public double getCartTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * asdfaf.
     */
    private Cart() {

    }

    /**
     * asdfasdf.
     */
    public void clearCart() {
        products.clear();
        instance = null;
    }

}
