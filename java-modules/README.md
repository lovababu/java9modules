# Java 9 Modularity.
    main
        - Represent main runner module, which is depends on order module.
        - module-info.java, requires order module (product module with transitive dependency.)
    order
        - Represents the order module, which is depends on product module.
        - module-info.java, requires product module.    
    product
        - Represents the product module.
        - module-info.java, exports .entity and .dao packages.

Read comment lines on .java files for better understanding modularity over mvn modules.

## Modules project jigsaw (https://www.oracle.com/corporate/features/understanding-java-9-modules.html).
Modularity adds a higher level of aggregation above packages.
Module is a uniquely named, reusable group of related packages, as well as resources and a module descriptor.
Module descriptor contains.
    - Module Name.
    - Module Dependencies.
    - The packages it explicitly makes available to other modules.
    - The services it offers (keywords: exports, open, opens).
    - The services it consumes (requires).
    - To what other modules it allows reflection.

## Modularity goals.
    - Reliable configuration.
        dependency can be evaluated both at compile time and runtime.
        Fail fast in case of any dependency missing in module graph.
    - Strong encapsulation.
        Only accessible when it exports irrespective of access specifier/modifier.
    - Scalable java platform.
        Java is no longer monolith. JDK devided into multiple modules, most of them are optional. 
        Base modules is the smaller unit for running most of the java applications.
    - Greater platform integrity.
        No restrictions on using java propriatery classes prior to java 9.
        with strong encapsulation, these internal java classes are hidden from the applications.
    - Improved Performance.
        Smaller the size is faster, amount of class loading reduced by only having the modules required to run the application.

## Module Descriptor
 ```module-info.java``` is the module descriptor file.  
 module directives are ***requires***, ***exports***, ***provides…with***, ***uses*** and ***opens***.
 
 ```requires```  specifies that this module is depends on another module.
    ````requires static```` specifies that this module is required at compile time, but optional at runtime.
    ```requires transitive``` specify a dependency on another module and to ensure that other modules is also available 
    (represents transitive dependency).  

 ```export``` specifies that one of the module package whose public types should be accessible to other modules.  
 ```export ...to ... ``` specifies that this module package should only be accessible to other modules specified with comma separated.

 ```uses``` specifies a service used by this module, making the module a service consumer. 
 A service is an object of a class that implements an interface of extend from abstract class specified in the ```uses``` directive.

 ```provides ... with``` specifies that a module provides a service implementation-making the module a service provider.
 The ```provides``` part of the directive specifies an interface or abstract class listed in a module's ```uses``` directive.
 And ```with``` part of the directive specifies the name of the service provider class that implements the interface or extend abstract class.
 
```open, opens, open ... to``` specifies that this module or specific package are allowed to access by reflection library in other module.



 
  
 

