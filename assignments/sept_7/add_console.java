package assignments.sept_7;

import java.io.Console;

public class add_console {
    public static void main(String[] args) {
        Console c = System.console();
        
        System.err.print("Enter the first number: ");
        int a = Integer.parseInt(c.readLine());

        System.err.print("Enter the second number: ");
        int b = Integer.parseInt(c.readLine());

        int result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }
}
