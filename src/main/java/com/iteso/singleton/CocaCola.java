package com.iteso.singleton;

/**
 Class CocaCola.**/
public class CocaCola extends Product {
    /**@VAR INT.**/
    public static final int STOCK = 100;
    /**@VAR double.**/
    public static final double PRICE = 12.5;
    /**@VAR string.**/
    public static final String DESCRIPTION = "Refresco sabor cola con azucar";
    /**@VAR string.**/
    public static final String NAME = "Coca-Cola";
    /**Constructor.**/
    public CocaCola() {
        setName(NAME);
        setDescription(DESCRIPTION);
        setPrice(PRICE);
        setStock(STOCK);
    }

}
