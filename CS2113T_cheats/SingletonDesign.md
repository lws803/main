# Singleton design

A certain classes should have no more than just one instance (e.g. the main controller class of the system). These single instances are commonly known as singletons.




```Java
class Logic {
    private static Logic theOne = null;

    // Make constructor private
    private Logic() {
        ...
    } 

    public static Logic getInstance() {
        if (theOne == null) {
            theOne = new Logic(); // We can only instantiate this Class once.
        }
        return theOne;
    }
}
```


## Pros:
- easy to apply
- effective in achieving its goal with minimal extra work
- provides an easy way to access the singleton object from anywhere in the code base

## Cons:

- The singleton object acts like a global variable that increases coupling across the code base.
- In testing, it is difficult to replace Singleton objects with stubs (static methods cannot be overridden)
- In testing, singleton objects carry data from one test to another even when we want each test to be independent of the others.
- Constructor is private, so it cannot be subclassed


