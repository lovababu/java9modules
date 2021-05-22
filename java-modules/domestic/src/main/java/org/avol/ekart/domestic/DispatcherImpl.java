package org.avol.ekart.domestic;

import org.avol.ekart.dispatch.Dispatcher;

/**
 * @author Lovababu P.
 * DateTime: 22-05-2021
 * Project Name: java-modules
 **/
public class DispatcherImpl implements Dispatcher {
    @Override
    public void dispatch() {
        System.out.println("Domestic Dispatch method.");
        System.out.println("Package delivered through DTDC Courier.");
    }
}
