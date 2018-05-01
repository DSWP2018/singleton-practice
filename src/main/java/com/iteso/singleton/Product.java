package com.iteso.singleton;

/**
 * Clase padre Producto.
 */
public class Product {
    /**
     * Nombre de producto.
     */
    private String name;
    /**
     * Descripción de producto.
     */
    private String description;
    /**
     * Precio de producto.
     */
    private double price;
    /**
     * Cantidad de producto en almacén.
     */
    private int stock;

    /**
     * Getter nombre.
     * @return nombre
     */
    public final String getName() {
        return name;
    }

    /**
     * Setter nombre.
     * @param nombre nombre
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }

    /**
     * getter descripción.
     * @return desc
     */
    public final String getDescription() {
        return description;
    }

    /**
     * setter descripción.
     * @param descripcion desc
     */
    public final void setDescription(final String descripcion) {
        this.description = descripcion;
    }

    /**
     * getter precio.
     * @return precio.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * setter precio.
     * @param precio precio.
     */
    public final void setPrice(final double precio) {
        this.price = precio;
    }

    /**
     * getter almacén.
     * @return cantidad.
     */
    public final int getStock() {

        return stock;
    }

    /**
     * seter almacén.
     * @param almac almacén
     */
    public final void setStock(final int almac) {
        this.stock = almac;
    }

    /**
     * agrega producto al carro.
     * diminuye la cantidad en almacén.
     * faltaría programar lo que pasa si stock llega a cero.
     */
    public final void addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
