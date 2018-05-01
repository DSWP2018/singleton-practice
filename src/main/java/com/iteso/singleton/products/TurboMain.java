package com.iteso.singleton.products;

import com.iteso.singleton.Cart;
import com.iteso.singleton.Product;
/**
 * main class.
 * */
final class TurboMain {
    /**
     * default constructor.
     * */
    private TurboMain() {
    }
    /**
     * golden taco price.
     * */
    public static final double GOLDENPRICE = 91222.123;
    /**
     * meat taco price.
     * */
    public static final double MEATPRICE = 22.199;
    /**
     * meat taco stock.
     * */
    public static final int MEATSTOCK = 10;
    /**
     * golden taco stock.
     * */
    public static final int GOLDENSTOCK = 10;
    /**
     * @param args parametro.
     * */
    public static void main(final String[] args) {
        Product product = new Product();
        Product product2 = new Product();
        CocaCola cocacola = new CocaCola();
        Monster monster = new Monster();
        Lechuguilla lechuguilla = new Lechuguilla();

        Cart cart = Cart.getInstance();

        product.setPrice(GOLDENPRICE);
        product.setDescription("Taco de oro de 24K");
        product.setName("Golden Taco");
        product.setStock(GOLDENSTOCK);

        product2.setPrice(MEATPRICE);
        product2.setDescription("Taco de arrachera");
        product2.setName("Arrachera Taco");
        product2.setStock(MEATSTOCK);


        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(cocacola);
        cart.addProduct(monster);
        cart.addProduct(lechuguilla);

        cart.listProductsInCart();
        cart.getCartTotal();
    }
}
