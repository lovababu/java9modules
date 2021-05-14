package org.avol.ekart.product.entity;

/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java9-modules
 **/
public class Product {
    private final int id;
    private final String name;
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
