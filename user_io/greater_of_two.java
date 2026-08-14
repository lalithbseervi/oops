package user_io;

import java.util.Scanner;

public class greater_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int greater = a > b ? a : b;
        System.out.println("Greater of the two is " + greater);
    }
}
