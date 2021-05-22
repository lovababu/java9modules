/**
 * main module descriptor.
 *
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java-modules
 **/
module main {
    requires order;
    requires dispatch;
    uses org.avol.ekart.dispatch.Dispatcher;
}