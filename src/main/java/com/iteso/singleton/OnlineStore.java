package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Turbo main for test.
 */
public final class OnlineStore {

    /**
     * Private constructor.
     */
    private OnlineStore() {

    }

    /**
     * Test.
     * @param args args
     */
    public static void main(final String[] args) {
        Product coca = new CocaCola();
        Product lechuguilla = new Lechuguilla();
        Product monster = new Monster();

        coca.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();

        Cart myCart = Cart.getInstance();

        myCart.listProductsInCart();
        System.out.println(myCart.getCartTotal());

        myCart.cleanInstance();
        myCart.listProductsInCart();
    }
}
