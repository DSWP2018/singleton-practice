package com.iteso.singleton;

import java.util.ArrayList;
import java.util.List;

import com.iteso.singleton.products.CocaCola;
import com.iteso.singleton.products.Lechuguilla;
import com.iteso.singleton.products.Monster;

/** */
public final class Store {
    /**
     * @param args args
     */
    public static void main(final String[] args) {
        // Crear productos
        List<Product> productsToSell = new ArrayList<>();
        productsToSell.add(new CocaCola());
        productsToSell.add(new Monster());
        productsToSell.add(new Lechuguilla());

        // Agregar Productos al carrito
        System.out.println("Productos del carrito");
        productsToSell.forEach(Product::addToCart);

        // Ver los productos en el carrito
        Cart cart = Cart.getCartInstance();
        cart.listProductsInCart();

        // Obtener el total
        System.out.println("Total del carrito");
        System.out.println(cart.getCartTotal());

        // Limpiar el carrito
        Cart.clearInstance();

        // intentar usar el carrito, obviamente va a tronar
        cart = Cart.getCartInstance();
        System.out.println("Productos tras limpiar carrito:");
        cart.listProductsInCart();
        System.out.println("No hay productos en carrito ya");
    }

    /** */
    private Store() {

    }
}
