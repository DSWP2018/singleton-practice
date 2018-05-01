package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Clase de prueba.
 */
public final class OnlineStore {
    /**
     * Variable de carro.
     */
    private static Cart cart;
    /**
     * Variable de producto.
     */
    private static Product coca, lechuguilla, monster;

    /**
     * Constructor privado.
     */
    private OnlineStore() {

    }

    /**
     * Ejecución de prueba.
     * @param args variable esperada.
     */
    public static void main(final String[] args) {
        cart = Cart.getInstance();
        coca = new CocaCola();
        lechuguilla = new Lechuguilla();
        monster = new Monster();

        coca.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();

        cart.listProductsInCart();

    }
}
