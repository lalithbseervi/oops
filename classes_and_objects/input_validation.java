package classes_and_objects;

import java.util.Scanner;

public class input_validation {
    /** write a java program to display the square and cube of a positive number 
     * if the user is entering a negative number, it has to dispaly "wrong input"
     * use scanner class for accepting input
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        while(true) {
            System.out.print("Enter a positive integer: ");
            input = sc.nextInt();

            if (input < 1)
                continue;
            else
                break;
        }

        System.out.println("Square of " + input + " = " + (input * input));
        System.out.println("Cube of " + input + " = " + (input * input * input));
    }
}
