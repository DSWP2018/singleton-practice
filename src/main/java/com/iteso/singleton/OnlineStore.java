package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Clase OnlineStore que simula una tienda en linea.
 * donde puedes comprar productos añadiendolos a tu carro.
 */
public final class OnlineStore {
    /**
     * El carro al que vas a añadir tus productos.
     */
    private static Cart cart;
    /**
     * Productos disponibles.
     */
    private static Product coke, lechuguilla, monster;

    /**
     * Constructor privado de la tienda en linea.
     */
    private OnlineStore() {

    }

    /**
     * Método main para probar la funcionalidad.
     *
     * @param args .
     */
    public static void main(final String[] args) {
        cart = Cart.getInstance();
        coke = new CocaCola();
        lechuguilla = new Lechuguilla();
        monster = new Monster();

        coke.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();

        cart.listProductsInCart();
    }

}
