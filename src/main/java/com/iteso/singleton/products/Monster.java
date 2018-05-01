package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**
 * Clase Monster que extiende de producto.
 * Su funcion es crear monster.
 */
public class Monster extends Product {
    /**
     * Establece el número de monsters disponibles.
     */
    public static final int STOCK = 100;
    /**
     * Establece el precio de un monster.
     */
    public static final double PRICE = 32.5;
    /**
     * Establece la descripcion del producto monster.
     */
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**
     * Establece el nombre del producto monster.
     */
    public static final String NAME = "Monster";
    /**
     * Constructor de un producto monster.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
