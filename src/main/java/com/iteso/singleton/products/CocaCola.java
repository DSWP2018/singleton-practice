package com.iteso.singleton.products;

import com.iteso.singleton.Product;

public class CocaCola extends Product {
    /**
    *Body of class CocaCola */

    public static final int STOCK = 100;
    /**
     * STOCK*/
    public static final double PRICE = 12.5;
    /**
     * PRICE*/
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * DESCRIPTION*/
    public static final String NAME = "Coca-Cola";
    /**
     * NAME*/

    public CocaCola(){
        setName(NAME);
        /**
         * METHOD setName for setting STOCK*/
        setDescription(DESCRIPTION);
        /**
         * METHOD setDescription for setting STOCK*/
        setPrice(PRICE);
        /**
         * METHOD setPrice for setting STOCK*/
        setStock(STOCK);
        /**
         * METHOD setStock for setting STOCK*/
    }

}
