//  Write a program that declares variables of types `int`, `double`, `char`, and `boolean`, assigns values to them, and prints them.
public class problem01_variables {
    public static void main(String[] args) {
        int age = 21;
        double salary = 87500.50;
        char category = 'A';
        boolean isEmployee = true;
        System.out.println("My age is: " + age);
        System.out.println("My salary is: " + salary);
        if (isEmployee) {
            System.out.println("I am a current working as an employee.");
            System.out.println("I am employeed in " + category + " category.");
        } else {
            System.out.println("I am a freelancer");

        }

    }

}