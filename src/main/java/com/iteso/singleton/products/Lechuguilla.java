package com.iteso.singleton.products;

import com.iteso.singleton.Product;

public class Lechuguilla extends Product {
    /**
     *Body of class Lechuguilla */

    public static final int STOCK = 100;
    /**
     * STOCK*/
    public static final double PRICE = 2.5;
    /**
     * PRICE*/
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * DESCRIPTION*/
    public static final String NAME = "Lechuguilla";
    /**
     * NAME*/

    public Lechuguilla(){
        setName(NAME);
        /**
         * METHOD setName for setting NAME*/
        setDescription(DESCRIPTION);
        /**
         * METHOD setDescription for setting DESCRIPTION*/
        setPrice(PRICE);
        /**
         * METHOD setPrice for setting PRICE
         * */
        setStock(STOCK);
        /**
         * METHOD setStock for setting STOCK
         * */
    }

}
