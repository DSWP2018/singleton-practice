package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**Clase cocacola. */
public class CocaCola extends Product {
    /**Variables. */
    public static final int STOCK = 100; /**stock del producto. */
    public static final double PRICE = 12.5; /**precio del producto. */
    public static final String DESCRIPTION
            = "Refresco sabor cola con azucar"; /**descripcion del producto. */
    public static final String NAME = "Coca-Cola"; /**nombre del producto. */
    /**constructor de la clase. */
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
