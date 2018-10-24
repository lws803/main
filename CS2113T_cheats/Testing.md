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


## Accpeptance testing

Testing by end user. Testing with respect to user needs, requirements, and business processes conducted to determine whether or not a system satisfies the acceptance criteria and to check if the system is acceptable to the users.

Sometimes known as business user testing

- Testing by a legit person

# Test case design

## Exhaustive testing

Not practical as it requires an massive/ infinite amount of test data.

Test cases should be **Efficient and Effective**

## Positive and negative test cases
A positive test case is when the test is designed to produce an expected/valid behavior. A negative test case is designed to produce a behavior that indicates an invalid/unexpected situation, such as an error message.

## Black box vs Glass box

- Black-box (aka specification-based or responsibility-based) approach: test cases are designed exclusively based on the SUT’s specified external behavior.
(cannot see the implementation inside)

- White-box (aka glass-box or structured or implementation-based) approach: test cases are designed based on what is known about the SUT’s implementation, i.e. the code.

- Gray-box approach: test case design uses some important information about the implementation. For example, if the implementation of a sort operation uses different algorithms to sort lists shorter than 1000 items and lists longer than 1000 items, more meaningful test cases can then be added to verify the correctness of both algorithms.

- Glass box approach: Can see the implementation inside

## Equivalence partitiion
A **group** of test inputs that are likely to be processed by the SUT in the same way. eg. 0...INT_MIN (-ve numbers), 1...INT_MAX, specified range for the function

- **avoid testing too many inputs from one partition**. Testing too many inputs from the same partition is unlikely to find new bugs. This increases the efficiency of testing by reducing redundant test cases.

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


