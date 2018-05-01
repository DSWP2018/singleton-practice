package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * monster.
 */
public class Monster extends Product {
    /**
     * stock.
     */
    public static final int STOCK = 100;
    /**
     * price.
     */
    public static final double PRICE = 32.5;
    /**
     * description.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * name.
     */
    public static final String NAME = "Monster";

    /**
     * constructor.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
