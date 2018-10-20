# SOLID Principles

## Single responsibility principle (SRP)

A class should have one, and only one, reason to change.

### Example
Consider a TextUi class that does parsing of the user commands as well as interacting with the user. That class needs to change when the formatting of the UI changes as well as when the syntax of the user command changes. Hence, such a class does not follow the SRP.

## Open Closed principle
A module should be open for extension but closed for modification. That is, modules should be written so that they can be extended, without requiring them to be modified.

### Example

To add more functionality to a class which depends on `Command` class, we create multiple `Command` subclasses. Behaviour is extended without having to modify code.

- ArrayList class can be reused for different templates/ types without modifying its code base.
- example: AddressbookParser, where we need to add more switch cases when we wish to add more commands


## Liskov Substitution Principle
LSP implies that a subclass should not be more restrictive than the behavior specified by the superclass. 
eg. 

```java

class Rectangle {
    ...
    /** sets the size to given height and width*/
    void resize(int height, int width){
        ...
    }
}

class Square extends Rectangle {
    
    @Override
    void resize(int height, int width){
        if (height != width) {
            //error, this is more restrictive
       }
    }
}
```

or when an overriden method throws exception but the method in interface doesn't.


## Interface Segregation Principle

No client should be forced to depend on methods it does not use.
```java
// WRONG
public class Payroll {
    //...    
    private void adjustSalaries(AdminStaff adminStaff){ //violates ISP, because it does not use the arrangeMeeting() method in AdminStaff class
        //...
    }

}

// RIGHT
public class Payroll {
    //...    
    private void adjustSalaries(SalariedStaff staff){ //does not violate ISP
        //...
    }
}
```


## Dependency inversion principle
1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details should depend on abstractions.

Note: DIP does not reduce dependencies

