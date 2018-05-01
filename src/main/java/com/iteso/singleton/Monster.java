package com.iteso.singleton;
/**
 Class Monster.**/
public class Monster extends Product {
    /**@VAR INT.**/
    public static final int STOCK = 100;
    /**@VAR DOUBLE.**/
    public static final double PRICE = 32.5;
    /**@VAR STRING.**/
    public static final String DESCRIPTION = "Bebida energetica sabor maracuya";
    /**@VAR NAME.**/
    public static final String NAME = "Monster";
    /**Constructor.**/
    public Monster() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }
}
