package com.iteso.singleton;

import java.util.ArrayList;
/**
 Class Cart.**/
public final class Cart {
    /**
     @VAR products.**/
    private ArrayList<Product> products = new ArrayList<Product>();
    /**
     @VAR Cart.**/
    private static Cart uniqueInstance;
    /**
     Constructor.**/
    private Cart() {
        products = new ArrayList();
    }
    /**
     @return Cart.**/
    public static Cart getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cart();
        }
        return uniqueInstance;
    }
    /**
     clear.**/
    public static void clear() {
        uniqueInstance = null;
    }

    /**
     @param product add.**/
    public void addProduct(final Product product) {
        products.add(product);
    }
    /**
     @param product g.
     **/
    public void removeProduct(final Product product) {
        products.remove(product);
    }
    /**
     list.**/
    public void listProductsInCart() {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    /**
     @return double.**/
    public double getCartTotal() {
        double total = 0;
        for (Product product
                :
                products) {
            total += product.getPrice();
        }
        return total;
    }
}
