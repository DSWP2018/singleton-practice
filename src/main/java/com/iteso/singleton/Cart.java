package com.iteso.singleton;

import java.util.ArrayList;

public class Cart {

    private static Cart uniqueInstance = new Cart();

    private Cart() { }

    public static Cart getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }


    ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    public double getCartTotal() {
        double total = 0;
        for (Product product :
                products) {
            total += product.getPrice();
        }
        return total;
    }


    public void clear() {
        products.clear();
        uniqueInstance = null;
    }

}
