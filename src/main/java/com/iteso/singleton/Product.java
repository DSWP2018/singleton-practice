package com.iteso.singleton;

/**
 *
 */
public class Product {
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private double price;
    /**
     *
     */
    private int stock;

    /**
     *
     * @return getName
     */
    public final String getName() {
        return name;
    }

    /**
     *
     * @param hName setName
     */
    public final void setName(final String hName) {
        this.name = hName;
    }

    /**
     *
     * @return get Description
     */
    public final String getDescription() {
        return description;
    }

    /**
     *
     * @param hDescription product desc
     */
    public final void setDescription(final String hDescription) {
        this.description = hDescription;
    }

    /**
     *
     * @return price
     */
    public  final double getPrice() {
        return price;
    }

    /**
     *
     * @param hPrice set the price
     */
    public final void setPrice(final double hPrice) {
        this.price = hPrice;
    }

    /**
     *
     * @return stock
     */
    public final int getStock() {

        return stock;
    }

    /**
     *
     * @param hStock set Stock
     */
    public final void setStock(final int hStock) {
        this.stock = hStock;
    }

    /**
     * add to cart.
     */
    public final void addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
