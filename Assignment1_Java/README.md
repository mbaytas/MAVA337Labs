### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Assignment 1: Java

This homework assignment concludes our coverage of the first programming language you learn through this course: Java. We will collect and grade your work. The grading rubric is given below.

The lectures, lecture slides, and labs should cover all of the information that you need to complete this assignment. Feel free to consult any course materials or outside sources. Feel free to use code you have written before.

> You will notice there are a lot of technical terms in the instructions. This is intentional. Most of what programmers do today is piecing together bits and pieces of code they find online. To find these bits and pieces, you need to search for the right keywords. You want to know the language of programming, not a particular programming language.

### Submission Instructions

Name the project directory `1_Java_YourName`. Compress it into a `.zip` file with the same name. E-mail it to the instructor and the TA.

### Grading Rubric

- Working code for Part 1: 3 points
- Working code for Part 2: 3 points
- Working code for Part 3: 2 points
- Working code for Part 4: 10 points
- Comments on classes and methods explaining what they do: 2 points
- Properly indented code: 4 points
- All variable and method names in proper lower camel case: 1 point

These add up to 25 points, which represents 25% of your final grade from this course.

#### Bonus points:

- Comments in [Javadoc](http://www.oracle.com/technetwork/articles/java/index-137868.html) format: 1 point
- Conforming to [this Java Programming Style Guide](http://www.javaranch.com/styleLong.jsp): 2 points

We will not be automatically checking your work for these. If you have put in the effort to get these bonus points, please tell us in the e-mail as you submit your work.

## Scenario

Remember that throughout the lab sessions, you have been developing software for the university's registrar and campus security. The university administration is impressed with your software and they have contracted you to develop an integrated application to manage student information. This involves cleaning up the code you wrote before, and connecting its various parts together.

### 0) Preparation

Create a new project in BlueJ. The three classes that make up your assignment project will live together inside of this project.

### 1) Students

Write a class called `Student` that represents the following information about a student:

- first name
- last name
- university id number

This information should be held in 3 instance variables, which are accessible from outside the class by the appropriate getter and setter methods. All three of them should be initialized upon instantiation of new `Student` objects, via the constructor (as parameters).

### 2) Courses

Write a class called `Course` that can store the following information in instance variables:

- the three-digit course number
- the name of the course
- a list of the students taking the course

Include getter and setter methods for the name and number of the course. Require them as parameters for the constructor and initialize them therein.

For the list of students taking the course, use a `list` of `Student`s. Upon instantiation of `Course` objects, initialize this list with a default length of 10. Omit the usual getter and setter methods. Only declare and initialize the list. We will deal with it later.

Finally, write a method called `getYear()` that returns the first digit of the course number as an `int`.

### 3) Parking

Write a class called `Car` that can store the following information:

- make (e.g. "VW", "Renault", "Koenigsegg", etc.)
- owner (a `Student`!)

Include getter and setter methods for these variables. Require and initialize them in the constructor.

### 4) Integration

Now you will connect the `Student`, `Course`, and `Car` classes together to create some useful parts of an application. Both of the `Course` and `Car` classes will talk to the `Student` class.

#### `Course`

Remember how we omitted the getter and setter methods for the `list` of `Student`s? Those were the [good times](https://youtu.be/rTusMLs9SJE). Add the following to the `Course` class:

- a method called `StudentsToString()` that returns a `String` with the **names** of the students in the list, seperated by newlines
- a method called `addStudent()` that adds a `Student` object (as a parameter) to the list, returns `true` if the operation is successful, and returns `false` if the list is full
- a method that called `removeStudent()` finds and removes a `Student` object (as a parameter) from the list, returns `true` if the operation is successful, and returns `false` if there aren't any students by the specified name in the course list

#### `Student`

Add the following to the `Student` class:

- a method called `takeCourse()` that requires a `Course` object as a parameter, uses the `addStudent()` method on the `Course` object to add the student to the course list, returns `true` if the operation is successful, and returns `false` if the list is full (hint: `addStudent()` already should return the appropriate value)
- an instance variable, type `ArrayList` of `int`s, called `parkingTickets`
- a method called `addParkingTicket()` that requires an `int` as a parameter and appends this `int` to `parkingTickets`

#### `Car`

Add the following to the `Car` class:

- a method called `punish()` that requires an `int` as a parameter and uses the `addParkingTicket()` function on the `Student` who owns the car to append the `int` to their `ArrayList` of parking tickets