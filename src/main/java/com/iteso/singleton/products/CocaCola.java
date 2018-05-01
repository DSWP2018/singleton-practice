package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 *
 */
public class CocaCola extends Product {

    /**
     *
     */
    public static final int STOCK = 100;
    /**
     *
     */
    public static final double PRICE = 12.5;
    /**
     *
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     *
     */
    public static final String NAME = "Coca-Cola";

    /**
     * Constructor.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
