package com.iteso.singleton;
/**clase producto. */
public class Product {
    /**Inicializacion de variables. */
    private String name; /**Nombre del producto. */
    private String description; /**Descripcion del producto. */
    private double price; /**Precio del prodcuto. */
    private int stock; /**Stock del producto. */
    /**Funcion get del nombre. */
    /**@return name. */
    public final String getName() {
        return name;
    }
    /**@param name1 para setear el nombre. */
    public final void setName(final String name1) {
        this.name = name1;
    }
    /**@return description. */
    public final String getDescription() {
        return description;
    }
    /**@param description1  descriocion del producto. */
    public final void setDescription(final String description1) {
        this.description = description1;
    }
    /**@return price del producto. */
    public final double getPrice() {
        return price;
    }
    /**@param price1  del producto. */
    public final void setPrice(final double price1) {
        this.price = price1;
    }
    /**@return stock del producto. */
    public final int getStock() {

        return stock;
    }
    /**@param stock1 del producto. */
    public final void setStock(final int stock1) {
        this.stock = stock1;
    }
    /**Funcion para agregar al carro el producto. */
    public final void addToCart() {
        Cart myCart = Cart.getInstance();
        myCart.addProduct(this);
        int tempStock = getStock();
        setStock(tempStock - 1);
    }
}
