package assignments.sept_7;

import java.io.Console;

public class triangle_pattern_console {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter a positive number: ");
        int n = Integer.parseInt(c.readLine());

        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));
    }
}
