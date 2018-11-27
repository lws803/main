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

### Quality Assurance
1. **Quality Assurance** - Validation + Verification
2. **Validation** - Are we building the right system? - are requirements correct
3. **Verification** - Are we building the system correctly? - are requirements implemented correctly
4. **Code review** - systematic examination code with the intention of finding where the code can be improved.

##### Consists of:
- **Pair Programming**: when two programmers work on the same code at the same time, there is an implicit review of the code by the other member of the pair.
- **Pull Request reviews**: GitHub and BitBucket allows the new code to be proposed as Pull Requests and provides the ability for others to review the code in the PR.
- **Formal Inspections**: uses mathematical techniques to prove the correctness of a program and can be used to prove the absence of errors.

5. **Static Analysis** - analysis of code without actually executing the code. `e.g. CheckStyle, PMD, FindBugs for Java`
6. **Linters** - subset of static analyzers that specifically aim to locate areas where the code can be made `cleaner`.
7. **Testing** - operating a system or component under specified conditions, observing or recording the results, and making an evaluation
8. **Test case** - specifies how to perform a test. At a minimum, it specifies the input to the software under test (SUT) and the expected behavior.
9. **Failure** - caused by a defect (or a bug).
10. **Testability** - Indication of how easy it is to test an SUT
11. **Unit Testing** - testing individual units (methods, classes, subsystems, ...) to ensure each piece works correctly.
12. **Stubs** - can isolate the SUT from its dependencies to create a pure unit test. It has the same interface as the component it replaces, but its implementation is so simple that it is unlikely to have any bugs. It mimics the responses of the component, but only for the a limited set of predetermined inputs. Other examples are `mocks, fakes, dummies, spies`.
13. **Integration Testing** - testing whether different parts of the software work together (i.e. integrates) as expected.Integration tests are run using the actual dependencies, not any stubs. 
14. **System Testing** - take the whole system and test it against the system specification. They are based on the specified external behavior of the system and can test non-functional requirements too `e.g. Performance Testing, Load Testing, Security Testing`. System testing is typically more extensive than acceptance testing.
15. **Alpha Testing** - performed by the users, under controlled conditions set by the software development team.
16. **Beta Testing** - performed by a selected subset of target users of the system in their natural work setting.
17. **Dog fooding** - creators of a product use their own product to test the product.
18. **Developer testing** - testing done by the developers themselves
19. **Scripted testing** - write a set of test cases based on the expected behavior of the SUT, and then perform testing based on that set of test cases.
20. **Exploratory testing** - devise test cases on-the-fly, creating new test cases based on the results of the past test cases. Also known as `eactive testing, error guessing technique, attack-based testing, and bug hunting.`
21. **Acceptance testing** - test the delivered system to ensure it meets the user requirements.
22. **Regression** - code modifications may result in some unintended and undesirable effects on the system.
23. **Regression testing** - re-testing the software to detect regressions.
24. **Test Drivers** - code that ‘drives’ the SUT for the purpose of testing.
25. **Test Automation Tools** - tool for automated testing of Java programs `e.g. JUnit`. GUI Testing (which is harder than CLI testing) can also be automated using automated tools such as `TestFx, VisualStudio, Selenium`.
26. **Test coverage** - metric used to measure the extent to which testing exercises the code.

##### Consists of:
- **Function/method coverage** - based on functions executed.
- **Statement coverage** - number of line of code executed
- **Decision/branch coverage** - based on the decision points exercised. Code is completely test if 100% branch coverage is achieved.
- **Condition coverage** - based on the boolean sub-expressions, each evaluated to both true and false with different test cases. 
- **Path coverage** - measures coverage in terms of possible paths through a given part of the code executed. 100% path coverage means all possible paths have been executed.
- **Entry/Exit coverage** - measures coverage in terms of possible calls to and exits from the operations in the SUT.

27. **Coverage analysis tools** - measures test coverage of a piece of code. 
28. **Dependency Injection** - process of 'injecting' objects to replace current dependencies with a different object. Polymorphism is used to implement dependency injection. 
29. **Test Driven Development (TDD)** - writing the tests before writing the SUT, while evolving functionality and tests in small increments.
30. **Effective tests** - finds a high percentage of existing bugs.
31. **Efficient tests** - has a high rate of success (bugs found/test cases).
32. **Positive Test case** - test is designed to produce an expected/valid behavior.
33. **Negative Test case** - designed to produce a behavior that indicates an invalid/unexpected situation, such as an error message.
34. **Black box testing** - test cases are designed exclusively based on the SUT’s specified external behavior.
35. **White/Glass box testing** -  test cases are designed based on what is known about the SUT’s implementation, i.e. the code.
36. **Grey box testing** - test case design uses some important information about the implementation. 
37. **Equivalence partitions** - a group of test inputs that are likely to be processed by the SUT in the same way. Usually derived from the specifications of the SUT. 
38. **Boundary Value Analysis** - test case design heuristic that is based on the observation that bugs often result from incorrect handling of boundaries of equivalence partitions. It states that values near boundaries (i.e. boundary values) are more likely to find bugs: one value from the boundary, one value just below the boundary, and one value just above the boundary.

