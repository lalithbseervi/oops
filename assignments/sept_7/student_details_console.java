package assignments.sept_7;

import java.io.Console;

public class student_details_console {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter student's name: ");
        String name = c.readLine();

        System.out.print("Enter student's age: ");
        int age = Integer.parseInt(c.readLine());

        System.out.println("Student name: " + name + "\nAge: " + age);
    }    
}
