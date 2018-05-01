package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Class lechugilla.
 */
public class Lechuguilla extends Product {

    /**
     * Stock.
     */
    public static final int STOCK = 100;

    /**
     * Price.
     */
    public static final double PRICE = 2.5;

    /**
     * Description.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";

    /**
     * Name.
     */
    public static final String NAME = "Lechuguilla";

    /**
     * Get all.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
