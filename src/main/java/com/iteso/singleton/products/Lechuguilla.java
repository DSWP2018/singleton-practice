package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * lechuguilla.
 */
public class Lechuguilla extends Product {
    /**
     * stock.
     */
    public static final int STOCK = 100;
    /**
     * price.
     */
    public static final double PRICE = 2.5;
    /**
     * description.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * name.
     */
    public static final String NAME = "Lechuguilla";

    /**
     * constructor.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
