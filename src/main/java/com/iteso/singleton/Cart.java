package com.iteso.singleton;


import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products;
    private static Cart uniqueInstance;

    private Cart(){
    }

    public static Cart getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Cart();
        return uniqueInstance;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    public void clearProducts(){
        products.clear();
        uniqueInstance = null;
    }


    public void listProductsInCart(){
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }
    public double getCartTotal(){
        double total = 0;
        for (Product product :
                products) {
            total += product.getPrice();
        }
        return total;
    }
}
