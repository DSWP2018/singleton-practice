package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

public class OnlineStore {

    public static void main(String args){
        Cart cart = Cart.getInstance();

        CocaCola coca = new CocaCola();
        Lechuguilla lechuguilla = new Lechuguilla();
        Monster monster = new Monster();

        coca.addToCart();
        lechuguilla.addToCart();
        monster.addToCart();

        cart.listProductsInCart();
        System.out.println("Total: " + cart.getCartTotal());

    }
}