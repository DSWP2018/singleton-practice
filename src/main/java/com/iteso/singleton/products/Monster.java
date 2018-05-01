package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Es un vano intento de canon.
 */
public class Monster extends Product {

    /**
     * Soy yo.
     */
    public static final int STOCK = 100;
    /**
     * Imagine que ve un sketch.
     */
    public static final double PRICE = 32.5;
    /**
     * Con este hombre?.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * Alguna vez has soñado.
     */
    public static final String NAME = "Monster";

    /**
     * Es el constructor de Monster.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
