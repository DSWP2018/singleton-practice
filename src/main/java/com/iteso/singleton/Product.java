package com.iteso.singleton;

/**
 * Product class.
 */
public class Product {
    /**
     * Product name.
     */
    private String name;
    /**
     * Product description.
     */
    private String description;
    /**
     * Product price.
     */
    private double price;
    /**
     * Product stock.
     */
    private int stock;

    /**
     * Name.
     * @return name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Set name.
     * @param name1 New name.
     */
    public final void setName(final String name1) {
        this.name = name1;
    }

    /**
     * Description.
     * @return description.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Set description.
     * @param description1 Description.
     */
    public final void setDescription(final String description1) {
        this.description = description1;
    }

    /**
     * Price.
     * @return price.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Set price.
     * @param price1 price.
     */
    public final void setPrice(final double price1) {
        this.price = price1;
    }

    /**
     * Stock.
     * @return Stock.
     */
    public final int getStock() {
        return stock;
    }

    /**
     * Set stock.
     * @param stock1 Stock.
     */
    public final void setStock(final int stock1) {
        this.stock = stock1;
    }

    /**
     * Add to cart.
     */
    public final void addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
