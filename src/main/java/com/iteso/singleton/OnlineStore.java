package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

public class OnlineStore {
    public static void main(String[] args) {
        Cart cart = Cart.getInstance();
        //Product cereal = new Product();
       /* cereal.setDescription("caja de cereal en presentación de 840g");
        cereal.setName("caja de cereal");
        cereal.setPrice(20);
        cereal.setStock(5);*/
        Lechuguilla lechuguilla =  new Lechuguilla();
        CocaCola cocaCola = new CocaCola();
        Monster monster = new Monster();
        lechuguilla.addToCart();
        cart.listProductsInCart();
        cocaCola.addToCart();
        cart.listProductsInCart();
        monster.addToCart();
        cart.listProductsInCart();
        System.out.println(cart.getCartTotal());
        cart.removeProduct(lechuguilla);
        cart.listProductsInCart();
        System.out.println(cart.getCartTotal());

    }
}
