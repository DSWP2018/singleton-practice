package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase CocaCola.
 */
public class CocaCola extends Product {

    /**
     * STOCK.
     */
    public static final int STOCK = 100;
    /**
     * PRICE.
     */
    public static final double PRICE = 12.5;
    /**
     * DESCRIPTION.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * NAME.
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
