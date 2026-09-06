package assignments.sept_7;

import java.util.Scanner;

public class multiples_of_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        int limit = 10, i = 1;

        while (i <= limit) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
