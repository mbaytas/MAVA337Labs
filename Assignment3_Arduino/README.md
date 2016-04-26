### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Assignment 3: Arduino

This homework assignment concludes our coverage of the third programming environment you encounter during this course: Arduino. We will collect and grade your work. The grading rubric is given below.

Feel free to consult any course materials or outside sources. Feel free to use code you have written before.

### Academic Honesty

You are expected to observe the code of academic honesty that is included in the course syllabus. Please don't copy each other's work. We will know if you do. However, we will not be able to know who supplied the code and who copied it, so both parties will suffer if we detect cheating.

Remember that you can rely on any resources, including any sinippets code you find online. If you use other people's code, *put a comment in your code which says where you got the snippet from (provide a link), and what exactly it does*.

### Submission Instructions

Put both the Arduino project directory inside a directory called `3_Arduino_YourName`. Compress it into a `.zip` file with the same name. E-mail it to the instructor and the TA (see the syllabus for the contact information).

Due 23:59 on May 5, 2016.

### Grading Rubric

- Arduino code for cycling through 
- Comments on classes, methods, and reasonable chunks of code explaining what they do: 2 points
- Properly indented code: 1 points
- Good style (properly capitalized variable names, etc.): 2 points

These add up to 25 points, which represents 25% of your final grade from this course.

## Scenario

For this assignment, you will be building some traffic lights. Traffic lights in this day and age are usually automated, but they do have manual override capabilities, for emergencies etc. The system that you'll be building will also have both of these capabilities.

### Materials

- 1x Arduino Uno
- 3x LEDs
- 1x button
- 3x 220 ohm resistors
- 1x 10k ohm resistor
- 1x breadboard
- Jumper wires

### 1) Circuit Setup

Refer to the lecture slides; our [Arduino Essentials Lab](https://github.com/mbaytas/MAVA337Labs/tree/master/Lab7_Arduino_Essentials); and the [*Blink*](https://www.arduino.cc/en/Tutorial/Blink) and [*DigitalReadSerial*](httpshttps://www.arduino.cc/en/Tutorial/DigitalReadSerial) examples.

- Connect the button to Arduino's digital pin 2. Remember to use the 10k ohm resistor.
- Connect the 3 LEDs to Arduino's digital pins 11, 12, and 13. Remember to use the 220 ohm resistors, and remember that LEDs have **polarity**. If you connect your LEDs the wrong way, they will not work. If you omit the resistors, ***you may kill your LEDs***.

### 2) Arduino

- Write an Arduino sketch that cycles through the 3 LEDs, lighting up one at a time and keeping each LED lit for 3 seconds before switching to the next one. More explicitly, your program should do the following: Light up LED on pin 11, wait for 3 seconds, turn off LED on pin 11; light up LED on pin 12, wait for 3 seconds, turn off LED on pin 12; light up LED on pin 13, wait for 3 seconds, turn off LED on pin 13.
 
> Don't worry about the colors of your LEDs. Only the order is important.

- Add code to your sketch that listens to the button. When the button is pressed, immediately cycle to the next LED; i.e. turn off the LED that is lit at the time of the button press, and light up the next one.
- Add code to your sketch that opens up a serial communication port and prints the number of the LED that is lit when the LED state changes. When the LED on pin 11 is lit, write `1` to serial; when the LED on pin 12 is lit, write `2`; and when the LED on pin 13 is lit, write `3`.
