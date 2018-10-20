# Libraries, Frameworks & Platforms


## Libraries

A library is a collection of modular code that is general and can be used by other programs.

## Frameworks

The overall structure and execution flow of a specific category of software systems can be very similar. The similarity is an opportunity to reuse at a high scale.

### Frameworks vs Libraries

- Libraries are meant to be used **‘as is’** while frameworks are meant to be customized/extended.  e.g., writing plugins for Eclipse so that it can be used as an IDE for different languages (C++, PHP, etc.), adding modules and themes to Drupal, and adding test cases to JUnit.

- Your code calls the library code while the **framework code calls your code**. Frameworks use a technique called inversion of control, aka the “Hollywood principle” (i.e. don’t call us, we’ll call you!). That is, you write code that will be called by the framework,  e.g. writing test methods that will be called by the JUnit framework. In the case of libraries, your code calls libraries.

## Platforms

A platform provides a runtime environment for applications.

- eg. iOS


