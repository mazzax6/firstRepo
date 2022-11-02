import java.util.Scanner;

public class StaffProfile {
    public static void main (String[]arg) {

        Scanner object= new Scanner(System.in);
        System.out.println("Enter staff name" );

        String name = object.nextLine();
        System.out.println("Enter Age" );
        int age = object.nextInt();
        System.out.println("And finally, your salary" );
        double salary = object.nextDouble();

        System.out.println("Staff name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}
