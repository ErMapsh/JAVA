# Functional Interface:

### What is functional Interface?

- The interface who contains only one abstract method but can have multiple default and static method is called
  Functional Interface.

## In Java, we have the following built-in functional Interface:

| Functional Interface | Abstract method | 
|----------------------|-----------------|
| Runnable             | run();          |     
| Callable             | call();         |     
| Comparable           | compareTo();    |     
| Comparator           | compare();      |     

## One example of how we can implement Functional Interface:

````
package _21Java8Features._1LambdaExpressions._2Functional_Interface;

class FunctionalInterfaceDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("This is my own class method");
    }
}
````

# User Defined Functional Interface: