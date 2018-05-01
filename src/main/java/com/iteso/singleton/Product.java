package com.iteso.singleton;

/**
 * product.
 */
public class Product {
    /**
     * name.
     */
    private String name;
    /**
     * description.
     */
    private String description;
    /**
     * price.
     */
    private double price;
    /**
     * stock.
     */
    private int stock;

    /**
     * name.
     * @return asdfasd
     */
    public final String getName() {
        return name;
    }

    /**
     * name.
     * @param namep asdfasd
     */
    public final void setName(final String namep) {
        this.name = namep;
    }

    /**
     * description.
     * @return asdfadf
     */
    public final String getDescription() {
        return description;
    }

    /**
     * asdfasdf.
     * @param descriptionp asdfasdf
     */
    public final void setDescription(final String descriptionp) {
        this.description = descriptionp;
    }

    /**
     * asdfasdf.
     * @return asdfasdf
     */
    public final double getPrice() {
        return price;
    }

    /**
     * asdfasdf.
     * @param pricep asdfasdf
     */
    public final void setPrice(final double pricep) {
        this.price = price;
    }

    /**
     * asdfasdf.
     * @return asfd
     */
    public final int getStock() {

        return stock;
    }

    /**
     * asdfasdf.
     * @param stockp asdfa
     */
    public final void setStock(final int stockp) {
        this.stock = stockp;
    }

    /**
     * asdfadsf.
     * @return asdfadf
     */
    public final Cart addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return myCart;
    }
}
