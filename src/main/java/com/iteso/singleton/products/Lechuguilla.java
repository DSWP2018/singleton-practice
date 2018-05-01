package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase Lechuguilla que extiende de Producto.
 */
public class Lechuguilla extends Product {
    /**Cantidad en existencia.*/
    public static final int STOCK = 100;
    /**Precio de la lechuguilla.*/
    public static final double PRICE = 2.5;
    /**Descripcion de la lechuguilla.*/
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**NOMBRE.*/
    public static final String NAME = "Lechuguilla";

    /**
     * Constructor de la clase.
     */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
