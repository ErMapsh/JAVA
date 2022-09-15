package _11Abstract._3Interface;

public class _3WhyNotMultipleInheri {
    public static void main(String[] args) {
        System.out.println("\n--- why not mulitple inheritance in java---\n");

        
    }
}

/*
    Is multiple inheritance allowed in Java?
        1. Multiple inheritance faces problems when there exists a method with the same signature in boththe superclasses.
        2. Due to such a problem, java does not support multiple inheritance directly, but the similarconcept can be achieved using interfaces.
        3.A class can implement multiple interfaces and extend a class at the same time.

    Some Important points :
        1. Interfaces in java are a bit like the class but with a significantly different. 
        2. An Interface can only have method signatures field and a default method.
        3. The class implementing an interface needs to declare the methods ( not field )
        4. You can create a reference of an interface but not the object 
        5. Interface methods are public by default 
*/
        