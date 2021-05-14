package org.avol.ekart.order;

import org.avol.ekart.product.Product;

/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java9-modules
 **/
public class Order {
    private final int id;
    private final Product product;

    public Order(int id, Product product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }
}
