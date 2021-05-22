/**
 * @author Lovababu P.
 * DateTime: 22-05-2021
 * Project Name: java-modules
 **/
module international {
    requires dispatch;
    provides org.avol.ekart.dispatch.Dispatcher with org.avol.ekart.international.DispatchImpl;
}