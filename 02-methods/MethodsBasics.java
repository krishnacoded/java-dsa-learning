/*
=========================================================
JAVA METHODS
Topic: Introduction to Methods
File: methods-basics.java
=========================================================

A method is a block of code that performs a specific task.

Instead of writing the same code multiple times,
we place it inside a method and call it when needed.

Example idea:

printHello()
printHello()
printHello()

The code is written once but used many times.

=========================================================
METHOD SYNTAX
=========================================================

returnType methodName(parameters){
    // code
}

Example:

void greet(){
    System.out.println("Hello");
}

Breakdown:

void        → return type
greet       → method name
()          → parameters
{}          → body of method

=========================================================
WHY METHODS ARE IMPORTANT
=========================================================

1. Code reuse
2. Better readability
3. Easier debugging
4. Modular programming

Without methods:

Program becomes long and messy.

=========================================================
CALLING A METHOD
=========================================================

A method does nothing until it is called.

Example:

greet();

=========================================================
EXAMPLE PROGRAM
=========================================================
*/

public class MethodsBasics {

    // method that prints a message
    public static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    // method that prints numbers
    public static void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // calling the greet method
        greet();

        // calling the method again
        greet();

        // calling another method
        printNumbers();

    }
}