package org.avol.ekart.international;

import org.avol.ekart.dispatch.Dispatcher;

/**
 * @author Lovababu P.
 * DateTime: 22-05-2021
 * Project Name: java-modules
 **/
public class DispatchImpl implements Dispatcher {
    @Override
    public void dispatch() {
        System.out.println("International Dispatch method.");
        System.out.println("Package delivered through AirIndia Airlines.");
    }
}
