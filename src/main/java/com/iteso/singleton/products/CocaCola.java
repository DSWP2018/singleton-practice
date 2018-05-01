package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * coca.
 */
public class CocaCola extends Product {
    /**
     * stock.
     */
    public static final int STOCK = 100;
    /**
     * price.
     */
    public static final double PRICE = 12.5;
    /**
     * description.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * name.
     */
    public static final String NAME = "Coca-Cola";

    /**
     * constuctor.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
