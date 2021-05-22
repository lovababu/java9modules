package org.avol.ekart.main;

import org.avol.ekart.dispatch.Dispatcher;
import org.avol.ekart.order.Order;
import org.avol.ekart.order.OrderServiceImpl;

import java.util.ServiceLoader;

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

        ServiceLoader<Dispatcher> serviceLoader = ServiceLoader.load(Dispatcher.class);
        for (final Dispatcher dispatcher: serviceLoader) {
            //on the console, you might be seeing both domestic/international dispatch output.
            //Ideally any one of the dependency added to respective service consumer.
            //go to this module pom.xml and comment any of the domestic or international dependency and rerun it.
            dispatcher.dispatch();
        }
    }
}
