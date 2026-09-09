package el_unit_1;

import java.lang.*;
import java.io.Console;

public class num_classifier {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter an integer value: ");
        int n = Integer.parseInt(c.readLine());

        if (n > 0)
            System.out.println(n + " is positive");
        else if (n < 0)
            System.out.println(n + " is negative");
        else
            System.out.println(n + " is zero");
    }
}