### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Lab 3: Arrays, Loops, etc.

This lab relates to the second and third lectures, where loops, arrays, ArrayLists and an review of the previous Java topics were covered. After this lab, you should be comfortable with these terms: **for loop**, **while loop**, **array**, **ArrayList**, **index**, **array length**, **iteration**, **infinite loop**.

## Scenario

Through your work for campus security, your talents in building software  have been noticed by the registrar's office. They have approached you about a system for managing student records.

You will be developing the `Course` and `Student` classes to manage information about courses and the students who are taking them.

### 1) Arrays

An **array** is basically an ordered collection of containers. The number of containers you have in an array and what kind of things they can hold is determined when you create the array, and these can not be changed later.

> You are probably inclined to describe an array as a "list" of objects. In the context of programming, the word "list" usually describes a different data type that is distinct from an array. In most programming languages, the word "array" denotes a collection of a fixed number of containers, and the word "list" denotes a collection whose size (or "length") can change.

We'll begin by developing a simple `Course` class to hold information about Courses.

- Create a new project, if you haven't done so already.
- Create a new class called `Course`.
- As an instance variable in the `Course` class, declare an array of `String`s, **length** 10, called `students`.

> Notice how the properties of the data structures we employ for this representation of real-world information is consistent with the constraints of the reality. The registrar usually sets the capacity of a course at the beginning, when the course is created in the system. Normally, the capacity does not change afterwards. Thus, the use of an array to hold information about students makes sense.

Now, for convenience, let's imagine that there are 10 students in the university who will be taking the courses we'll record in the system. Thus, we can put their names inside of our `Course` class and populate the array that holds their names automatically when we create `Course` instances.

- Inside your `Course` class, declare a method called `populate()`.
- Inside the `populate()` function, write 10 lines of code where you assign 10 different names to each of the containers in your `students` array.
- Inside the constructor, call the `populate()` method.

> Notice that we did not specify the return type for the `populate()` function. You have two options for this: you can choose to return void, or to return a String array. (Programmers usually prefer the latter method.) The line inside your constructor where you call this method should be written accordingly. If you are returning a String array, you should be assigning the array returned by `populate()` to your `students` variable.

Now lets do some testing.

- Instantiate a new `Course` object.
- Inspect the `students` variable. Confirm that all the names you put in are there.

### 2) for Loops

All that business with inspecting variables is fine, but the registrar is going to need a nicer **user interface** to see the information they are managing. We'll use a **for loop** to create a nice string, and we'll show it using a dialog box.

- Between the documentation and your class declaration, place the following line of code to **import** a class from a **library** for programming user interfaces:

    import javax.swing.JOptionPane;

> This means: you are "importing" the JOptionPane class from the Swing **library**. You will now be able to use the functionality inside the JOptionPane class in your own application.

- Declare a new method inside your `Course` class called `showStudents()`. This method should not return anything or require any parameters.
- Inside `showStudents()` declare a variable of type `String` called `messageString` to hold the message string you'll compose.

We will compose the message string using a **for loop** that iterates over our `students` array.

- Right below where you declared `messageString`, write a blank for loop.
- Initialize the for loop with a counter variable called `i` that beings at zero.

> "Counter" variables are often called `i`, `j`, `k`, etc. per conventions in programming and mathematics.

> There are a few different ways to initialize a counter variables. You can declare the variable before the for loop, or you can do declaration and initialization together inside the loop, etc. Sometimes, one way of doing things is more appropriate than the other. Here, use whatever feels comfortable. I prefer to both declare and initialize inside the loop paranthesis, to save screen space.

- **Increment** the counter by 1 at the end of each iteration of the loop.
- Write a **condition** to stop looping when the counter exceeds the `length` of your `students` array (i.e. the number of array elements).

At this point, you know for sure that the course will have 10 students. You can thus hard-code the number 10 inside of your loop condition. Do *not* do this. You'll have trouble if you change the course capacity later. Use the `length` property on `array` objects.

Inside your loop, each iteration should access an element of the `students` array and **append** it as a new line to the message string. You'll need a line of code that uses **assignment**, **array indexing** and **string concatenation**.

- Inside the for loop, write one line of code that declares a variable called `nameToAppend`, uses the counter variable to access the appropriate element of the `students` array, and assigns the retrieved element to `nameToAppend`.
- Next, write another line of code that declares a variable called `stringToAppend`, adds the characters "`\n`" to the end of the `nameToAppend` string, and assign the result to this variable.
- Finally, append the `stringToAppend` to the message string.

> You may have noticed that while we took three lines of code to realize the instructions above, they could have been written shorter - e.g. `messageString += students[i] + "\n";`. However, in most cases, using more lines of code to explicitly write out instructions helps you think. Once you figure out how to do what you want to do, you can always come back and shorten it. Coming back and editing your code to improve readability, performance, etc. is called **refactoring**.

> Unless you are a somewhat experienced Java programmer with good habits, you will probably get an error if you compile your class at this point. Read any error messages carefully, contemplate for a bit, and google them.

The characters "`\n`" will be interpreted by the computer as a "new line" command.

- After the for loop, copy and paste the following line of code:

    JOptionPane.showMessageDialog(null, messageString);

> Some explanations about what this line of code entails can be found in the instructions for the previous lab.

Now let's test this functionality:

- Instantiate a new `Course`.
- Call the method `showStudens()` on the new object.
- See the names of the 10 students in the message box. Make sure all 10 of them are there. Rejoice.

### 3) ArrayLists

The main difference between an array and an **ArrayList** is that you can change the size ("length") of an ArrayList.  We will go over the same scenario of managing information about students taking a course, using an ArrayList instead of an array.

- Create a new class called `DynamicCourse`.
- Import the ArrayList class into your code, from `java.util`.
- Declare a new `ArrayList` called `students` to hold the names of the students who are taking the course.

Now, you will write four functions for the `DynamicCourse` class that will accomplish the some tasks:

- Write a function for adding students into the `students` ArrayList. This function should require a single parameter of type `String`, which is the name of the student to be added.
- Write a function for displaying all of the names of the students in the course, as a list, in a messagebox. This function should utilize a **for loop** and the `JOptionPane.showMessageDialog()` function. This is essentially the same as what you did in the previous exercise, so you can copy and paste code from there. You may need to make small changes since you now have an ArrayList that holds student names instead of an array. You will probably need to use the ArrayList's `get()` function.
- Write a function that receives the name of a student as a parameter, finds the **index** of that name (probably using a **fow loop**) within the `students` ArrayList, and removes that name from the ArrayList.

### 4) while Loop

- As an exercise, revisit the code you wrote for the `DynamicCourse` class. Replace every occurrance of a **for loop** with a **while loop**

### (Bonus Material)

- "[Difference between Array vs ArrayList in Java](http://java67.blogspot.com.tr/2012/12/difference-between-array-vs-arraylist-java.html)" by Javin Paul on Java67
