package org.avol.ekart.order;

import org.avol.ekart.product.ProductRepository;

import java.util.Random;

/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java9-modules
 **/
public class OrderServiceImpl {

    private final ProductRepository productRepository;

    public OrderServiceImpl() {
        this.productRepository = new ProductRepository();
    }

    public Order placeOrder(int productId) {
        return new Order(new Random().nextInt(), productRepository.findById(productId));
    }
}