##### Common test case heuristics
- Each valid input at least once in a positive test case
- No more than one invalid input in a test case
- Use cases can be used for system testing and acceptance testing.

### Project Management
1. **Revision Control** - process of managing multiple versions of a piece of information.
2. **Revision Control Software (RCS)** - software tools that automate the process of Revision Control i.e. managing revisions of software artifacts.
3. **Revision** - a state of a piece of information at a specific time that is a result of some changes to it.
4. **Repository** - the database of the history of a directory being tracked by an RCS software `e.g. Git`.
5. **Commit** - saves a snapshot of the current state of the tracked files in the revision control history.
6. **Stage** - lets you choose the specific changes to commit
7. **Tag** - Allows you to tag a specific commit with a easily identifiable name
8. **Ignore** - RCS which ignore the changes made to these files
9. **Diff** - Can check what changed between two points in history (i.e. difference between two commits)
10. **Checkout** - Restores the state of the working directory at a commit in the past
11. **Remote repo** - Copies of a repo that are hosted on remote computers
12. **Clone** - allows you to clone a remote repo onto your computer
13. **Push** - copies the new commits from your local computer to the remote repo
14. **Pull** - syncs your local repo with the latest changes to the remote repo
15. **Fork** - creates a remote copy of a remote repo
16. **Pull Request** - mechanism for contributing code to a remote repo
17. **Branching** - process of evolving mutiple versions of the software in parallel
18. **Merge** - process of merging two branches together
19. **Merge conflicts** - occur when you try to merge two branches that had changed the same part of the code
20. **Centralized RCS (CRCS)** - uses a central remote repo that is shared by the team. 
21. **Distributed RCS (DRCS)** - allows multiple remote repos and pulling and pushing can be done among them in arbitrary ways.
22. **Forking workflow** - the 'official' version of the software is kept in a remote repo designated as the 'main repo'. All team members fork the main repo and create pull requests from their fork to the main repo.
23. **Feature Branch workflow** - similar to forking workflow except there are no forks. Everyone is pushing/pulling from the same remote repo.
24. **Centralized workflow** - similar to the feature branch workflow except all changes are done in the master branch.
25. **Work Breakdown Structure (WBS)** - depicts information about tasks and their details in terms of subtasks.
26. **Milestone** - the end of a stage which indicates a significant progress.
27. **Buffer** - time set aside to absorb any unforeseen delays. However, do not inflate task estimates to create hidden buffers; have explicit buffers instead
28. **Issue trackers** - are commonly used to track task assignment and progress.
29. **GANTT chart** - 2-D bar-chart, drawn as time vs tasks.
30. **PERT (Programme Evaluation Review Technique) chart** - uses a graphical technique to show the order/sequence of tasks.
31. **Critical path** - path in which any delay can directly affect the project duration. It is important to ensure tasks on the critical path are completed on time.
32. **Egoless team** - every team member is equal in terms of responsibility and accountability.
33. **Chief-programmer** - there is a single authoritative figure, the chief programmer.
34. **Strict-hierarchy** - a strictly defined organization among the team members.
35. **Software Development Life Cycle (SLDC)** - different stages of software development such as requirements, analysis, design, implementation and testing.
36. **Sequential Model** - called the waterfall model, models software development as a linear process, in which the project is seen as progressing steadily in one direction through the development stages. 

	- When one stage of the process is completed, it should produce some artifacts to be used in the next stage.
	- This could be a useful model when the problem statement that is well-understood and stable.
	- Major problem with this model is that requirements of a real-world project are rarely well-understood at the beginning and keep changing over time.

37. **Iterative Model** - advocates having several iterations of SDLC.
	
	- Each of the iterations produces a new version of the product.
	- Can take a breadth-first or a depth-first approach to iteration planning. Most projects use a mixture of breadth-first and depth-first iterations.

38. **Breadth first** - an iteration evolves all major components in parallel.
39. **Depth first** - an iteration focuses on fleshing out only some components.
40. **Agile model** - Requirements are prioritized based on the needs of the user, are clarified regularly (at times almost on a daily basis) with the entire project team, and are factored into the development schedule as appropriate. Two agile processes today are `XP` and `Scrum`
41. **XP** - Extreme Programming (XP) stresses customer satisfaction. Instead of delivering everything you could possibly want on some date far in the future, this process delivers the software you need as you need it.

##### Consists of:
- Teamwork
- Communication, simplicity, feedback, respect, and courage
- Has a set of simple rules

42. **Scrum** - process skeleton that contains sets of practices and predefined roles.

##### Consists of:
- The Scrum Master, who maintains the processes (typically in lieu of a project manager)
- The Product Owner, who represents the stakeholders and the business
- The Team, a cross-functional group who do the actual analysis, design, implementation, testing, etc.
- Sprints: basic unit of development in Scrum
- Daily sprint meetings
- Each sprint results in a potentially deliverable product feature
- A key principle of Scrum is its recognition that during a project the customers can change their minds about what they want and need

