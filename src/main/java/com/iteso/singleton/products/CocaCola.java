package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase CocaCola que extiende de producto.
 * Su funcion es crear cocas.
 */
public class CocaCola extends Product {
    /**
     * Establece el número de cocas disponibles.
     */
    public static final int STOCK = 100;
    /**
     * Establece el precio de una coca.
     */
    public static final double PRICE = 12.5;
    /**
     * Establece la descripcion del producto coca.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * Establece el nombre del producto coca.
     */
    public static final String NAME = "Coca-Cola";

    /**
     * Constructor de un producto coca cola.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
