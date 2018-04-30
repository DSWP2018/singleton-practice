package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 *
 */
public class OnlineStore {
    /**
     *
     * @param args jiji.
     */
    public static void main(String... args){
        Cart cart = Cart.getInstance();

        CocaCola coquita = new CocaCola();
        Lechuguilla lechuguilla = new Lechuguilla();
        Monster monster = new Monster();

        coquita.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();

        cart.listProductsInCart();
        System.out.println("Total Carrito " + cart.getCartTotal());

    }
}
