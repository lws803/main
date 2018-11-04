# Design patterns

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

1. Create an interface called Observer. In object A, we can add the other objects (B and C) into our observerList. 
2. Whenever data in our current object changes, we can update all the objects (B and C) in the observerList.
3. Objects B and C can then pull data from object A.

Object A can now initiate an activity in B and C without being coupled to them.

- Note: We wrap these objects in a ConcreteObserver interface to provide for the method to update.

## Abstraction occurence design pattern

To tackle the issues with duplication of data. Eg. Firebase having two entries of a user in seperate trees. If we change the username of the user, we will have to update the two trees.


#### Solution: 

Create an occurence class which extends the main class. This occurence class will only store the data that is different from the multiple occurences of this data (eg. serial number) which we wanna create. Main class will store the duplicate data (eg. Name of book). 


## Combination of design patterns

Design patterns can be combined and applied in a larger system. eg. MVC used for seperating model, controller and the UI. Observer can be used to determine how the model gets to update the view.

## Design patterns vs principles

Design principles have varying degrees of formality – rules, opinions, rules of thumb, observations, and axioms. Compared to design patterns, principles are more general, have wider applicability, with correspondingly greater overlap among them.

