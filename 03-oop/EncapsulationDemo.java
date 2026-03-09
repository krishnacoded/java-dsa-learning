/*
=========================================================
JAVA OOP
Topic: Encapsulation
File: encapsulation.java
=========================================================

Encapsulation means:

Bundling data and methods together
while restricting direct access to data.

We protect variables using:

private

and allow controlled access using:

getters
setters

=========================================================
WHY ENCAPSULATION?
=========================================================

Without encapsulation:

student.marks = -50;

Invalid values could be assigned.

With encapsulation we control this.

=========================================================
EXAMPLE
=========================================================
*/

class Student {

    // private variables (data hiding)
    private String name;
    private int rollNo;
    private int marks;

    // constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for marks
    public int getMarks() {
        return marks;
    }

    // setter for marks with validation
    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    // method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Krishna", 101, 95);

        s1.display();

        // modifying using setter
        s1.setMarks(85);

        System.out.println("\nAfter updating marks:");

        s1.display();

        // invalid value
        s1.setMarks(-20);

    }
}