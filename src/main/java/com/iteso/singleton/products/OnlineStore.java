package com.iteso.singleton.products;

import com.iteso.singleton.Cart;

public class OnlineStore {
    public static void main(String[] args){

        Cart.getInstance().clearCart();
        CocaCola coke = new CocaCola();
        coke.addToCart();
        Lechuguilla lechu = new Lechuguilla();
        lechu.addToCart();
        Monster monst = new Monster();
        monst.addToCart();
        Cart.getInstance().listProductsInCart();
    }
}
