# SOLID Principles

## Single responsibility principle (SRP)

A class should have one, and only one, reason to change.

### Example
A class such as Invoice class should not handle `Invoice` AND `Emails` AND `Printing`. If there is an `AND` it means your class is doing too much.

## Open Closed principle
A module should be open for extension but closed for modification. That is, modules should be written so that they can be extended, without requiring them to be modified.


### Example

To add more functionality to a class which depends on `Command` class, we create multiple `Command` subclasses. Behaviour is extended without having to modify code.

- ArrayList class can be reused for different templates/ types without modifying its code base.
- example: AddressbookParser, where we need to add more switch cases when we wish to add more commands

### Example 2
Addressbook `Person` class. When GinWee adds a new attribute, everything breaks because he did not use open closed principle. He instead added an extra attribute to the `Person` class thereby breaking everything including JUnit tests.

## Liskov Substitution Principle
LSP implies that a subclass should not be more restrictive than the behavior specified by the superclass. 
LSP also implies that a parent class should be substituted without any negative side effects. `eg. child class cannot accept another data type which would cause confusion`  
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
    void adjustSalaries() {
        //...
    }

    void removeSalaries() {
        //...
    }
}

public class PayrollAdmin extends Payroll {
    // But we only want PayrollAdmin to be able to adjustSalaries :O
}

// RIGHT
interface PayrollInterface {
    void adjustSalaries() {
        //...
    }
}

public class Payroll implements PayrollInterface {
    void adjustSalaries() {
        //...
    }
    void removeSalaries() {
        //...
    }
}

public class PayrollAdmin implements PayrollInterface {
    // Now PayrollAdmin can only use adjustSalaries
    // removeSalaries method does not exist
}

PayrollAdmin.removeSalaries() // cannot be done
PayrollAdmin.adjustSalaries() // Possible
```

## Dependency inversion principle
1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details should depend on abstractions.

Note: DIP does not reduce dependencies  

eg. TzeGuang should not address thruster values directly in his task script and should instead call the methods given by LocomotionServer

## Seperation of concerns principle
To achieve better modularity, we should seperate code into its distinct modules. - seperating model, view and controller


## Law of demeter
- An object should have limited knowledge of another object.
- An object should only interact with objects that are closely related to it.

eg.

```java
void foo(Bar b) {
    Goo g = b.getGoo();
    g.doSomething();
}
```
`Note: A-->B-->C Does not mean A can access C. As C could be a private attribute in B`

To reduce coupling, we do not want `foo` to be coupled to `Goo` while it is already coupled to `Bar`. Instead we should offload the method `doSomething()` to `Bar` or call `b.getGoo().doSomething()`


