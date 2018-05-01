package com.iteso.singleton;
/**
 Class Product.**/
public class Product {
    /**@var String.**/
    private String name;
    /**@VAR String.**/
    private String description;
    /**@var double.**/
    private double price;
    /**@var int.**/
    private int stock;
    /**@return String.**/
    public final String getName() {
        return name;
    }
    /**@param name1 hhh.**/
    public final void setName(final String name1) {
        this.name = name1;
    }
    /**@return String.**/
    public final String getDescription() {
        return description;
    }
    /**
     * @param description1 jhh.
     **/
    public final void setDescription(final String description1) {
        this.description = description1;
    }
    /**@return double.**/
    public final double getPrice() {
        return price;
    }
    /**
     * @param price1 jjjj.
     * **/
    public final void setPrice(final double price1) {
        this.price = price1;
    }
    /**@return int.**/
    public final int getStock() {
        return stock;
    }
    /**
     * @param stock1 hhh.
     * **/
    public final void setStock(final int stock1) {
        this.stock = stock1;
    }
    /**@return Cart.**/
    public final Cart addToCart() {
        Cart mycart = null;
        mycart.getInstance();
        mycart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return mycart;
    }
}
