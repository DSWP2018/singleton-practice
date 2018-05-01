package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * OnlineStore class.
 */
public final class OnlineStore {

    /**
     * Constructor privado.
     */
    private OnlineStore() {

    }

    /**
     * Main.
     * @param args argumentos.
     */
    public static void main(final String[] args) {
        Cart myCart = Cart.getUniqueCart();
        Lechuguilla lechuguilla = new Lechuguilla();
        CocaCola cocaCola = new CocaCola();
        Monster monster = new Monster();
        myCart.listProductsInCart();
        cocaCola.addToCart();
        myCart.listProductsInCart();
        lechuguilla.addToCart();
        myCart.listProductsInCart();
        monster.addToCart();
        myCart.listProductsInCart();
        myCart.cleanCart();
        myCart.listProductsInCart();
    }
}
