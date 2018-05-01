package com.iteso.singleton;
/**
 Class OnlineStore.**/
public final class OnlineStore {
    /**@Constructor.**/
    private OnlineStore() {

    }
    /**@param args h.
     * **/
    public static void main(final String[] args) {
        Cart cart;
        CocaCola c = new CocaCola();
        Lechuguilla l = new Lechuguilla();
        Monster m = new Monster();
        cart = Cart.getInstance();
        cart.addProduct(c);
        cart.addProduct(l);
        cart.addProduct(m);
        cart.listProductsInCart();
        System.out.println(cart.getCartTotal());
        cart.removeProduct(c);
        cart.listProductsInCart();
    }
}
