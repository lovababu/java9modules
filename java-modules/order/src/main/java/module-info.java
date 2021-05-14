/**
 * @author Lovababu P.
 * DateTime: 14-05-2021
 * Project Name: java-modules
 **/
module order {
    requires transitive product; //remove transitive and build.
    exports org.avol.ekart.order;
}