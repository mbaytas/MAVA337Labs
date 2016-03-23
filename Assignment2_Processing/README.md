### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Assignment 2: Processing

This homework assignment concludes our coverage of the second programming language you learn through this course: Processing. We will collect and grade your work. The grading rubric is given below.

The lectures, lecture slides, and labs should cover all of the information that you need to complete this assignment. Feel free to consult any course materials or outside sources. Feel free to use code you have written before.

> You will notice there are a lot of technical terms in the instructions. This is intentional. Most of what programmers do today is piecing together bits and pieces of code they find online. To find these bits and pieces, you need to search for the right keywords. You want to know the language of programming, not a particular programming language.

### Academic Honesty

You are expected to observe the code of academic honesty that is included in the course syllabus. Please don't copy each other's work. We will know if you do. However, we will not be able to know who supplied the code and who copied it, so both parties will suffer if we detect cheating.

Remember that you can rely on any resources, including any sinippets code you find online. If you use other people's code, *put a comment in your code which says where you got the snippet from (provide a link), and what exactly it does*.

### Submission Instructions

Name the project directory `1_Java_YourName`. Compress it into a `.zip` file with the same name. E-mail it to the instructor and the TA (see the syllabus for the contact information).

Due 23:59 on April 6, 2016.

### Grading Rubric

-
-
-
-

These add up to 25 points, which represents 25% of your final grade from this course.

#### Bonus points:

We will not be automatically checking your work for these. If you have put in the effort to get these bonus points, please tell us in the e-mail as you submit your work.

### 1) Path Follower

Draw the path and circle shown below on the canvas. Make the circle follow the path.

The animation can be as fast or as slow as you want.

You must specify some colors for the background, the path, and the circle; but they don't have to be the colors shown. Feel free to use different colors.

![Follower](Follower.png)

### 2) Rotating Text

Write "MAVA337" in a monospaced font in the middle of the screen and rotate it around the y-axis.

Hints:

- Before you pick the font for your text (with `createFont()`), use the `Pfont.list()` function to obtain a list of the fonts available on your system.
- You may want to use the [`textAlign()` function](https://processing.org/reference/textAlign_.html).
- If you use the parameters for the `text()` function to set the position of your text, the text will rotate around an axis that is located off the text. Use `translate()` instead.
- You will need to use a global variable for the rotation angle.

![Rotating Text](Rotate.png)

### 3) Textures

Take a look at [this video](https://www.dropbox.com/s/dw370cn1us7gmc3/Planets.mov?dl=0). Follow the instructions to build something very similar.

Use Processing's [P3D render mode.](https://processing.org/tutorials/p3d/)

Use the [`shapeMode()` function](https://processing.org/reference/shapeMode_.html) to draw shapes from their center.

We used a canvas size of 800x600 pixels. The recommendations for dimensions below will be for this canvas size. However, feel free to experiment with other values for dimensions and animations.

Find an image depicting space and set this as your background. Use the [`PImage` class](https://processing.org/reference/PImage.html) and the [`loadImage()` function](https://processing.org/reference/loadImage_.html).

Find images depicting fire, water, and soil. [Draw three spheres](https://processing.org/reference/createShape_.html), 50 pixels in radius. [Apply the images onto the spheres as textures](https://processing.org/tutorials/p3d/). [Turn off the stroke](https://processing.org/reference/PShape_setStroke_.html) on the spheres.

Use a global variable called `rotator` of type `Float` that initializes at 0. Increment it by 1 at the end of each `draw()` iteration. [Rotate the whole coordinate system around the Z-axis](https://processing.org/reference/rotateZ_.html) by 1/100th of the value of `rotator`. Do this after you set the background and lights, *before* you draw the spheres.

Place the shapes at (X,Y) coordinate pairs (100, 100), (-100, 100), and (-100, -100).

Rotate all three spheres around their own center by small values. We used the `rotateX()`, `rotateY()`, and `rotateZ()` functions and just randomly gave values around 0.01.

Hints:

- Use the "usage rights" filter in Google Images to find images that is appropriate for "reuse with modification." (In general this is a good habit for when you need a few quick images for a project.)

### 4) Image

Grab Richard Feynman's photo from below.

Traverse the image pixel by pixel and apply a creative effect. You can turn the image grayscale or black & white, make certain colors "pop," invert it, or do more complicated operations like convolution.

![Richard Feynman](Feynman.jpg)
