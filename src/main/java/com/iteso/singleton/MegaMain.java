package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * @author Yo
 * @version 0.0
 */
public final class MegaMain {
    /**
     * Es el punto de entrada para probar esta práctica.
     * @param args somos todos.
     */
    public static void main(final String[]args) {
        Cart miCarrito = Cart.getInstance();

        Lechuguilla lechuguilla = new Lechuguilla();
        CocaCola coca = new CocaCola();
        Monster monster = new Monster();

        lechuguilla.addToCart();
        coca.addToCart();
        monster.addToCart();

        miCarrito.listProductsInCart();

    }

    /**
     * Lo que ya dije abajo.
     */
    private MegaMain() {
        //Hace que se calle el checkstyle
    }
}