43. **Unified process** - consists of four phases: inception, elaboration, construction and transition. It is a flexible and customizable process model framework rather than a single fixed process.
44. **Capability Maturity Model Integration (CMMI)** - provides organizations with the essential elements of effective processes, which will improve their performance.

### Tools - UML

1. Class diagrams

##### What it is:
- UML class diagrams describe the structure (but not the behavior) of an OOP solution.

##### Consists of:
- Classes
- Associations - a solid line, augmented with arrow-heads[navigatability], role labels, association labels, multiplicities
- Dependencies - dependancies
- Enumerations - `<<[enum]>>`
- Class level members - underlines denote class-level attributes and variables
- Association classes - shows a 3rd class that connects 2 elements
- Composition - a `book` consists of `chapter` objects, when the `book` object is destroyed, its `chapter` objects are destroyed too.
- Aggregation
- Class Inheritance
- Interfaces
- Abstract Classes

2. Sequence Diagrams

##### What it is:
- UML sequence diagrams captures the interactions between multiple objects for a given scenario.

##### Typically Consists of:
- Entities - Actors or compoenents involved in the interaction
- Operation - Invoked (Solid arrows)
- Activation bar - Period during which the instance is in control of the execution
- Lifeline - shows that the instance is alive
- Return value - returns control and possibly some return value (Dashed arrows)

##### Operations:
- Object creation
- Object deletion
- Loops
- Self invocation - UML can show a method of an object calling another of its own methods
- Alternative paths - UML uses `alt` frames to indicate alternative paths
- Optional paths - UML uses `opt` frames to indicate optional paths
- Parallel paths - UML uses `par` frames to indicate parallel paths
- Reference frames - UML uses `ref` frames to allow a segment of the interaction to be omitted and shown as a separate sequence diagram. Reference frames help to break complicated sequence diagrams into `multiple parts` or `simply to omit details we are not interested in showing.`

3. Object Diagrams

##### What it is:
- UML object diagrams shows an object structure at a given point of time.

##### Typically Consists of:
- `objectName:ClassName` ARE UNDERLINED
- Objects - `objectName:ClassName` , no compartment for methods.
- Associations - represented by a solid line

4. Activity Diagrams

##### What it is:
- UML activity diagrams model workflows.

##### Typically Consists of:
- Action - represented with rectangles with rounded corners
- control flow - shows the flow of control from one action to the next. Shown by drawing a lone with an arrow-head to show the direction of the flow.
- Start node and end node - end node is a circle with a dot inside, start node is a filled in circle
- Branch node and merge node - shows the start and end of alternate paths. Contains `GUARD CONDITIONS`: a boolean condition that should be true for execution to take that path. 
- Fork node and Join node - Represented with bars. Set of parallel paths, execution along all parallel paths should be complete before the execution can start on the outgoing control flow of the join.
- Rake - the rake notation is used to indicate that a part of the activity is given as a separate diagram.
- Swimlanes - It is possible to partition an activity diagram to show who is doing which action. Such partitioned activity diagrams are sometimes called swimlane diagrams.

5. Notes

##### What it is:
- UML notes can augment UML diagrams with additional information. literally a note that can be connected to an element.

##### Typically Consists of:
- Constraints - represented with curly braces

6. Miscellaneous

Object diagrams difference:
- Methods are omitted
- Multiplicities are omitted
- Instance name may be shown
- There is a `:` before the class name
- Instance and class names are underlined

[NOTE]
Multiple object diagrams can correspond to a single class diagram.

### Principles

1. Single responsibility principle - a class should have one, and only one, reason to change.
2. Open-closed principle - a module should be open for extention but closed for modification. That is, modules should be written so that they can be extended, without requiring them to be modified.
3. Liskov Substitution Principle - Derived classes must be substitutable for their base classes WITHOUT NEGATIVE SIDE EFFECTS.
4. Interface Segregation Principle - No client should be forced to depend on methods it does not use.
5. Dependancy Inversion Principle - 1. High-level modules should not depend on low-level modules, both should depend on abstractions. 2. Abstractions should not depend on details. Details should depend on abstractions.
6. Seperation of Concerns Principle - To achieve better modularity, separate the code into distinct sections, such that each section addresses a separate concern.
7. Law of Demeter - an object should have limited knowledge of another object. - an object should only interact with objects that are closely related to it.
8. You Aren't Gonna Need It (YAGNI) principle - Do not add code because you might need it in the future
9. Don't Repeat Yourself (DRY) principle - Every piece of knowledge must have a single, unambiguous, authoritative representation within a system
10. Brook's Law - Adding people to a late project will make it later.
11. SOLID Principles - Single responsibility principle, Open-closed principle, Liskov Substitution Principle, Interface Segregation Principle, Dependancy Inversion Principle
