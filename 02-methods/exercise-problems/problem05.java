/*Write a method:
reverseNumber(int n)

that returns the reversed number.

Example:
Input: `1234`  
Output: `4321
 */

public class problem05 {

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int last_digit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + last_digit;

        }
        return reverse;

    }

    public static void main(String[] args) {

        int result = reverseNumber(324);
        System.out.print(result);
    }
}