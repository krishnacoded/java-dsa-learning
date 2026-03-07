/*
=========================================================
JAVA METHODS
Topic: Parameters and Return Values
File: parameters-return.java
=========================================================

Methods become powerful when they can:

1. Accept input
2. Process data
3. Return a result

This is the foundation of algorithm design.

Example idea:

sum(5, 7) → returns 12

=========================================================
PARAMETERS
=========================================================

Parameters are variables defined in the method declaration.

Example:

public static void greet(String name)

Here:

name → parameter

=========================================================
ARGUMENTS
=========================================================

Arguments are the actual values passed when calling a method.

Example:

greet("Krishna")

"Krishna" → argument

=========================================================
METHOD WITH PARAMETERS
=========================================================

Example:

public static void printSquare(int number){
    int square = number * number;
    System.out.println(square);
}

Calling it:

printSquare(5);

Output:
25

=========================================================
RETURN VALUES
=========================================================

Some methods return values instead of printing them.

Syntax:

return value;

Example:

public static int add(int a, int b){
    return a + b;
}

=========================================================
USING RETURN VALUES
=========================================================

Returned values can be stored in variables.

Example:

int result = add(4,6);

System.out.println(result);

=========================================================
PROGRAM EXAMPLES
=========================================================
*/

public class ParametersReturn {

    // method with parameters
    public static void greetUser(String name){
        System.out.println("Hello " + name);
    }

    // method that returns sum
    public static int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    // method returning square
    public static int square(int number){
        return number * number;
    }

    public static void main(String[] args) {

        // calling method with parameter
        greetUser("Krishna");

        // calling method that returns value
        int result = addNumbers(10, 5);
        System.out.println("Sum = " + result);

        // calling square method
        int sq = square(6);
        System.out.println("Square = " + sq);

    }
}