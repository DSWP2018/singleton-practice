package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase Lechugilla que extiende de producto.
 * Su funcion es crear lechugillas.
 */
public class Lechuguilla extends Product {
    /**
     * Establece el número de lechugillas disponibles.
     */
    public static final int STOCK = 100;
    /**
     * Establece el precio de una lechugilla.
     */
    public static final double PRICE = 2.5;
    /**
     * Establece la descripcion del producto lechugilla.
     */
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**
     * Establece el nombre del producto lechugilla.
     */
    public static final String NAME = "Lechuguilla";
    /**
     * Constructor de un producto lechugilla.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
