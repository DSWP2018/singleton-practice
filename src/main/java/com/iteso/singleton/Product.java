package com.iteso.singleton;

/**
 * Clase padre producto.
 */
public class Product {
    /**
     * String name.
     */
    private String name;
    /**
     * String description.
     */
    private String description;
    /**
     * Double price.
     */
    private double price;
    /**
     * Int stock.
     */
    private int stock;

    /**
     * getName.
     * @return string with the name.
     */
    public final String getName() {
        return name;
    }

    /**
     * setName.
     * @param nombre nombre.
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }

    /**
     * getDescription.
     * @return description.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * setDescription.
     * @param descripcion descripcion.
     */
    public final void setDescription(final String descripcion) {
        this.description = descripcion;
    }

    /**
     *
     * @return price.
     */
    public final double getPrice() {
        return price;
    }

    /**
     *
     * @param precio precio.
     */
    public final void setPrice(final double precio) {
        this.price = precio;
    }

    /**
     *
     * @return stock.
     */
    public final int getStock() {
        return stock;
    }

    /**
     *
     * @param intStock stock.
     */
    public final void setStock(final int intStock) {
        this.stock = intStock;
    }

    /**
     * addToCart.
     */
    public final void addToCart() {
        Cart myCart = Cart.getUniqueCart();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return;
    }
}
