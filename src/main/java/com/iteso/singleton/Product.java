package com.iteso.singleton;

/**
 * Class product.
 */
public class Product {

    /**
     * Name.
     */
    private String name;

    /**
     * Desc.
     */
    private String description;

    /**
     *Price.
     */
    private double price;

    /**
     * Stock.
     */
    private int stock;

    /**
     * @return name.
     */
    public final String getName() {
        return name;
    }

    /**
     * @param nam name.
     */
    public final void setName(final String nam) {
        name = nam;
    }

    /**
     * @return desc.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @param desc set desc.
     */
    public final void setDescription(final String desc) {
        description = desc;
    }

    /**
     * @return price price.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * @param pric price.
     */
    public final void setPrice(final double pric) {
        price = pric;
    }

    /**
     * @return stock.
     */
    public final int getStock() {

        return stock;
    }

    /**
     * @param stoc stock.
     */
    public final void setStock(final int stoc) {
        stock = stoc;
    }

    /**
     * add to cart.
     */
    public final void addToCart() {
        Cart myCart = Cart.getCart();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
