// Write a program that demonstrates **type casting** by converting a `double`
public class problem05_variables {
    public static void main(String[] args) {
        int temp1 = 6;
        double temp2 = temp1;
        // implicit
        double temp3 = 8.45;
        int temp4 = (int) temp3;
        // explicit
        System.out.println(temp2);
        System.out.println(temp4);

    }
}