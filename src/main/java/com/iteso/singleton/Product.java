package com.iteso.singleton;

/**
 * Clase prodducto.
 */
public class Product {
    /**
     * Variable de nombre.
     */
    private String name;
    /**
     * Varibale de descripción.
     */
    private String description;
    /**
     * Variable de precio.
     */
    private double price;
    /**
     * Variable de stock.
     */
    private int stock;

    /**
     * Metodo para el nobmre.
     *
     * @return regrea el nombre.
     */
    public final String getName() {
        return name;
    }

    /**
     * Setter.
     * @param myName nombre.
     */
    public final void setName(final String myName) {
        this.name = myName;
    }

    /**
     * Getter.
     * @return descripción.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * setter.
     * @param myDescription del producto.
     */
    public final void setDescription(final String myDescription) {
        this.description = myDescription;
    }

    /**
     * getter.
     * @return price.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * setter.
     * @param myPrice del producto.
     */
    public final void setPrice(final double myPrice) {
        this.price = myPrice;
    }

    /**
     * Getter.
     * @return stock.
     */
    public final int getStock() {

        return stock;
    }

    /**
     * Setter.
     * @param myStock del prdocuto.
     */
    public final void setStock(final int myStock) {
        this.stock = myStock;
    }

    /**
     * Agregamos el procucto al carro.
     * @return el carro.
     */
    public final Cart addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return myCart;
    }
}
