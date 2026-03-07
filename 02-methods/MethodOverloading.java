/*
=========================================================
JAVA METHODS
Topic: Method Overloading
File: method-overloading.java
=========================================================

Method Overloading means:

Multiple methods with the SAME NAME
but DIFFERENT parameters.

Java decides which method to call based on:

• number of parameters
• type of parameters
• order of parameters

This is called COMPILE-TIME POLYMORPHISM.

=========================================================
WHY METHOD OVERLOADING?
=========================================================

Instead of writing different method names:

addInt()
addDouble()
addThreeNumbers()

We can use the SAME method name:

add()

This keeps programs clean and readable.

=========================================================
RULES OF METHOD OVERLOADING
=========================================================

Methods must differ in at least one of:

1. Number of parameters
2. Type of parameters
3. Order of parameters

Example:

add(int a, int b)
add(double a, double b)
add(int a, int b, int c)

These are valid overloads.

=========================================================
IMPORTANT NOTE
=========================================================

Changing ONLY the return type does NOT create
method overloading.

Example (INVALID):

int add(int a, int b)
double add(int a, int b)

Java will give a compile error.

=========================================================
PROGRAM EXAMPLE
=========================================================
*/

public class MethodOverloading {

    // method 1: add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // method 2: add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // method 3: add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result1 = add(5, 7);
        System.out.println("Sum of two numbers: " + result1);

        int result2 = add(3, 4, 5);
        System.out.println("Sum of three numbers: " + result2);

        double result3 = add(2.5, 4.5);
        System.out.println("Sum of doubles: " + result3);

    }
}