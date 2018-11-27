# Testing methods

1. Unit testing
2. Integration testing
3. System testing
4. Acceptance testing


## Stubs
It is like a bypass for us to bypass referencing getting a values from another class. We create the values instead.
- We can have the stub implement from an ```<<interface>>```
- Dependency injection
- Do polymorphism


## Unit testing

Testing of individual components of code. Can test a function just with some predefined test cases. Unit tests are also great for preventing regressions.

If there are dependencies then we create **stubs** to test the methods.

- example

```Java
    @Test
    public void constructor_nullPerson_throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        new AddCommand(null);
    }

    @Test
    public void execute_personAcceptedByModel_addSuccessful() throws Exception {
        ModelStubAcceptingPersonAdded modelStub = new ModelStubAcceptingPersonAdded();
        Person validPerson = new PersonBuilder().build();

        CommandResult commandResult = new AddCommand(validPerson).execute(modelStub, commandHistory);

        assertEquals(String.format(AddCommand.MESSAGE_SUCCESS, validPerson), commandResult.feedbackToUser);
        assertEquals(Arrays.asList(validPerson), modelStub.personsAdded);
        assertEquals(EMPTY_COMMAND_HISTORY, commandHistory);
    }

    @Test
    public void execute_duplicatePerson_throwsCommandException() throws Exception {
        Person validPerson = new PersonBuilder().build();
        AddCommand addCommand = new AddCommand(validPerson);
        ModelStub modelStub = new ModelStubWithPerson(validPerson);

        thrown.expect(CommandException.class);
        thrown.expectMessage(AddCommand.MESSAGE_DUPLICATE_PERSON);
        addCommand.execute(modelStub, commandHistory);
    }
```

## Integration testing

Testing of components are not isolated from others. Integration testing are usually slower and more complex.

WE replace the stubs with the actual objects

- example

```Java
    private Model model;
    private CommandHistory commandHistory = new CommandHistory();

    @Before
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    }

    @Test
    public void execute_newPerson_success() {
        Person validPerson = new PersonBuilder().build();

        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
        expectedModel.addPerson(validPerson);
        expectedModel.commitAddressBook();

        assertCommandSuccess(new AddCommand(validPerson), model, commandHistory,
                String.format(AddCommand.MESSAGE_SUCCESS, validPerson), expectedModel);
    }

    @Test
    public void execute_duplicatePerson_throwsCommandException() {
        Person personInList = model.getAddressBook().getPersonList().get(0);
        assertCommandFailure(new AddCommand(personInList), model, commandHistory,
                AddCommand.MESSAGE_DUPLICATE_PERSON);
    }
```


## Hybrid and unit integration testing

Test the dependencies first then use the dependencies to test the other methods.


## System testing

Black box software testing. System testing can be of functional testing and non-functional testing. Test cases and test data are made and the production data is not used in this type of testing. In system integration testing we integrate the different modules and test the interface between them to check the data integrity.

While execution of testing process the system correctness testing is performed by testers **(not end users)**.

```Java
    @Test
    public void add() {
        Model model = getModel();

        /* ------------------------ Perform add operations on the shown unfiltered list ----------------------------- */

        /* Case: add a person without tags to a non-empty address book, command with leading spaces and trailing spaces
         * -> added
         */
        Person toAdd = AMY;
        String command = "   " + AddCommand.COMMAND_WORD + "  " + NAME_DESC_AMY + "  " + PHONE_DESC_AMY + " "
                + EMAIL_DESC_AMY + "   " + ADDRESS_DESC_AMY + "   " + NOTE_DESC_AMY + "  " + TAG_DESC_FRIEND + " ";
        assertCommandSuccess(command, toAdd);
        ...


        /* Case: invalid tag -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
                + NOTE_DESC_AMY + INVALID_TAG_DESC;
        assertCommandFailure(command, Tag.MESSAGE_TAG_CONSTRAINTS);
    }

```

- Focus on both negative and positive test cases

