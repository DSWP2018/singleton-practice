package com.iteso.singleton;

/**
 * Clase para crear y manipular productos.
 */
public class Product {
    /**
     * Nombre del producto.
     */
    private String name;
    /**
     * Descripcion del producto.
     */
    private String description;
    /**
     * Precio del producto.
     */
    private double price;
    /**
     * Cantidad de articulos disponibles del producto.
     */
    private int stock;

    /**
     * Método para obtener el nombre del producto.
     * @return nombre.
     */
    public final String getName() {
        return name;
    }
    /**
     * Método para establecer el nombre del producto.
     * @param nombre .
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }
    /**
     * Método para obtener la descripcion del producto.
     * @return descripcion.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Método para establecer la descripcion del producto.
     * @param descripcion .
     */
    public final void setDescription(final String descripcion) {
        this.description = descripcion;
    }

    /**
     * Método para obtener el precio del producto.
     * @return precio.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Método para establecer el precio del producto.
     * @param precio .
     */
    public final void setPrice(final double precio) {
        this.price = precio;
    }

    /**
     * Método para obtener el stock del producto.
     * @return stock.
     */
    public final int getStock() {

        return stock;
    }

    /**
     * Método para establecer el stock del producto.
     * @param mstock .
     */
    public final void setStock(final int mstock) {
        this.stock = mstock;
    }

    /**
     * Método para añadir productos al carro.
     * @return carro con producto añadido.
     */
    public final Cart addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return myCart;
    }
}
