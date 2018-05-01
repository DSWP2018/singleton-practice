package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/**
 * Clase OnlineStore que nos permite darle funcionalidad al Cart.
 */
public final class OnlineStore {

    /**Constructor de la clase.*/
    private OnlineStore() {

    }

    /**Método main.
     * @param args necesario para el método.
     */
    public static void main(final String[] args) {
        Cart cart = Cart.getInstance();
        CocaCola coca = new CocaCola();
        coca.addToCart();
        Lechuguilla lechuguilla = new Lechuguilla();
        lechuguilla.addToCart();
        Monster monster = new Monster();
        monster.addToCart();
        System.out.println("Listado de productos en el carrito:\n");
        cart.listProductsInCart();
        System.out.println("Precio total: "  + cart.getCartTotal() + "\n");
        cart.clearCart();
        System.out.println("\nListado de productos después de "
                + "limpiar el carrito:");
        cart.listProductsInCart();
    }

}
