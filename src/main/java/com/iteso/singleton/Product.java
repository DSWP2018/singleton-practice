package com.iteso.singleton;

public class Product {

    private String name;
    private String description;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void addToCart(){
        Cart myCart = Cart.getUniqueInstance();
        myCart.addProduct(this);
        //myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);

    }







}
