package com.iteso.singleton;

/** */
public abstract class Product {
    /** */
    private String name;
    /** */
    private String description;
    /** */
    private double price;
    /** */
    private int stock;

    /**
     * @return String String
     */
    public final String getName() {
        return name;
    }

    /**
     * @param n n
     */
    public final void setName(final String n) {
        this.name = n;
    }

    /**
     * @return String String
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @param desc desc
     */
    public final void setDescription(final String desc) {
        this.description = desc;
    }

    /**
     * @return double double
     */
    public final double getPrice() {
        return price;
    }

    /**
     * @param pr pr
     */
    public final void setPrice(final double pr) {
        this.price = pr;
    }

    /**
     * @return int int
     */
    public final int getStock() {
        return stock;
    }

    /**
     * @param st st
     */
    public final void setStock(final int st) {
        this.stock = st;
    }

    /** */
    public final void addToCart() {
        Cart myCart = Cart.getCartInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
