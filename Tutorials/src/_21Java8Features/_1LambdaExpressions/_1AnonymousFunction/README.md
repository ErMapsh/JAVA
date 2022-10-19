# Anonymous Functions

### What is anonymous functions?

- the method who don't have any name, return type and accessor specifier.

```
public class AnonymousFunction {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    
    // the anonymous function
    (){
        System.out.println("This is anonymous function");
    }
  
     public static void main(String[] args) {
        new AnonymousFunction().add(1,3);
    }
}
```

- difficulties are occurred, when we want to call anonymous function, how we can we call it.
- here is another thing to calling anonymous function, it's called <b>Functional Interface</b>.
- using Functional Interface we can call anonymous function.