package org.avol.ekart.product.dao;

import org.avol.ekart.product.entity.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java9-modules
 **/
public class ProductRepository {

    private static final Map<Integer, Product> PRODUCT_STORE = new HashMap<>();

    static {
        PRODUCT_STORE.put(1, new Product(1, "TV"));
        PRODUCT_STORE.put(2, new Product(2, "AC"));
        PRODUCT_STORE.put(3, new Product(3, "Refrigerator"));
    }

    public Product findById(int id) {
        return PRODUCT_STORE.get(id);
    }
}
