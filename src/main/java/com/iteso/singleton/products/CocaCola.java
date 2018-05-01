package com.iteso.singleton.products;

import com.iteso.singleton.Product;

/**
 * Clase CocaCola que extiende de Producto.
 */
public class CocaCola extends Product {
    /**Cantidad en existencia.*/
    public static final int STOCK = 100;
    /**Precio de la coca.*/
    public static final double PRICE = 12.5;
    /**Descripcion de la coca.*/
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**NOMBRE.*/
    public static final String NAME = "Coca-Cola";

    /**
     * Constructor de la clase.
     */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
