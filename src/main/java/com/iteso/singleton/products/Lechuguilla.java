package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Producto lechuguilla.
 */
public class Lechuguilla extends Product {

    /**
     * Cantidad en almacén.
     */
    public static final int STOCK = 100;
    /**
     * Precio de producto.
     */
    public static final double PRICE = 2.5;
    /**
     * Descripción de producto.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * Nombre de producto.
     */
    public static final String NAME = "Lechuguilla";

    /**
     * Cosntructor.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
