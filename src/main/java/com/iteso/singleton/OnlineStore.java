package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

public class OnlineStore {
    public static void main(String[] args){
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
