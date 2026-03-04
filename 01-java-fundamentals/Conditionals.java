/*
=========================================================
JAVA FUNDAMENTALS
Topic: Conditional Statements
File: conditionals.java
=========================================================

Conditional statements allow a program to make decisions.

Instead of executing code line by line blindly,
the program checks a condition and decides what to execute.

Example idea:

IF age >= 18
    person can vote
ELSE
    person cannot vote

=========================================================
TYPES OF CONDITIONAL STATEMENTS IN JAVA
=========================================================

1. if
2. if-else
3. else-if ladder
4. nested if
5. switch statement

=========================================================
1️⃣ IF STATEMENT
=========================================================

The if statement executes code only if a condition is TRUE.

Syntax:

if(condition){
    code to execute
}

Example:

if(age >= 18){
    System.out.println("You can vote");
}

If condition is false → code will not run.

=========================================================
2️⃣ IF - ELSE STATEMENT
=========================================================

Used when we want two possible outcomes.

Syntax:

if(condition){
    code when condition is true
}
else{
    code when condition is false
}

Example:

if(number % 2 == 0){
    System.out.println("Even number");
}
else{
    System.out.println("Odd number");
}

=========================================================
3️⃣ ELSE-IF LADDER
=========================================================

Used when there are multiple conditions.

Syntax:

if(condition1){
}
else if(condition2){
}
else if(condition3){
}
else{
}

Example: grading system

if(marks >= 90){
    Grade A
}
else if(marks >= 75){
    Grade B
}
else if(marks >= 50){
    Grade C
}
else{
    Fail
}

=========================================================
4️⃣ NESTED IF
=========================================================

An if statement inside another if statement.

Example:

if(age >= 18){
    if(hasVoterID){
        Eligible to vote
    }
}

=========================================================
5️⃣ SWITCH STATEMENT
=========================================================

Used when checking a variable against multiple values.

Syntax:

switch(variable){

    case value1:
        code
        break;

    case value2:
        code
        break;

    default:
        code
}

Example:

switch(day){
    case 1: Monday
    case 2: Tuesday
}

=========================================================
PROGRAM EXAMPLES
=========================================================
*/

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example 1: Check if number is even or odd
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        // Example 2: Age eligibility
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        // Example 3: Grade system using else-if
        System.out.print("\nEnter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Result: Fail");
        }

        // Example 4: Switch statement
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }

        sc.close();
    }
}