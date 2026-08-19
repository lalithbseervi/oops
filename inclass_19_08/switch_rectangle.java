package inclass_19_08;

import java.util.Scanner;
import java.lang.Math;

public class switch_rectangle {
    public static void main(String[] args) {
        int length, width, choice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = sc.nextInt();
        
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextInt();

        System.out.print("\nCalculations:\n1. Area\n2. Perimeter\n3. Diagonal\n4. Exit\nChoose an option: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Area of rectangle = " + length * width);
                break;
            case 2:
                System.out.println("Perimeter of rectangle = " + 2 * (length + width));
                break;
            case 3:
                System.out.println("Diagonal of rectange = " + Math.sqrt((length * length + width * width)));
                break;
            case 4:
                System.out.println("Program terminated.");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
