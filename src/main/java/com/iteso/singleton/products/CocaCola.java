package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase que extiende de producto.
 */
public class CocaCola extends Product {

    /**
     * Stock del producto.
     */
    public static final int STOCK = 100;
    /**
     * Price del producto.
     */
    public static final double PRICE = 12.5;
    /**
     * Descripción del producto.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * Nombre del producto.
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
