/*
=========================================================
JAVA FUNDAMENTALS
Topic: Input and Output
File: InputOutput.java
=========================================================

In Java, programs often need to interact with users by:

1. Taking INPUT from the user
2. Displaying OUTPUT to the user

Example:
User enters a number → Program processes it → Program prints result

=========================================================
OUTPUT IN JAVA
=========================================================

Java prints output using:

System.out.print()
System.out.println()

Explanation:

System  → Java system class
out     → standard output stream (console)
println → method to print a line

Example:
System.out.println("Hello World");

Difference between print and println:

print()   → prints without moving to new line
println() → prints and moves to new line

Example:

System.out.print("Hello ");
System.out.print("World");

Output:
Hello World

Example:

System.out.println("Hello");
System.out.println("World");

Output:
Hello
World

=========================================================
INPUT IN JAVA
=========================================================

Java uses the Scanner class to take input from the user.

Scanner belongs to the package:

java.util

So we must import it first.

import java.util.Scanner;

=========================================================
CREATING A SCANNER OBJECT
=========================================================

To use Scanner we must create an object.

Syntax:

Scanner sc = new Scanner(System.in);

Explanation:

Scanner → class
sc → object name
System.in → input from keyboard

=========================================================
COMMON SCANNER METHODS
=========================================================

Method        Purpose
--------------------------------
nextInt()     read integer
nextDouble()  read decimal number
nextFloat()   read float number
nextLine()    read full line (string)
next()        read single word
nextBoolean() read boolean

=========================================================
IMPORTANT SCANNER NOTE
=========================================================

Scanner reads input from keyboard until user presses ENTER.

Example:

User types:
25

Program reads:
25

=========================================================
PROGRAM EXAMPLE
=========================================================
*/

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking decimal input
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        // Printing the values
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // Closing the scanner
        sc.close();
    }
}