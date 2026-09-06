package assignments.sept_7;

import java.io.Console;

public class factorial_console {
    public static void main(String[] args) {
        Console c = System.console();

        System.err.print("Enter a positive number: ");
        int a = Integer.parseInt(c.readLine());
        int fact = 1;

        for (int i = 1; i <= a; i++)
            fact = fact * i;
        
        System.out.println("Factorial of " + a + " = " + fact);
    }
}
