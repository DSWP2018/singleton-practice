package com.iteso.singleton.products;

import com.iteso.singleton.Product;

public class Monster extends Product {

    public static final int STOCK = 100;
    public static final double PRICE = 32.5;
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    public static final String NAME = "Monster";

    public Monster(){
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
