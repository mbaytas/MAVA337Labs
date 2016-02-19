### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Lab 2: Conditions and Object Interactions

This lab relates to the second lecture, where conditions and object interactions were covered. After this lab, you should be comfortable with these terms: **conditional statements**, **boolean**, **relational operators**, **logical operators**, **if statement**, **if-then-else**, **primitive type**, **object type**, **internal method**.

## Scenario: More Campus Parking Records

Campus security is very happy with the software you developed earlier. They would like you to add a few features to it. Specifically, they are planning to query your software every time a vehicle passes through the campus gates, and perform some checks to see whether or not they should be allowed into the campus.

### 1) Setting Up the Project

- Create a *New Project* called "Campus Parking Records v2".
- Create a *New Class* called `Car`.
- Copy the code inside your `Car` class from the previous lab, and paste it into the new `Car` class.

If you don't have this code from the previous lab, follow the instructions below. If you have your it, skip this batch of instructions.

- Declare four **instance variables** (a.k.a. member variables) inside your `Car` class - a `String` called `ownerName`, an `int` called ownerId, a `String` called `licencePlate`, and a `boolean` called isFeePaid.
- Write four **setter methods** (a.k.a. mutator methods) for your instance variables. These setters should each take one parameter called `newOwnerName`, `newOwnerId`, `newLicencePlate`, and `newIsFeePaid`; and assign the values of their parameter to the appropriate instance variable.
- Write a **constructor** that takes parameters called `initOwnerName`, `initOwnerId`, `initLicencePlate`, and `initIsFeePaid`; and assigns the values of these parameters to the appropriate instance variables.

Notice that there is a file called "Car.java" in this repo, which has "correct" code that does what your `Car` class should presently be doing. Compare your `Car` class with the code in this file.

Finally, remember last week's "debugging" task, where we had to deal with keeping track of a car's weight. For this lab, we also need to deal with the same information, but things will be a bit simpler:

- Add a new instance variable to your class - an `int` called `weight`.
- Write a setter method for `weight`. Call it `setWeight()`. It should take a parameter called `newWeight` and set the value of `weight` to the value of the parameter.
- Modify your **constructor** to set `weight` upon instantiation.

### 2) Conditionals

- Write a new blank method called `isAllowedIntoCampus()` that **returns** a `boolean` value.
- The very first line of code inside this method should declare a `boolean` variable called `isAllowed` and set it to `false`.
- The very last line of code inside this method should `return` the variable called `isAllowed`.

Inside this method, we will use **conditional statements** (a.k.a. **if statement**, **if-then-else statement**, etc.) to determine whether or not a car should be allowed into the campus. Remember that a conditional statement has the following general form:

    if (perform some test that gives a true or false result) {
        Do the statements here if the test gave a true result
    }
    else {
        Do the statements here if the test gave a false result
    }}

First off, the campus roads are not really "heavy-duty." Security needs to keep heavy vehicles off these roads.

- Write a blank conditional statement between where you declare `isAllowed` and where you return it.
- Fill in the conditional statement to check if the car's `weight` exceeds 2500 (kgs). Set `isAllowed` to `true` if the car is lighter than 2500 kgs, and set it to `false` if the car is too heavy.

The portion of the conditional statement that deals with heavy cars is done now. However, for cars of appropriate weight, we still need to check whether or not their owners have paid the parking fee.

- Delete the line inside your conditional statement where you set `isAllowed` to `true` for lighter cars.
- In its place, (*inside* the first conditional statement) write another conditional statement. This is called a **nested conditional statement** (a.k.a. **nested if statement** etc.).
- Use the nested if statement to check whether or not the parking fee has been paid for the car. Set `isAllowed` to `true` if it is. Set it to `false` if the fee has not been paid.

Now lets **test** this functionality:

- Instantiate a new `Car` object called `paidLightCar` which represents a car for which the parking fee has been paid. Set its `weight` to 1200.
- Make sure that `paidLightCar` is allowed into campus.
- Instantiate a new `Car` object called `unpaidLightCar` which represents a car for which the parking fee has -not* been paid. Set its `weight` to 1200.
- Make sure that `unpaidLightCar` is *not* allowed into campus.
- Instantiate a new `Car` object called `heavyCar` that weighs 3000 kg.
- Make sure that `heavyCar` is not allowed into the campus.
- Change the value of `isFeePaid` on `heavyCar`. Make sure it's still not allowed into campus.

