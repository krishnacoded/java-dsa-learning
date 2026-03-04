/*
=========================================================
JAVA FUNDAMENTALS
Topic: Operators
File: operators.java
=========================================================

An operator is a symbol used to perform operations on variables and values.

Example:
int a = 10;
int b = 5;

int sum = a + b;

Here:
+ is the operator
a and b are operands

=========================================================
TYPES OF OPERATORS IN JAVA
=========================================================

Java has several types of operators:

1. Arithmetic Operators
2. Comparison (Relational) Operators
3. Logical Operators
4. Assignment Operators
5. Unary Operators
6. Increment and Decrement Operators

=========================================================
1️⃣ ARITHMETIC OPERATORS
=========================================================

Used for mathematical calculations.

Operator    Meaning
-------------------------
+           Addition
-           Subtraction
*           Multiplication
/           Division
%           Modulus (remainder)

Example:

10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
10 % 3 = 1

Modulus (%) is extremely important in programming.
It is used to check:

even / odd numbers
cyclic patterns
remainders

=========================================================
2️⃣ COMPARISON (RELATIONAL) OPERATORS
=========================================================

Used to compare two values.

They always return a BOOLEAN result (true or false).

Operator    Meaning
-------------------------
==          Equal to
!=          Not equal
>           Greater than
<           Less than
>=          Greater than or equal
<=          Less than or equal

Example:

5 > 3   → true
5 < 3   → false
5 == 5  → true
5 != 5  → false

These operators are used heavily in:

if statements
loops
algorithms

=========================================================
3️⃣ LOGICAL OPERATORS
=========================================================

Used to combine multiple conditions.

Operator    Meaning
-------------------------
&&          Logical AND
||          Logical OR
!           Logical NOT

Example:

true && true   → true
true && false  → false

true || false  → true
false || false → false

!true → false

Example in real code:

(age > 18 && age < 60)

This means:
age must be greater than 18 AND less than 60.

=========================================================
4️⃣ ASSIGNMENT OPERATORS
=========================================================

Used to assign values to variables.

Operator    Example
-------------------------
=           x = 5
+=          x += 3
-=          x -= 2
*=          x *= 4
/=          x /= 2

Example:

int x = 10;

x += 5;

Now x becomes:

15

Because:

x = x + 5

=========================================================
5️⃣ UNARY OPERATORS
=========================================================

Unary operators work on a single operand.

Operator    Meaning
-------------------------
+           positive
-           negative
!           logical NOT

Example:

int a = 5;
int b = -a;

b becomes:

-5

=========================================================
6️⃣ INCREMENT / DECREMENT OPERATORS
=========================================================

Very important in loops.

Operator    Meaning
-------------------------
++          Increment
--          Decrement

Example:

int x = 5;

x++

x becomes:

6

Example:

int y = 10;

y--

y becomes:

9

=========================================================
PREFIX vs POSTFIX
=========================================================

Prefix:

++x

Increment happens first.

Postfix:

x++

Increment happens after usage.

Example:

int x = 5;

System.out.println(x++);

Output:
5

After this line x becomes 6.

=========================================================
PROGRAM EXAMPLE
=========================================================
*/

public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Comparison operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("AND operator: " + (condition1 && condition2));
        System.out.println("OR operator: " + (condition1 || condition2));
        System.out.println("NOT operator: " + (!condition1));

        // Increment operator
        int x = 5;

        System.out.println("x before increment: " + x);

        x++;

        System.out.println("x after increment: " + x);

        // Decrement operator
        int y = 10;

        System.out.println("y before decrement: " + y);

        y--;

        System.out.println("y after decrement: " + y);

    }
}