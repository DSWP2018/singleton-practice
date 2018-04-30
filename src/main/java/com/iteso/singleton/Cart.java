package com.iteso.singleton;

import java.util.ArrayList;

public class Cart {
    private static  Cart uniqueCart;
    ArrayList<Product> products;


    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    private Cart(){
        products = new ArrayList<Product>();
    }

    public static Cart getUniqueCart(){
        if (uniqueCart == null){
            return uniqueCart = new Cart();
        }else
            return uniqueCart;
    }

    public void listProductsInCart(){
        if(products.isEmpty())
            System.out.println("No tienes productos en el carrito");
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    public double getCartTotal(){
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void cleanCart(){
        products.clear();
        uniqueCart = null;
        return;
    }
}
