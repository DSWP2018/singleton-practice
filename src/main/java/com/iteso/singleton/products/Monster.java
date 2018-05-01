package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Class mosnter.
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
     * Monster.
     */
    public static final String NAME = "Monster";

    /**
     * Get mosnter.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
