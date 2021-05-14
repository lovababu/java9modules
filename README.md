# java9modules

## mvn-modules.
  Maven multi module project, explain how to seperate modules and access modules from each other.
  No restriction on public classes, still they are exposed to other modules.
  
  How it is different from java 9 module, refer the class
  
  ```OrderServiceImpl.java#placeOrder()``` method. 
  We are free to access the ```Connection``` class from the package .db of Product module.
  
## java-modules
  Java 9 module projects, describes how to create modular java project and export the essential packages to other module.
  Complete control on the classes to expose, strong encapsulation.
  Reflection can be restricted.

  ```OrderServiceImpl.java#placeOrder()``` method. 
  We cannot access the ```Connection``` class from the package ```.db``` of ```Product``` module, due to strong encapsulation provided by java 9 modules.
