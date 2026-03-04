/*
=========================================================
JAVA FUNDAMENTALS
Topic: Loops
File: loops.java
=========================================================

Loops allow a program to repeat a block of code multiple times.

Instead of writing the same code again and again, a loop lets us
execute it automatically until a condition becomes false.

Example:

Print numbers from 1 to 5

Without loop:
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);

With loop → much cleaner.

=========================================================
TYPES OF LOOPS IN JAVA
=========================================================

1. for loop
2. while loop
3. do-while loop

Each loop has a different use case.

=========================================================
1️⃣ FOR LOOP
=========================================================

Most commonly used loop when we know how many times we
want to repeat something.

Syntax:

for(initialization; condition; update){
    code to repeat
}

Example:

for(int i = 1; i <= 5; i++){
    System.out.println(i);
}

Explanation:

Initialization → int i = 1
Condition → i <= 5
Update → i++

Flow:

i = 1 → print
i = 2 → print
i = 3 → print
i = 4 → print
i = 5 → print
i = 6 → condition false → loop stops

=========================================================
2️⃣ WHILE LOOP
=========================================================

Used when we don't know how many times the loop will run.

Syntax:

while(condition){
    code
}

Example:

int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}

Important: update variable inside loop,
otherwise infinite loop occurs.

=========================================================
3️⃣ DO-WHILE LOOP
=========================================================

Runs the code at least once before checking condition.

Syntax:

do{
    code
}
while(condition);

Example:

int i = 1;

do{
    System.out.println(i);
    i++;
}
while(i <= 5);

Key difference:

while loop → checks condition first
do-while → runs first, checks later

=========================================================
INFINITE LOOPS
=========================================================

A loop that never stops.

Example:

while(true){
    System.out.println("Hello");
}

Program runs forever until manually stopped.

=========================================================
PROGRAM EXAMPLES
=========================================================
*/

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example 1: Print numbers 1 to 10 using FOR loop
        System.out.println("Numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Example 2: Print numbers using WHILE loop
        System.out.println("\nUsing WHILE loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Example 3: DO-WHILE loop
        System.out.println("\nUsing DO-WHILE loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // Example 4: Sum of first N numbers
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int k = 1; k <= n; k++) {
            sum = sum + k;
        }

        System.out.println("Sum of first " + n + " numbers = " + sum);

        sc.close();
    }
}