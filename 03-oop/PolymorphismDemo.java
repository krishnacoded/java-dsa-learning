/*
=========================================================
JAVA OOP
Topic: Polymorphism (Method Overriding)
File: polymorphism.java
=========================================================

Polymorphism means:

"One method name, multiple behaviors."

In runtime polymorphism, a child class overrides
a method of the parent class.

Parent class defines the method.
Child class provides its own implementation.

=========================================================
RULES OF METHOD OVERRIDING
=========================================================

1. Method name must be the same
2. Parameters must be the same
3. Inheritance must exist
4. Access level must not be more restrictive

=========================================================
EXAMPLE
=========================================================
*/

// Parent class
class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Child class 1
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

    }
}