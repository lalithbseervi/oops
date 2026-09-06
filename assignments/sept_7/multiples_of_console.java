package assignments.sept_7;

import java.io.Console;

public class multiples_of_console {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter a positive number: ");
        int num = Integer.parseInt(c.readLine());
        int limit = 10, i = 1;

        while (i <= limit) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
