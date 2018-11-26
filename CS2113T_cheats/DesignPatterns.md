# Design patterns

## Singleton design pattern


A certain classes should have no more than just one instance (e.g. the main controller class of the system). These single instances are commonly known as singletons.


```java
class Logic {
    private static Logic theOne = null; // Note that this is static

    // Make constructor private
    private Logic() {
        ...
    } 

    // getInstance is a recognised method in java
    public static Logic getInstance() {
        if (theOne == null) {
            theOne = new Logic(); // We can only instantiate this Class once.
        }
        return theOne;
    }

    public void setData (int data) {
        ...
    }

}
class Main {
    public static void main () {
        Logic.getInstance.setData(10); // how we access the instance methods in other classes
    }
}
```


#### Pros:
- easy to apply
- effective in achieving its goal with minimal extra work
- provides an easy way to access the singleton object from anywhere in the code base

#### Cons:

- The singleton object acts like a global variable that increases coupling across the code base.
- In testing, it is difficult to **replace** Singleton objects with stubs (static methods cannot be overridden)
- In testing, singleton objects carry data from one test to another even when we want each test to be independent of the others.
- Constructor is private, so it cannot be subclassed


## Facade design pattern

Components need to access functionality deep inside other components.

- Goal: Include a Façade class that sits between the component internals and users of the component such that all access to the component happens through the Facade class.

Something like a handler which handles request and processes it in the backend

eg. ModelManager in AB4

#### Cons: 
- More complexities within the facade class


## Command design pattern

A system is required to execute a number of commands, each doing a different task. For example, a system might have to support Sort, List, Reset commands.

#### Solution:
The essential element of this pattern is to have a general << Command >> object that can be passed around, stored, executed, etc without knowing the type of command (i.e. via polymorphism).



## MVC design pattern

Purpose: To reduce coupling resulting from the interlinked nature of retrieval of information, displaying of info and modification of info. 

### Model, view, controller

- View: Displays data, interacts with the user, and pulls data from the model if necessary.
- Controller: Detects UI events such as mouse clicks, button pushes and takes follow up action. Updates/changes the model/view when necessary.
- Model: Stores and maintains data. Updates views if necessary.

## Observer design pattern

An object (possibly, more than one) is interested to get notified when a change happens to another object. That is, some objects want to ‘observe’ another object.
  
However, the 'observed' object does not want to be coupled to objects that are observing it.

### Pipeline

1. Implement the Observer interface on the objects we want to polymorph as observers (B and C)
2. Create an interface called Observer. In object A, we can add the other objects (B and C) into our observerList. 
3. Whenever data in object A changes, we can update all the objects (B and C) in the observerList.
4. Objects B and C can then pull data from object A.

Object A can now initiate an activity in B and C without being coupled to them.

- Note: We wrap these objects in an Observer interface to provide for the method to update.

## Abstraction occurence design pattern

To tackle the issues with duplication of data. Eg. Firebase having two entries of a user in seperate trees. If we change the username of the user, we will have to update the two trees.


#### Solution: 

Create an occurence class which extends the main class. This occurence class will only store the data that is different from the multiple occurences of this data (eg. serial number) which we wanna create. Main class will store the duplicate data (eg. Name of book). 
  
eg. Multiple similar books, we abstract out the book information but we create an occurence class which extends this, this occurence class will store the serial number

## Combination of design patterns

Design patterns can be combined and applied in a larger system. eg. MVC used for seperating model, controller and the UI. Observer can be used to determine how the model gets to update the view.

## Design patterns vs principles

Design principles have varying degrees of formality – rules, opinions, rules of thumb, observations, and axioms. Compared to design patterns, principles are more general, have wider applicability, with correspondingly greater overlap among them.

