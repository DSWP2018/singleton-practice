package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**
 *
 * */
public class Lechuguilla extends Product {
    /**
     *
     * */
    public static final int STOCK = 100;
    /**
     *
     * */
    public static final double PRICE = 2.5;
    /**
     *
     * */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     *
     * */
    public static final String NAME = "Lechuguilla";
    /**
     *
     * */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
