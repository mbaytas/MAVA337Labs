### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Lab 8: Arduino + Processing via Serial Communication

This lab relates to the second lecture on Arduino, where interfacing Arduino with Processing over serial communication was covered.

## Scenario

Today we'll be building some traffic lights. [Traffic lights](https://en.wikipedia.org/wiki/Traffic_light) in this day and age are usually automated, but they do have manual override capabilities, for emergencies etc. We'll be building a manually operated version today.

### Materials

- 1x Arduino Uno
- 1x button
- 1x 10k ohm resistor
- 1x breadboard
- Jumper wires

### 1) Circuit Setup

- Consult to the [*DigitalReadSerial* tutorial on the Arduino website](http://www.arduino.cc/en/Tutorial/DigitalReadSerial) to build the circuit to capture button presses.

For convenience, the diagram on the tutorial page is included below:

![](http://www.arduino.cc/en/uploads/Tutorial/button.png)

### 1) Arduino Side

- Consult to last week's lecture slides and example code (as well as the [*DigitalReadSerial* tutorial on the Arduino website](http://www.arduino.cc/en/Tutorial/DigitalReadSerial)) to write the Arduino code that writes the state of the button to the computer.
 
The method that is described in the example, i.e. sending `0`s and `1`s to represent the button state, should suffice.

### 2) Processing Side

- Initialize a blank canvas with a red background.
- Consult to last week's lecture slides and example code  to write the Processing code that reads the data coming in through the serial port.
- Write code that detects button presses (i.e. a `1` coming in through the serial port) and changes the color of the background. If the background is red when the button is pressed, it should turn green; if it is green, it should turn yellow; and if it is yellow, it should turn red - effectively cycling through the 3 colors of traffic lights.

## Bonus Material

- ["Connecting Arduino to Processing" on *learn.sparkfun.com*](https://learn.sparkfun.com/tutorials/connecting-arduino-to-processing)
- ["Lab: Serial Output from an Arduino to Processing" on *ITP Physical Computing*](https://itp.nyu.edu/physcomp/labs/labs-serial-communication/serial-output-from-an-arduino/)
- ["Arduino and Processing" on *Arduino Playground*](http://playground.arduino.cc/Interfacing/Processing)
- ["Tutorial 06 for Arduino: Serial Communication and Processing" by *Jeremy Blum* on YouTube](https://youtu.be/g0pSfyXOXj8)
- ["Arduino Tutorial 06: Processing" on *HowToMechatronics*](http://howtomechatronics.com/tutorials/arduino/processing/)
