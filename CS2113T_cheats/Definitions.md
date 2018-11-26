# Definitions

### Software engineering and programming paradigms
1. Procedural programming paradigm - programming paradigm based upon the concept of procedure calls, in which statements are structured into procedures `eg. C++`
2. Functional programming paradigm - a style of building the structure and elements of computer programs—that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data `eg. F#, Scala, Haskell`
3. Logic programming paradigm - Logic programming is a type of programming paradigm which is largely based on formal logic `eg. Prolog`
4. Objects - every object has both state and behavriour
5. Interface - an interface where other objects can interact with `eg. buttons of a calculator`
- An interface is a behavior specification
- You cannot instantiate an interface
6. Implementation - supports the interface but may not be accessible to other objects `eg. circuit of a calculator`
7. Encapsulation - An object is an encapsulation of some data and related behavior in two aspects
- The packaging aspect: An object packages data and related behavior together into one self-contained unit
- The information hiding aspect: The data in an object is hidden from the outside world and are only accessible using the object's interface.
8. Class - contains instructions for creating a specific kind of objects
9. Enumerations - An Enumeration is a fixed set of values that can be considered as a data type
10. Associations - Objects in an OO solution need to be connected to each other to form a network so that they can interact with each other. Such connections between objects are called associations.
11. Navigability - The concept of which class in the association knows about the other class is called navigability. `eg. Can we access object B from object A`
12. Multiplicity - Multiplicity is the aspect of an OOP solution that dictates how many objects take part in each association.
13. Bi-directional association - Bi-directional associations require matching variables in both classes `eg. instantiation of each other in each other's class`
14. Dependencies - a dependency is a need for one class to depend on another without having a direction association with it 
```
eg. an instantiation of another class in a function, not as an attribute in the class or setting a 
eg. parameters of another class type
```
15. Composition - A composition is an association that represents a strong whole-part relationship. When the whole is destroyed, the part is destroyed to.
16. Association classes - An association class represents additional information about an association. It plays the role of storing the association between 2 objects
17. Inheritance - The OOP concept Inheritance allows you to define a new class based on an existing class. `Note: Child class must be able to do everything parent class can do`
- A superclass is said to be more general than the subclass
18. Overriding - Method overriding is when a sub-class changes the behavior inherited from the parent class
19. Overloading - Method overloading is when there are multiple methods with the same name but different type signatures
20. Abstract class - A class declared as an abstract class cannot be instantiated, but they can be subclassed
- You can use declare a class as abstract when a class is merely a representation of commonalities among its subclasses
- Abstract classes are used for protyping
21. Substitutability - Every instance of a subclass is an instance of the superclass, but not vice-versa.
22. Dynamic binding - a mechanism where method calls in code are resolved at runtime `eg. overriden method, as it only overrides when the object instantiates`
23. Static binding - a mechanism where method calls in code are resolved at compile time `eg. overloaded methods`
24. Polymorphism - The ability of different objects to respond, each in its own way, to identical messages is called polymorphism. `eg. storing an array of animals`
```
- Substitutability: Because of substitutability, you can write code that expects object of a parent class and yet use that code with objects of child classes. That is how polymorphism is able to treat objects of different types as one type.
- Overriding: To get polymorphic behavior from an operation, the operation in the superclass needs to be overridden in each of the subclasses. That is how overriding allows objects of different subclasses to display different behaviors in response to the same method call.
- Dynamic binding: Calls to overridden methods are bound to the implementation of the actual object's class dynamically during the runtime. That is how the polymorphic code can call the method of the parent class and yet execute the implementation of the child class.
```

### Requirements
1. Requirement - A software requirement specifies a need to be fulfilled by the software product
2. brown-field project - develop a product to replace/update an existing software product
3. green-field project - develop a totally new system with no precedent
4. Stakeholder -  party that is potentially affected by the software project. e.g. users, sponsors, developers, interest groups, government agencies, etc
5. Non functional requirements - specify the constraints under which system is developed and operated `eg. the system must be able to accomadate 100,000 users at one time`
6. Functional requirements - specify what the system should do.
7. Prioritisation of requirements - Requirements can be prioritized based the importance and urgency
8. Quality of requirements
```
Unambiguous
Testable (verifiable)
Clear (concise, terse, simple, precise)
Correct
Understandable
Feasible (realistic, possible)
Independent
Atomic
Necessary
Implementation-free (i.e. abstract)

Besides these criteria for individual requirements, the set of requirements as a whole should be

Consistent
Non-redundant
Complete

```
9. Brainstorming - A group activity designed to generate a large number of diverse and creative ideas for the solution of a problem.
10. User surveys - Surveys can be used to solicit responses and opinions from a large number of stakeholders
11. Observation.- Observing users in their natural work environment can uncover product requirements
12. Interviews - Interviewing stakeholders and domain experts can produce useful information that project requirements
13. Focus groups - Focus groups are a kind of informal interview within an interactive group setting
14. Prose - A textual description used to describe requirements
15. Feature list - A list of features of a product grouped according to some criteria such as aspect, priority, order of delivery, etc
16. User stories - User stories are short, simple descriptions of a feature told from the perspective of the person who desires the new capability, usually a user or customer of the system
17. Use cases - A description of a set of sequences of actions, including variants, that a system performs to yield an observable result of value to an actor
- Use case can contain a preconditions
- A use case describes only the externally visible behavior, not internal details, of a s
18. Actor - An actor (in a use case) is a role played by a user. An actor can be a human or another system. Actors are not part of the system; they reside outside the system.
- A use case can involve multiple actors.
19. Main Success Scenario (MSS) - describes the most straightforward interaction for a given use case, which assumes that nothing goes wrong
- Use extensions to describe what if something goes wrong.
- Use extensions to show alternate paths
20. Preconditions - specify the specific state we expect the system to be in before the use case starts.
21. Guarantees - specify what the use case promises to give us at the end of its operation.
22. supplementary requirements - section can be used to capture requirements that do not fit elsewhere

