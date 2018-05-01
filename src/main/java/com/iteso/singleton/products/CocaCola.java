package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Producto Coca Cola.
 */
public class CocaCola extends Product {
    /**
     * Cantidad en almacén.
     */
    public static final int STOCK = 100;
    /**
     * Precio de producto.
     */
    public static final double PRICE = 12.5;
    /**
     * Descripción de producto.
     */
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**
     * Nombre de producto.
     */
    public static final String NAME = "Coca-Cola";

    /**
     * Cosntructor.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
