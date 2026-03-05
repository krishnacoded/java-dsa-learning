// Write a program that checks whether a number is divisible by **both 3 and 5**.

public class problem18_operators {
    public static void main(String[] args) {
        int num = 18;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("The number is divisible by both 3 & 5");
        } else {
            System.out.println("The number is NOT divisible by both 3 & 5");
        }

    }
}