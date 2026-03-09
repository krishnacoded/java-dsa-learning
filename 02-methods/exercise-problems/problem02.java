/*Create a method:
maxOfThree(int a, int b, int c)
that returns the largest number among the three.

Example:
Input: `3 9 5`  
Output: `9`
 */
public class problem02 {

    public static int maxofThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c && b >= a) {
            return b;
        } else if (c >= a && c >= b) {
            return c;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = maxofThree(6, 5, 6);
        System.out.print(result);
    }
}