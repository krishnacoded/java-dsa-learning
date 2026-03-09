/*
=========================================================
JAVA OOP
Topic: Constructors
File: constructors.java
=========================================================

A constructor is a special method used to initialize objects.

It runs automatically when an object is created.

Example:

Student s1 = new Student("Krishna",101,95);

The constructor sets the initial values.

=========================================================
RULES OF CONSTRUCTORS
=========================================================

1. Constructor name must be the same as class name
2. Constructors have no return type
3. They run automatically when an object is created

=========================================================
TYPES OF CONSTRUCTORS
=========================================================

1. Default constructor
2. Parameterized constructor

=========================================================
DEFAULT CONSTRUCTOR
=========================================================

Constructor without parameters.
*/

class Student {

    String name;
    int rollNo;
    int marks;

    // default constructor
    Student() {
        System.out.println("Student object created");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class ConstructorsDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Krishna";
        s1.rollNo = 101;
        s1.marks = 95;

        s1.display();
    }
}