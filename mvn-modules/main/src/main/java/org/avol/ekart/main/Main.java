package org.avol.ekart.main;

import org.avol.ekart.order.Order;
import org.avol.ekart.order.OrderServiceImpl;

/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java9modules
 **/
public class Main {

    public static void main(String[] args) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        Order order = orderService.placeOrder(1);
        System.out.println("------------- Order Status ------------");
        System.out.println("Order Id: " + order.getId());
        System.out.println("Product Name: " + order.getProduct().getName());
    }
}
