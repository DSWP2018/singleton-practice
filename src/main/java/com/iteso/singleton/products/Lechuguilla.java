package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase que extiende de producto.
 */
public class Lechuguilla extends Product {

    /**
     * Stock del producto.
     */
    public static final int STOCK = 100;
    /**
     * Price del producto.
     */
    public static final double PRICE = 2.5;
    /**
     * Descripción del producto.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * Nombre del producto.
     */
    public static final String NAME = "Lechuguilla";

    /**
     * Constructor.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
