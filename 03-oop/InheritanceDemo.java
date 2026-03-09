/*
=========================================================
JAVA OOP
Topic: Inheritance
File: inheritance.java
=========================================================

Inheritance allows one class to inherit properties
and methods from another class.

Parent class → Superclass
Child class → Subclass

Syntax:

class ChildClass extends ParentClass

Child gets access to:

• variables
• methods

from the parent class.

=========================================================
WHY INHERITANCE?
=========================================================

1. Code reuse
2. Cleaner design
3. Logical hierarchy
4. Easier maintenance

=========================================================
EXAMPLE
=========================================================
*/

// Parent class
class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Buddy";

        // inherited method
        d1.eat();

        // child method
        d1.bark();
    }
}