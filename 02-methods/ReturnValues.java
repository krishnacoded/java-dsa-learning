/*
=========================================================
JAVA METHODS
Topic: Return Values
File: return-values.java
=========================================================

A return value is the result that a method sends back
to the place where it was called.

Instead of printing the result inside the method,
the method returns it.

This is extremely important for algorithms and DSA.

Example idea:

int result = add(5,7);

The method calculates something and RETURNS it.

=========================================================
METHOD WITHOUT RETURN VALUE
=========================================================

Example:

void greet(){
    System.out.println("Hello");
}

Return type: void

void means the method does NOT return anything.

=========================================================
METHOD WITH RETURN VALUE
=========================================================

Syntax:

returnType methodName(parameters){
    return value;
}

Example:

int add(int a, int b){
    return a + b;
}

=========================================================
USING RETURN VALUES
=========================================================

Returned values can be:

• stored in variables
• printed
• used inside expressions
*/

public class ReturnValues {

    // method returning sum
    public static int add(int a, int b) {
        return a + b;
    }

    // method returning square
    public static int square(int n) {
        return n * n;
    }

    // method returning maximum
    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int result = add(4, 6);
        System.out.println("Sum = " + result);

        int sq = square(5);
        System.out.println("Square = " + sq);

        int largest = max(10, 25);
        System.out.println("Largest = " + largest);
    }
}