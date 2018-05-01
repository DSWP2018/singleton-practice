package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Class Online Store.
 */
public final class OnlineStore {

    /**
     *Constructor.
     */
    private OnlineStore() {

    }

    /**
     * Shopping car.
     */
    private static Cart cart = null;

    /**
     * @param args usual.
     */
    public static void main(final String[] args) {

        cart = Cart.getCart();
        cart.addProduct(new CocaCola());
        cart.addProduct(new Lechuguilla());
        cart.addProduct(new Monster());

        //See products.
        cart.listProductsInCart();

        //See total.
        System.out.println(cart.getCartTotal());

        //Clear.
        cart.clear();

        //See products.
        cart.listProductsInCart();

        //See total.
        System.out.println(cart.getCartTotal());
    }
}
