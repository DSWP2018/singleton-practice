package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase Lechuguilla.
 */
public class Lechuguilla extends Product {

    /**
     * STOCK.
     */
    public static final int STOCK = 100;
    /**
     * PRICE.
     */
    public static final double PRICE = 2.5;
    /**
     * DESCRIPTION.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * NAME.
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
