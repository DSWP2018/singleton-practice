package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * @author Yo
 * @version 0.0
 */
public class CocaCola extends Product {

    /**
     * No es real.
     */
    public static final int STOCK = 100;
    /**
     * Somos las amistades que hacemos.
     */
    public static final double PRICE = 12.5;
    /**
     * Somos todos.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * Soy yo.
     */
    public static final String NAME = "Coca-Cola";

    /**
     * Es el constructor de todas las cocas.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
