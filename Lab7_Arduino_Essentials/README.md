### MAVA 337 Introduction to Programming for Design  (2016 Spring)

# Lab 7: Arduino Essentials - Digital Write, Digital Read, Analog Read

This lab relates to the first lecture on Arduino, where some background and introductory information about the development board, some basic electronics concepts, and three essential operations (Digital Write, Digital Read, Analog Read) were covered.

## Scenario

Today we will be exploring the three basic operations that you can perform to have your Arduino microcontroller interact with sensors and actuators in the physical world: [Digital Write](https://www.arduino.cc/en/Reference/DigitalWrite), [Digital Read](https://www.arduino.cc/en/Reference/DigitalRead), and [Analog Read](https://www.arduino.cc/en/Reference/AnalogRead).

At this point in the course, you have already gained a basic understanding of writing computer programs. Today, you will be using existing code, provided with the Arduino IDE as examples, to explore physical computing concepts and practice building electronic circuits that interface the physical world with a computer. You will also practice reading, understanding, and modifying existing code written by other people.

Throughout this lab, you will be using the built-in examples provided with the Arduino IDe, and you will refer to the related [tutorials](https://www.arduino.cc/en/Tutorial/HomePage) on the Arduino website. These examples have also been shown and explained to the class during the lectures.

### 0) Setting Up Arduino

We are hoping that you already have the Arduino IDE up and running on your computer. If not, please go to [arduino.cc](http://arduino.cc/) now to download the latest version of the Arduino IDE for your operating system, and install it on your computer.

### 1) Digital Write

- In the IDE, under *File* > *Examples* > *01.Basics*, open up the *Blink* example.
- In your browser, open up the [online tutorial related to the *Blink* example](https://www.arduino.cc/en/Tutorial/Blink).
- Refer to the tutorial and build the circuit using a breadboard, jumpers, an LED, and a resistor.
- Run the code and make sure that it works as intended.
- Add another LED to the circuit, on pin 12.
- Modify the code to have both of the LEDs blink together, at the same time.
- Modify the code to have the two LEDs blink one after another.
- Add a third LED to the circuit, on pin 11.
- Modify the code to have the three LEDs blink one after another.
- Modify the code to blink the three LEDs in a random order. Only one LED should light up at any given time.

### 2) Digital Read

- In the IDE, under *File* > *Examples* > *01.Basics*, open up the *DigitalReadSerial* example.
- In your browser, open up the [online tutorial related to the *DigitalReadSerial* example](https://www.arduino.cc/en/Tutorial/DigitalReadSerial).
- Refer to the tutorial and build the circuit using a breadboard, jumpers, a button, and a resistor.
- Run the code and make sure that it works as intended.
- Add another button to the circuit, on pin 3.
- Modify the code to listen to both buttons. Also modify the string(s) you are printing through serial communication to indicate which one of the buttons are being pressed.

### 3) Analog Read

- In the IDE, under *File* > *Examples* > *01.Basics*, open up the *AnalogReadSerial* example.
- In your browser, open up the [online tutorial related to the *AnalogReadSerial* example](https://www.arduino.cc/en/Tutorial/AnalogReadSerial).
- Refer to the tutorial and build the circuit using a breadboard, jumpers, and a potentiometer.
- Run the code and make sure that it works as intended.
- Add three LEDs to your circuit, on pins 11, 12, and 13.
- Now you will build an LED "level indicator" for your potentiometer reading. `analogRead()` returns a value in the range [0, 1023]. Add some code so that none of the LEDs are lit if this value in the range [0, 255]; one LED is lit if the value is in the range [256, 511]; two LEDs are lit if the value is in [512, 767], and all three LEDs are lit if the value is equal to or greater than 768.
- Also print a message through serial saying how many LEDs are lit. 
