package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Monster class.
 */
public class Monster extends Product {
    /**
     * Stock.
     */
    public static final int STOCK = 100;
    /**
     * Price.
     */
    public static final double PRICE = 32.5;
    /**
     * Description.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * Name.
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
