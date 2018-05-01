package com.iteso.singleton;

/**
 * Clase Product para interactuar con los productos.
 */
public class Product {
    /**Nombre del producto.*/
    private String name;
    /**Descripcion del producto.*/
    private String description;
    /**Precio del producto.*/
    private double price;
    /**Inventario del producto.*/
    private int stock;

    /** Método para obtener el nombre del producto.
     * @return String con el nombre.
     */
    public final String getName() {
        return name;
    }

    /** Método para establecer el nombre del producto.
     * @param nombre con el nombre del mismo.
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }

    /** Método para obtener la descripcion del producto.
     * @return String con la descripción.
     */
    public final String getDescription() {
        return description;
    }

    /** Método para establecer la descripcion del producto.
     * @param descripcion con la misma.
     */
    public final void setDescription(final String descripcion) {
        this.description = descripcion;
    }

    /** Método para obtener el precio del producto.
     * @return un double con el precio del mismo.
     */
    public final double getPrice() {
        return price;
    }

    /** Método para establecer el precio del producto.
     * @param precio con el precio del mismo.
     */
    public final void setPrice(final double precio) {
        this.price = precio;
    }

    /** Método para obtener la existencia del producto.
     * @return entero con el número en existencia.
     */
    public final int getStock() {
        return stock;
    }

    /** Método para establecer el número de
     * productos en existencia.
     * @param myStock con la cantidad en existencia.
     */
    public final void setStock(final int myStock) {
        this.stock = myStock;
    }

    /** Método para añadir un producto al carrito.*/
    public final void addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
