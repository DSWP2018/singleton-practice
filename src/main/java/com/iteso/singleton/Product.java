package com.iteso.singleton;
/**
 *
 * */
public class Product {
    /**
     * name.
     * */
    private String name;
    /**
     * description.
     * */
    private String description;
    /**
     * price.
     * */
    private double price;
    /**
     * stock.
     * */
    private int stock;
    /**
     * @return name
     * */
    public final String getName() {
        return name;
    }
    /**
     * @param sName parametro.
     * */
    public final void setName(final String sName) {
        this.name = sName;
    }
    /**
     * @return description
     * */
    public final String getDescription() {
        return description;
    }
    /**
     * @param sDescription parametro.
     * */
    public final void setDescription(final String sDescription) {
        this.description = sDescription;
    }
    /**
     * @return price
     * */
    public final double getPrice() {
        return price;
    }
    /**
     * @param sPrice parametro.
     * */
    public final void setPrice(final double sPrice) {
        this.price = sPrice;
    }
    /**
     * @return stock
     * */
    public final int getStock() {

        return stock;
    }
    /**
     * @param sStock parametro.
     * */
    public final void setStock(final int sStock) {
        this.stock = sStock;
    }
    /**
     * @return myCart
     * */
    public final Cart addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return myCart;
    }
}
