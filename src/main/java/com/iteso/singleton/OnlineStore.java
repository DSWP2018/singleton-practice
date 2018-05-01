package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Clase principal.
 */
public final class OnlineStore {
    /**
     * Constructor privado que al parecer necesito.
     */
    private OnlineStore() {

    }

    /**
     * main.
     * @param args /shrug
     */
    public static void main(final String[] args) {

        Cart myCart = Cart.getInstance();
        CocaCola cocaCola = new CocaCola();
        CocaCola cocaCola1 = new CocaCola();
        CocaCola cocaCola2 = new CocaCola();
        Lechuguilla lechuguilla = new Lechuguilla();
        Monster monster = new Monster();

        cocaCola.addToCart();
        cocaCola1.addToCart();
        cocaCola2.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();
        monster.addToCart();

        double total = myCart.getCartTotal();
        System.out.println(total);
        myCart.listProductsInCart();

        myCart.removeProduct(cocaCola2);
        total = myCart.getCartTotal();
        System.out.println(total);
        myCart.listProductsInCart();

        myCart.clearCart();

    }

}
