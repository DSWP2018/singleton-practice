package com.iteso.singleton;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

public class OnlineStore {

    public static void main(String[] args) {

        //Instancias de productos
        CocaCola cocacola = new CocaCola();
        Lechuguilla lechuguilla = new Lechuguilla();
        Monster monster = new Monster();
        //Instancia de Cart
        Cart cart = Cart.getCart();
        //Agregar productos a Cart
        cart.addProduct(cocacola);
        cart.addProduct(lechuguilla);
        cart.addProduct(monster);
        //Listar productos de Cart
        cart.listProductsInCart();
        //Arrojar el total del Cart
        System.out.println("Total del carrito es: " + cart.getCartTotal());
        //Limpiar Cart
       cart.clear();

    }

}
