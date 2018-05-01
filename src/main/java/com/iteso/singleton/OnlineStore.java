package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

public class OnlineStore {

    public static void main(String[] args){
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
        System.out.println("\nListado de productos después de limpiar el carrito:");
        cart.listProductsInCart();
    }

}
