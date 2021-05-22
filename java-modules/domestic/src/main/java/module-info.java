/**
 * @author Lovababu P.
 * DateTime: 22-05-2021
 * Project Name: java-modules
 **/
module domestic {
    requires dispatch;
    provides org.avol.ekart.dispatch.Dispatcher with org.avol.ekart.domestic.DispatcherImpl;
}