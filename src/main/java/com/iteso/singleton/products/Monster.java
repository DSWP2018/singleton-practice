package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**
 * Producto Monster.
 */
public class Monster extends Product {
    /**
     * Cantidad en almacén.
     */
    public static final int STOCK = 100;
    /**
     * Precio de producto.
     */
    public static final double PRICE = 32.5;
    /**
     * Descripción de producto.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * Nombre de producto.
     */
    public static final String NAME = "Monster";

    /**
     * Cosntructor.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
