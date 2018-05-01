package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase Monster que extiende de Product.
 */
public class Monster extends Product {
    /**Cantidad en existencia.*/
    public static final int STOCK = 100;
    /**Precio del Monster.*/
    public static final double PRICE = 32.5;
    /**Descripcion del Monster.*/
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**NOMBRE.*/
    public static final String NAME = "Monster";

    /**
     * Constructor de la clase.
     */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
