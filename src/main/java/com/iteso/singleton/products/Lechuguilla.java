package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Refleja la ambivalencia inherente de
 * los mexicanos.
 * @version 0.0
 * @author Yo
 */
public class Lechuguilla extends Product {

    /**
     * Have you seen a prank?.
     */
    public static final int STOCK = 100;
    /**
     * Hamburger please.
     */
    public static final double PRICE = 2.5;
    /**
     * B0ss please.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * End it all.
     */
    public static final String NAME = "Lechuguilla";

    /**
     * Es el constructor.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
