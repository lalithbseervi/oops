package assignments.sept_7;

import java.io.Console;
import java.util.Scanner;

public class triangle_pattern_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));
    }
}
