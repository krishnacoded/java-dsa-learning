/*Write a method:
isPalindrome(int n)

that checks if a number is a palindrome.

Example:
Input: `121`  
Output: `Palindrome`
 */

public class problem06 {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int last_digit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + last_digit;
        }
        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        boolean result = isPalindrome(45654);
        System.out.print(result);
    }
}