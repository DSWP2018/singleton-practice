package com.iteso.singleton;

/**
 Class Lechuguilla.**/
public class Lechuguilla extends Product {
    /**@VAR INT.**/
    public static final int STOCK = 100;
    /**@VAR double.**/
    public static final double PRICE = 2.5;
    /**@VAR string.**/
    public static final String DESCRIPTION = "Bebida refrescante de agave";
    /**@VAR string.**/
    public static final String NAME = "Lechuguilla";
    /**@VAR constructor.**/
    public Lechuguilla() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
