### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Assignment 3: Arduino

This homework assignment concludes our coverage of the third programming environment you encounter during this course: Arduino. We will collect and grade your work. The grading rubric is given below.

Feel free to consult any course materials or outside sources. Feel free to use code you have written before.

### Academic Honesty

You are expected to observe the code of academic honesty that is included in the course syllabus. Please don't copy each other's work. We will know if you do. However, we will not be able to know who supplied the code and who copied it, so both parties will suffer if we detect cheating.

Remember that you can rely on any resources, including any sinippets code you find online. If you use other people's code, *put a comment in your code which says where you got the snippet from (provide a link), and what exactly it does*.

### Submission Instructions

For this assignment, eventually we will have to physically meet up with you and collect the equipment that we handed out. Thus, this time, we will be asking for a physical demonstration of your work. Please bring the circuit, assembled and running, to the class on May 9. Since you are uploading your sketch to the board, the circuit should start working upon connecting it to a power supply or USB port.

Additionally, put the Arduino project directory inside a directory called `3_Arduino_YourName`. Compress it into a `.zip` file with the same name. E-mail it to the instructor and the TA (see the syllabus for the contact information).

Due 16:00 on May 9, 2016.

### Grading Rubric

- Correct circuit setup: 5 points
- Arduino code for cycling through LEDs: 10 points
- Arduino code for changing lights on button press: 5 points
- Comments on classes, methods, and reasonable chunks of code explaining what they do: 2 points
- Properly indented code: 1 points
- Good style (properly capitalized variable names, etc.): 2 points

These add up to 25 points, which represents 25% of your final grade from this course.

### Bonus Points

Notice that, probably, you will need to hold the button down for a while to engage the "all three LEDs blinking for 0.2 seconds" mode, because the moment when one LED switches off and the other switches on will be the only moment when the button signal is being read.

If you can use an [interrupt](http://playground.arduino.cc/Code/Interrupts) to make the system respond immediately to a button press (rather than waiting for the moment when the LEDs cycle), your get 3 bonus points.

> Notice that this task will require you to consult to external resources not taught in the course.

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

- Connect the button to Arduino's digital pin 3. Remember to use the 10k ohm resistor.
- Connect the 3 LEDs to Arduino's digital pins 10, 11, and 12. Remember to use the 220 ohm resistors, and remember that LEDs have **polarity**. If you connect your LEDs the wrong way, they will not work. If you omit the resistors, ***you may kill your LEDs***.

Your circuit will look like the following:

![](http://arduino.sundh.com/wp-content/uploads/2012/11/arduino_sundh_random_leds1.png)

### 2) Arduino

- Write an Arduino sketch that cycles through the 3 LEDs, lighting up one at a time and keeping each LED lit for 3 seconds before switching to the next one. More explicitly, your program should do the following: Light up LED on pin 10, wait for 3 seconds, turn off LED on pin 10; light up LED on pin 11, wait for 3 seconds, turn off LED on pin 11; light up LED on pin 12, wait for 3 seconds, turn off LED on pin 12; repeat.
 
> Don't worry about the colors of your LEDs. Only the order is important.

- Add code to your sketch that listens to the button. When the button is pressed and held down, make all three LEDs blink at once. All three LEDs should light up for 0.2 seconds, turn off for 0.2 seconds, and repeat; while the button is held down. When the button is released, resume normal operation. (You can resume from where you left in the cycle, or begin the cycle anew, both are OK.)

> You will need to hold down the button, because (probably) the moment when one LED switches off and the other switches on will be the only moment when the button signal is being read.
