package com.iteso.singleton.products;

import com.iteso.singleton.Product;

public class Monster extends Product {
    /**
     *Body of class Monster */

    public static final int STOCK = 100;
    /**
     * STOCK*/
    public static final double PRICE = 32.5;
    /**
     * PRICE*/
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * DESCRIPTION*/
    public static final String NAME = "Monster";
    /**
     * NAME*/

    public Monster(){
        setName(NAME);
        /**
         * METHOD setName for setting NAME*/
        setDescription(DESCRIPTION);
        /**
         * METHOD setDescription for setting DESCRIPTION*/
        setPrice(PRICE);
        /**
         * METHOD setPrice for setting PRICE*/
        setStock(STOCK);
        /**
         * METHOD setStock for setting STOCK*/
    }

}
