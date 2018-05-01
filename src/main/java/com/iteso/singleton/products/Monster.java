package com.iteso.singleton.products;

import com.iteso.singleton.Product;
/**Clase monster. */
public class Monster extends Product {
    /**Variables. */
    public static final int STOCK = 100; /**stock del producto. */
    public static final double PRICE = 32.5; /**precio del producto. */
    public static final String DESCRIPTION
            = "Bebida energetica sabor maracuya";
    /**descripcion del producto. */
    public static final String NAME = "Monster"; /**nombre dell producto. */
    /**Constructor de la clase. */
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