Now your `Car` objects have an `isAllowdIntoCampus()` method that security can call to see who they should let in and who they should keep out.

### 3) Object Interactions

Notice that we are keeping information about the car's owner (their name and ID number) in two instance variables that belong to the `Car` class. This is not optimal, for many reasons. For example, a student can have more than one vehicle that they want to register for parking on campus. We may also want to extend our system in the future, to store more information about students. Thus, we will now create a new `Student` class and associate `Student` objects with our `Car` objects.

- Create a new class called `Student` with two instance variables: an `int` called `id` and a `String` called `name`.
- Write the constructor to set the student's name and ID upon instantiation.
- Write setter and getter methods for the two instance variables. Name these methods `getName()` and `getId()`.

Remember that the general form of simple a setter method (a.k.a. accessor) looks like the following:

    public type getVar() {
        return var;
    }

- In your `Car` class, delete the lines of code where you declare the `ownerName` and `ownerId` variables. Delete their setters also. Also delete the associated parameters required by the constructor, and delete the lines inside the constructor where you initialize them.
- Declare a new instance variable called `owner` of type `Student`.
- Write a setter method for `owner`.
- Require a parameter of type `Student` for the constructor. Inside the c'tor, assign this parameter as the `owner`.

Now let's test and see how this works:

- Come back to the main BlueJ window.
- Notice how BlueJ represents the association between the two classes - there is an arrow leading from the `Car` class to the `Student` class.
- Instantiate a new `Student` object called `studentOne`. Name this student "Ali".
- Instantiate a new `Car` object. Notice that now you need to provide a `Student` object create this object. Notice that you need to refer to the student using the *name of the variable*, not the name of the student.

### 4) External Method Calls

To improve the "student experience," the university administration now requires campus security to say hello to every student that drives into the campus, addressing them by name. Security would like you to modify the application so that it shows the name of the student when they drive through the gates.

Remember the `isAllowedIntoCampus()` method that security uses to check for parking permissions when a car approaches the gates? We will modify that method to show the student's name as well.

- Open up your `Car` class.
- Go to the method `isAllowedOnCampus()`. Change its return type to `void`.
- Delete the line of code in `isAllowedOnCampus()` that returns `isAllowed`. Do *not* delete the line where you declare `isAllowed`.

To show the student's name, we need to retrieve it by calling the `getName()` method we put into our `Student` objects.

- Add a line of code to your `isAllowedOnCampus()` method that instantiates a variable called `ownerName`, and assigns to it the name of the student that drives the car, retrieved using the accessor (getter) method on the `Student` object.

Remember that the student who owns the car is represented by the `owner` variable in the `Car` class.

- Inside `isAllowedOnCampus()`, write an if statement *after* the first one. This if statement should check the value of `isAllowed`.
- Depending on the value of `isAllowed`, inside your second if statement, you will prepare a string of text that informs security of the name of the car's owner, and whether or not they are allowed to park on campus. To store this string, declare a variable called `messageString` at the beginning of the code for your method.
- Inside your second if statement, set the message string depending on the value of `isAllowed`.

To make a nice, readable message, you will have to use a technique called **string concatenation** where you add two strings together. The line of code that does this should look like the following:

    messageString = ownerName + " is allowed to park on campus."

There are exactly two places in your code where such instructions should appear. For one of them, you should change the second part of the string to say that the person is *not* allowed to park on campus.

Now we will have some fun.

- Between the documentation and your class declaration, place the following line of code:

    import javax.swing.JOptionPane;

> This means: you are "importing" the JOptionPane class from the Swing **library**. You will now be able to use the functionality inside the JOptionPane class in your own application.

- *After* the second if statement where you composed the `messageString`, where the `return` statement used to be, add the following line:

    JOptionPane.showMessageDialog(null, messageString);

Let's break down this line of code. `JOptionPane.showMessageDialog()` calls the `showMessageDialog()` method from the `JOptionPane` class that we had previously **imported** into the project. We are passing two parameters to the `showMessageDialog()` method. The first is a `null` object that actually refers to a "parent component" for the "message dialog" we are about to create. We are not specifying a "parent component," hence, we provide `null`. The second parameter is the text that specifies what message will be displayed.


### (Bonus Material)