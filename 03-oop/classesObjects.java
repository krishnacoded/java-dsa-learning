/*
=========================================================
JAVA OOP
Topic: Classes and Objects
File: classes-objects.java
=========================================================

OOP models real-world entities using classes and objects.

Examples of real-world objects:

Student
Car
Book
BankAccount

Each object has:

1. Properties (data)
2. Behavior (methods)

Example:

Student

Properties:
name
rollNo
marks

Behavior:
displayDetails()

=========================================================
CLASS
=========================================================

A class is a blueprint for creating objects.

Example:

class Student{
    String name;
    int rollNo;
}

This defines what a Student looks like.

=========================================================
OBJECT
=========================================================

An object is an instance of a class.

Example:

Student s1 = new Student();

s1 is an object.

=========================================================
ACCESSING OBJECT DATA
=========================================================

Use the dot operator.

Example:

s1.name = "Krishna";
s1.rollNo = 101;

=========================================================
PROGRAM EXAMPLE
=========================================================
*/

// Student class (blueprint)
class Student {

    String name;
    int rollNo;
    int marks;

    // method inside class
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class classesObjects {

    public static void main(String[] args) {

        // creating first object
        Student s1 = new Student();

        s1.name = "Krishna";
        s1.rollNo = 101;
        s1.marks = 95;

        s1.displayDetails();

        System.out.println();

        // creating second object
        Student s2 = new Student();

        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 88;

        s2.displayDetails();

    }
}