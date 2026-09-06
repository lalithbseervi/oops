package assignments.sept_7;

import java.util.Scanner;

public class student_details_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.next();

        System.out.print("Enter student's age: ");
        int age = sc.nextInt();

        System.out.println("\nStudent Name: " + name + "\nAge: " + age);
    }
}
