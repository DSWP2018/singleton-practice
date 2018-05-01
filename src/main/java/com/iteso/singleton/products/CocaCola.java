package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Cocacola class.
 */
public class CocaCola extends Product {
    /**
     * Stock.
     */
    public static final int STOCK = 100;
    /**
     * Price.
     */
    public static final double PRICE = 12.5;
    /**
     * Description.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * Name.
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
