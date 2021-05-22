package org.avol.ekart.order;

import org.avol.ekart.product.dao.ProductRepository;
import org.avol.ekart.product.entity.Product;
//import org.avol.ekart.product.db.Connection;  //not accessible

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

/**
 * Order Service, find the requested product from product module and prepares order.
 *
 * @author Lovababu P.exit
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
        Product product = productRepository.findById(productId);

        //Testing reflection on the Product module.
        Field[] fields = product.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            System.out.println(field.getType());
            // The below snippet throw error saying module product does not "opens org.avol.ekart.product.entity" to module order.
            // In order to make it work, go to product module-info.java and add "opens org.avol.ekart.product.entity", and rerun.
            //field.setAccessible(true); //uncomment and execute.
        });
        return new Order(new Random().nextInt(), product, "domestic");
    }
}
