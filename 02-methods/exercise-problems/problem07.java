/*Create a method:
sumOfDigits(int n)
that returns the sum of digits of a number.

Example:
Input: `245`  
Output: `11`
 */

public class problem07 {
    public static int sumofDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int last_digit = n % 10;
            n = n / 10;
            sum = sum + last_digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumofDigits(4382);
        System.out.print(result);

    }
}