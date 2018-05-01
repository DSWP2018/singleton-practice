package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**Clase lechiguilla. */
public class Lechuguilla extends Product {
    /**Variables. */
    public static final int STOCK = 100; /**stock del producto. */
    public static final double PRICE = 2.5; /**precio del producto. */
    public static final String DESCRIPTION
            = "Bebida refrescante de agave"; /**descripcion del producto. */
    public static final String NAME = "Lechuguilla"; /**nombre del producto. */
    /**constructor de la clase. */
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
