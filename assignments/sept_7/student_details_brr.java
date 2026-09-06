package assignments.sept_7;

import java.io.*;

public class student_details_brr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter student's name: ");
        String name = br.readLine();

        System.out.println("Enter student's age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Student name: " + name + "\nAge: " + age);
    }    
}
