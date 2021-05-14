package org.avol.ekart.order;

import org.avol.ekart.product.dao.ProductRepository;
//import org.avol.ekart.product.db.Connection;  //not accessible

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
        //Connection connection = new Connection(); //can't possible, since we didn't export the .db package.
        return new Order(new Random().nextInt(), productRepository.findById(productId));
    }
}
