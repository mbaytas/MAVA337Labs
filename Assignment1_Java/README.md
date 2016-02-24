### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Assignment 1: Java

This homework assignment concludes our coverage of the first programming language you learn through this course: Java. We will collect and grade your work. The grading rubric is given below.

The lectures, lecture slides, and labs should cover all of the information that you need to complete this assignment. Feel free to consult any course materials or outside sources. Feel free to use code you have written before.

> You will notice there are a lot of technical terms in the instructions. This is intentional. Most of what programmers do today is piecing together bits and pieces of code they find online. To find these bits and pieces, you need to search for the right keywords. You want to know the language of programming, not a particular programming language.

### Academic Honesty

You are expected to observe the code of academic honesty that is included in the course syllabus. Please don't copy each other's work. We will know if you do. However, we will not be able to know who supplied the code and who copied it, so both parties will suffer if we detect cheating.

Remember that you can rely on any resources, including any code you find online. We have written up these labs and assignments from scratch, so we are pretty confident that you will not find a complete solution to them anywhere else. However, you may find it convenient to use little **snippets** of code written by other people and published online. If you do this, *put a comment in your code which says where you got the snippet from (provide a link), and what exactly it does*.

### Submission Instructions

Name the project directory `1_Java_YourName`. Compress it into a `.zip` file with the same name. E-mail it to the instructor and the TA (see the syllabus for the contact information).

Due 23:59 on March 9, 2016.

### Grading Rubric

- Working code for Part 1: 3 points
- Working code for Part 2: 3 points
- Working code for Part 3: 2 points
- Working code for Part 4 / Course : 4 points
- Working code for Part 4 / Student : 4 points
- Working code for Part 4 / Car : 2 points
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

- first name (use a `String` called `firstName`)
- last name (use a `String` called `lastName` )
- university id number (use an `int` called `id`)

This information should be held in 3 instance variables, which are accessible from outside the class by the appropriate **getter** and **setter** methods. All three of them should be initialized upon instantiation of new `Student` objects, via the **constructor** (as parameters).

### 2) Courses

Write a class called `Course` that can store the following information in instance variables:

- the three-digit course number (use an `int` called `number`)
- the name of the course (use a `String` called `name`)
- the students taking the course (use an `Array` of `Student`s called `students`)

Include **getter** and **setter** methods for the name and number of the course. Require them as parameters for the **constructor** and initialize them therein.

For the array of students taking the course, use an `array` of `Student`s. Upon instantiation of `Course` objects, initialize this array with a default length of 10. Omit its usual getter and setter methods for now; only declare and initialize the array. We will deal with getting and setting it later.

Finally, write a method called `getYear()` that returns the first digit of the course number as an `int`. (Hint: Use [maths and loops](http://stackoverflow.com/questions/2051817/return-first-digit-of-an-integer); or: [convert the integer to a string](http://stackoverflow.com/questions/4105331/how-to-convert-from-int-to-string), [extract the first character in the string](http://stackoverflow.com/questions/11229986/get-string-character-by-index-java), [convert that character to an int](http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java), and return it.)

### 3) Parking

Write a class called `Car` that can store the following information:

- make (e.g. "VW", "Renault", "Koenigsegg", etc.) (use a `String` called `make`)
- owner (use `Student` called `owner`)

Include **getter** and **setter** methods for these variables. Require and initialize them in the **constructor**.

### 4) Integration

Now you will connect the `Student`, `Course`, and `Car` classes together to create some useful parts of an application. Both of the `Course` and `Car` classes will talk to the `Student` class.

#### `Course`

Remember how we omitted the getter and setter methods for the `array` of `Student`s? Those were the [good times](https://youtu.be/rTusMLs9SJE). Add the following to the `Course` class:

- a method called `StudentsToString()` that returns a `String` with the **names** of the students in the array, seperated by newlines (Hints: Use a for loop and string concatenation. Remember the newline symbol: `\n`)
- a method called `addStudent()` that adds a `Student` object (as a parameter) to the array, returns `true` if the operation is successful, and returns `false` if the array is full (Hint: Use a for loop to [find an index on your array where the item is `null`](http://www.programcreek.com/2014/04/check-if-array-contains-a-value-java/), assign the new student at that index. Return false if the whole arrayli is non-null.)
- a method that called `removeStudent()` finds and removes a `Student` object (as a parameter) from the array, returns `true` if the operation is successful, and returns `false` if there aren't any students by the specified name in the array (Hint: Use a for loop to [find the index of the student you're looking for](http://www.programcreek.com/2014/04/check-if-array-contains-a-value-java/), remove the element at that index. Return false if no students by that name exist in the array.)

#### `Student`

Add the following to the `Student` class:

- a method called `takeCourse()` that requires a `Course` object as a parameter, uses the `addStudent()` method on the `Course` object to add the student to the course array, returns `true` if the operation is successful, and returns `false` if the list is full (hint: `addStudent()` already should perform this operation and return the appropriate value, call it.)
- an instance variable, type `ArrayList` of `int`s, called `parkingTickets`
- a method called `addParkingTicket()` that requires an `int` as a parameter and appends this `int` to `parkingTickets`

#### `Car`

Add the following to the `Car` class:

- a method called `punish()` that requires an `int` as a parameter and calls the `addParkingTicket()` function on the `Student` who owns the car to append the `int` to their `ArrayList` of parking tickets
