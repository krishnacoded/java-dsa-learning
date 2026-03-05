/*Write a program that uses **compound assignment operators** (`+=`, `-=`, `*=`, `/=`) on a variable and prints the results.
 */
public class problem20_operators {
    public static void main(String[] args) {
        int a = 10, b = 4, c = 12, d = 14, e = 6;
        a += b;
        c -= b;
        d *= b;
        e /= b;
        System.out.println("a: " + a);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);

    }
}