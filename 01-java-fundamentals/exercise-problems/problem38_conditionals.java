/* Write a program that implements a **simple calculator using switch**.

Input:
number1
operator (+ - \* /)
number2

Output the result. */

import java.util.Scanner;

public class problem38_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operator ('+', '-', '*', '/'): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': {
                System.out.print("The sum: " + num1 + num2);

            }
                break;
            case '-': {
                System.out.print("The difference is: " + (num1 - num2));

            }
                break;
            case '*': {
                System.out.print("The product: " + (num1 * num2));

            }
                break;
            case '/': {
                if (num2 != 0) {
                    System.out.print("The quotient: " + (num1 / num2));
                } else {
                    System.out.print("Can't Divide by 0.");
                }
            }
                break;
            default: {
                System.out.print("Invalid operator");

            }
        }

        sc.close();

    }
}
//