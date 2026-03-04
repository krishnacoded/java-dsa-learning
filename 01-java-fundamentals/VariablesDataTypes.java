/*
=========================================================
JAVA FUNDAMENTALS
Topic: Variables and Data Types
File: variables-datatypes.java
=========================================================

In Java, a variable is a named memory location used to store data.

Java is a *statically typed language*, which means:
→ The data type of a variable must be declared before using it.

Example:
int age = 20;

Here:
int  → data type
age  → variable name
20   → value stored in the variable

=========================================================
JAVA DATA TYPES
=========================================================

Java has two main categories of data types:

1. Primitive Data Types
2. Non-Primitive (Reference) Data Types

---------------------------------------------------------
1️⃣ Primitive Data Types
---------------------------------------------------------

These are the basic built-in data types provided by Java.

There are 8 primitive types in Java:

Type      Size        Example
--------------------------------
byte      1 byte      byte b = 10;
short     2 bytes     short s = 100;
int       4 bytes     int x = 1000;
long      8 bytes     long l = 100000L;

float     4 bytes     float f = 3.14f;
double    8 bytes     double d = 19.99;

char      2 bytes     char c = 'A';

boolean   1 bit*      boolean flag = true;

(* exact size depends on JVM)

---------------------------------------------------------
2️⃣ Non-Primitive Data Types
---------------------------------------------------------

These are objects created from classes.

Examples:

String
Arrays
Classes
Interfaces

Example:
String name = "Krishna";

---------------------------------------------------------
VARIABLE DECLARATION
---------------------------------------------------------

Syntax:

datatype variableName;

Example:

int age;

This only declares the variable but does not assign a value.

---------------------------------------------------------
VARIABLE INITIALIZATION
---------------------------------------------------------

Initialization means assigning a value to a variable.

Example:

int age = 20;

---------------------------------------------------------
MULTIPLE VARIABLE DECLARATION
---------------------------------------------------------

Java allows multiple variables of the same type in one line.

Example:

int a = 5, b = 10, c = 15;

---------------------------------------------------------
VARIABLE NAMING RULES
---------------------------------------------------------

Java variable names must follow these rules:

✔ Must start with a letter, _ or $
✔ Cannot start with a number
✔ Cannot use Java keywords
✔ Should be meaningful

Valid examples:

age
studentName
totalMarks
_number

Invalid examples:

2age
class
int

---------------------------------------------------------
NAMING CONVENTION (IMPORTANT)
---------------------------------------------------------

Java uses camelCase for variable names.

Example:

studentName
totalMarks
accountBalance

First letter lowercase, next words start with capital.

---------------------------------------------------------
TYPE CASTING
---------------------------------------------------------

Sometimes we convert one data type to another.

Two types:

1. Implicit Casting (automatic)
2. Explicit Casting (manual)

Example:

int num = 10;
double d = num;   // automatic conversion

Explicit:

double x = 9.78;
int y = (int) x;

---------------------------------------------------------
DEFAULT VALUES
---------------------------------------------------------

Default values apply only to class variables.

Example defaults:

int → 0
double → 0.0
boolean → false
char → '\u0000'

Local variables must be initialized before use.

---------------------------------------------------------
MEMORY CONCEPT (Simplified)
---------------------------------------------------------

When a variable is declared:

int age = 20;

Java allocates memory like this:

Variable Name → age
Stored Value  → 20
Type          → int

Memory stores the value according to the variable's data type.

=========================================================
PROGRAM EXAMPLE
=========================================================
*/

public class VariablesDataTypes {

    public static void main(String[] args) {

        // integer type variable
        int age = 20;

        // double type variable (decimal numbers)
        double price = 199.99;

        // float type variable (decimal numbers, needs 'f' suffix)
        float temperature = 36.5f;

        // character variable (single character)
        char grade = 'A';

        // boolean variable (true or false)
        boolean isJavaFun = true;

        // string is a non-primitive data type
        String name = "Krishna";

        // printing values using System.out.println()

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Temperature: " + temperature);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

    }
}