### Software design

1. Abstraction - is a technique for dealing with complexity. 
2. Coupling - Coupling is a measure of the degree of dependence
3. Cohesion - measure of how strongly-related and focused the various responsibilities of a component are.
4. Model - A model is a representation of something else.
5. Object oriented domain models - Class diagrams are used to model the problem domain are called conceptual class diagrams or OO domain models (OODMs)
6. Software architecture - The software architecture shows the overall organization of the system and can be viewed as a very high-level design
7. Architecture diagrams - Architecture diagrams are free-form diagrams
8. Architectural styles - follow various high-level styles (aka architectural patterns)
9. N-tier architecture styles - In the n-tier style, higher layers make use of services provided by lower layers
10. Client-server architectural style - The client-server style has at least one component playing the role of a server and at least one client component accessing the services of the server
11. Transaction Processing Architectural Style - The transaction processing style divides the workload of the system down to a number of transactions which are then given to a dispatcher that controls the execution of each transaction
12. Service oriented architectural style - The service-oriented architecture (SOA) style builds applications by combining functionalities packaged as programmatically accessible services
13. Event-driven Architectural Style - Event-driven style controls the flow of the application by detecting events from event emitters and communicating those events to interested event consumers 
14. Design patterns - An elegant reusable solution to a commonly recurring problem within a given context in software design.
15. Singleton pattern - A certain classes should have no more than just one instance
16. Facade pattern - A class which all access to the components must go through the facade class first
17. Command pattern - A system is required to execute a number of commands, each doing a different task. For example, a system might have to support Sort, List, Reset commands.
18. Model View Controller (MVC) Pattern - Most applications support storage/retrieval of information, displaying of information to the user (often via multiple UIs having different formats), and changing stored information based on external inputs.
- Uses seperation of concerns to create a pattern
- To decouple data, presentation, and control logic of an application by separating them into three different components: Model, View and Controller.
19. Observer pattern - A system of observers/ listeners that can be triggered when something happens to the component that these observers are observing
20. Multi-Level Design - Multiple designs meant to represent a big system
21. Top-Down and Bottom-Up Design
```
- Top-down: Design the high-level design first and flesh out the lower levels later. This is especially useful when designing big and novel systems where the high-level design needs to be stable before lower levels can be designed.

- Bottom-up: Design lower level components first and put them together to create the higher-level systems later. This is not usually scalable for bigger systems. One instance where this approach might work is when designing a variations of an existing system or re-purposing existing components to build a new system.

- Mix: Design the top levels using the top-down approach but switch to a bottom-up approach when designing the bottom levels.
```
22. Agile Design - Agile designs are emergent, they’re not defined up front. Overall system will emerge overtime

### Implementation

1. IDEs - integrated development environment

##### Consists of:
- A source code editor that includes features such as syntax coloring, auto-completion, easy code navigation, error highlighting, and code-snippet generation.
- A compiler and/or an interpreter (together with other build automation support) that facilitates the compilation/linking/running/deployment of a program.
- A debugger that allows the developer to execute the program one step at a time to observe the run-time behavior in order to locate bugs.
- Other tools that aid various aspects of coding e.g. support for automated testing, drag-and-drop construction of UI components, version management support, simulation of the target runtime platform, and modeling support.

2. Debugging - is the process of discovering defects in the program
3. KISSing - keep it simple, stupid” (KISS). Do not try to write ‘clever’ code
4. SLAP - Avoid varying the level of abstraction within a code fragment
5. Refactoring - process of improving a program's internal structure in small steps without modifying its external behavior.
- Consolidate Duplicate Conditional Fragments
- Extract Method
6. Exceptions - Exceptions are used to deal with 'unusual' but not entirely unexpected situations
7. Assertion - An assertion can be used to express something like when the execution comes to this point, the variable v cannot be null
8. Logging - Logging is the deliberate recording of certain information during a program execution for future reference
9. Defensive programming - Coding to eliminate room for error. `eg. adding in assert statements in a method to deal with problems with function parameters`
10. Integration - Combining parts of a software product to form a whole is called integration
- Late and One Time' vs 'Early and Frequent - wait till all components are completed and integrate all finished components near the end of the project.
- Early and frequent - integrate early and evolve each part in parallel, in small steps, re-integrating frequently
- Big bang - integrate all components at the same time
- Incremental - integrate few components at a time
11. Build automation - Build automation tools automate the steps of the build process, usually by means of build scripts
12. Continuous Integration - integration, building, and testing happens automatically after each code change
13. Continuous Deployment - changes are not only integrated continuously, but also deployed to end-users at the same time
14. Reuse - By reusing tried-and-tested components, the robustness of a new software system can be enhanced while reducing the manpower and time requirement
15. APIs - An Application Programming Interface (API) specifies the interface through which other programs can interact with a software component
16. Libraries - A library is a collection of modular code that is general and can be used by other programs.
17. Frameworks - The overall structure and execution flow of a specific category of software systems can be very similar. The similarity is an opportunity to reuse at a high scale `Note: in a framework, you design the code for the framework to RUN your code, Hollywood principle`
`eg. JUnit, Tensorflow`
18. Platforms - A platform provides a runtime environment for applications `eg. Java, iOS, Nodejs`
19. 