## Accpeptance testing

Testing by end user. Testing with respect to user needs, requirements, and business processes conducted to determine whether or not a system satisfies the acceptance criteria and to check if the system is acceptable to the users.

Sometimes known as business user testing

- Testing by a legit person/ customer
- More focus on positive test cases

# Test case design

## Exhaustive testing

Not practical as it requires an massive/ infinite amount of test data.

Test cases should be **Efficient and Effective**

## Positive and negative test cases
A positive test case is when the test is designed to produce an expected/valid behavior. A negative test case is designed to produce a behavior that indicates an invalid/unexpected situation, such as an error message.

## Black box vs Glass box

- Black-box (aka specification-based or responsibility-based) approach: test cases are designed exclusively based on the SUT’s specified external behavior.
(cannot see the implementation inside)  
eg. Creating test cases based on user guide, we only know the expected outcome we dont need need to know the components that make it up.

- White-box (aka glass-box or structured or implementation-based) approach: test cases are designed based on what is known about the SUT’s implementation, i.e. the code.

- Gray-box approach: test case design uses some important information about the implementation. For example, if the implementation of a sort operation uses different algorithms to sort lists shorter than 1000 items and lists longer than 1000 items, more meaningful test cases can then be added to verify the correctness of both algorithms.


## Equivalence partitiion
Grouping of test inputs
  

A **group** of test inputs that are likely to be processed by the SUT in the same way. eg. 0...INT_MIN (-ve numbers), 1...INT_MAX, specified range for the function

- **avoid testing too many inputs from one partition**. Testing too many inputs from the same partition is unlikely to find new bugs. This increases the efficiency of testing by reducing redundant test cases. (eg. testing a function which accepts only 1...10, and we test with 11, 12, 13. There's no need to test with 12 and 13 as it is already going to give the same output as testing 11)

- **ensure all partitions are tested**. Missing partitions can result in bugs going unnoticed. This increases the effectiveness of testing by increasing the chance of finding bugs.

```
Consider the method duplicate(String s, int n): String which returns a String that contains s repeated n times.

Example EPs for s:

zero-length strings
string containing whitespaces
...
Example EPs for n:

0
negative values
...
```


## Boundary Value Analysis
design heuristic that is based on the observation that bugs often result from **incorrect handling of boundaries** of equivalence partitions.  

BVA suggests that when picking test inputs from an equivalence partition, values near boundaries (i.e. boundary values) are more likely to find bugs.

- eg. if upper bound is 10 we should test 9 and 11 as well


## Test heuristics (Combining test inputs)
- All combinations - generate test cases for each unique combination of test inputs (WARNING: Can be very large)
- At least once (eg. Each Valid Input at Least Once in a Positive Test Case, no more than one invalid input in a test case) - include each test input at least once
- All pairs - This strategy creates test cases so that for any **given pair** of inputs, all combinations between them are tested. It is based on the observations that a bug is rarely the result of more than two interacting factors. The resulting number of test cases is lower than the "all combinations" strategy, but higher than the "at least once" approach.
- Random - This strategy generates test cases using one of the other strategies and then pick a subset randomly (presumably because the original set of test cases is too big).
- There are other strategies that can be used
- Others - There are other strategies that can be used

### Main Heuristics to test
1. Each valid input at least once - Each valid input must appear at least once in a positive test case.
```
Assume 'a' is valid
- a, invalid, invalid // wrong - relying on just this alone, we will never know if there is a bug even though a is correct, as the invalid params will supersede the 'valid bug'
- a, valid, valid // right - a must appear at least once for a successful positive test case
```
Note: It is better to have only one invalid test input per test entry (and the rest will be valid test inputs) for positive testing. This is so that we will know what is the cause of the assertTrue failure.


2. No More Than One Invalid Input In A Test Case - only have one invalid input in a test case, the rest must be positive
```
============
T T X
T X T
X T T
============
X: invalid input
T: valid input
```

3. Mix - just mix them up to achieve a complete test