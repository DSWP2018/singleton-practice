package com.iteso.singleton;

/**
 * @author Yo
 * @version 0.0
 */
public class Product {
    /**
     * Estamos listos.
     */
    private String name;
    /**
     * Es la descripcion.
     */
    private String description;
    /**
     * Es el precio.
     */
    private double price;
    /**
     * Es el inventario.
     */
    private int stock;

    /**
     * Soy yo.
     * @return de nuevo.
     */
    public final String getName() {
        return name;
    }

    /**
     * Es el set del nombre.
     * @param nombre el nombre.
     */
    public final void setName(final String nombre) {
        this.name = nombre;
    }

    /**
     * Es el get de la desc.
     * @return la descripción.
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Soy yo.
     * @param desc del producto.
     */
    public final void setDescription(final String desc) {
        this.description = desc;
    }

    /**
     * El precio en doble.
     * @return el precio.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Configura el precio del p.
     * @param p es el precio.
     */
    public final void setPrice(final double p) {
        this.price = p;
    }

    /**
     * Revela aquello oculto.
     * @return la cantidad de stock.
     */
    public final int getStock() {

        return stock;
    }

    /**
     * Dispone a los productos.
     * @param stck soy yo.
     */
    public final void setStock(final int stck) {
        this.stock = stck;
    }

    /**
     * Agrega el p. actual al carrito.
     * @return El carrito para hacer llamadas en cascada.
     */
    public final Cart addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
        return myCart;
    }
}
