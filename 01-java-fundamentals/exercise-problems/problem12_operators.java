//  Write a program that checks whether a number is **even or odd** using the modulus operator.

public class problem12_operators {
    public static void main(String[] args) {
        int num = 15;
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}