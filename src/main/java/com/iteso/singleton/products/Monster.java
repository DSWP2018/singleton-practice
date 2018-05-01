package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase que extiende de producto.
 */
public class Monster extends Product {

    /**
     * Stock del producto.
     */
    public static final int STOCK = 100;
    /**
     * Price del producto.
     */
    public static final double PRICE = 32.5;
    /**
     * Descripción del producto.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * Nombre del producto.
     */
    public static final String NAME = "Monster";

    /**
     * Constructor.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
