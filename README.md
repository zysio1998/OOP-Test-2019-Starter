# OOP-Test-2019

## Rules

- You can access the Processing reference and the Java reference if you need to look something up
- No use of notes or previously written code
- No collaboration or communication

## Description
Resistors are electrical components that resist the flow of current through a circuit. The amount of resistance is measured in ohms. You can tell the resistance of a resistor by reading the colour bars on a resistor. Here is a picture of one.

For the lasb test today you will be making a program to display the colour codes for different resistors. This is what your finished sketch should look like:

![](images/2.png)

There are two files in the data folder of the repository. The file colours.csv looks like this:

```
r,g,b,value
0,0,0,0
165,42,42,1
255,0,0,2
...
...
```

r,g,b are the RGB values of a colour and the value column repoesents the value associated with the colour. Looking at the above extract from the file, you can see that the colour black represents the value 0 and the color red represents the value 2.

The second file is called resistors.csv and this file contains the resistors you will be visualising. Below is the contents of file:

```
618
27
195
93
```

## Instructions

- Fork [this repository]() to get the starter project. Clone the forked repo and check the upstream and origin repotes are set correctly
- Make a class called Colour that encapsulates the columns from a single row from the colours.csv file. Make the r,g,b and value fields 
