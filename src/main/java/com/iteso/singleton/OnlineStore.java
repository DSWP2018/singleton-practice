package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * onlien store.
 */
public class OnlineStore {

    /**
     * main.
     * @param arg asdf
     */
     public static void main(final String[] arg) {
         CocaCola cocaCola = new CocaCola();
         cocaCola.addToCart();
         Monster monster = new Monster();
         monster.addToCart();
         Lechuguilla lechuguilla = new Lechuguilla();
         lechuguilla.addToCart();

         Cart cart = Cart.getInstance();
         cart.listProductsInCart();
     }

    /**
     * metodo tonto para checkstyle.
     */
    public void something() {

    }
}
