package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase Monster.
 */
public class Monster extends Product {

    /**
     * STOCK.
     */
    public static final int STOCK = 100;
    /**
     * PRICE.
     */
    public static final double PRICE = 32.5;
    /**
     * DESCRIPCION.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * NAME.
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
