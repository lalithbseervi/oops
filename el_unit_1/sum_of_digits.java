package el_unit_1;

import java.lang.*;
import java.io.Console;

public class sum_of_digits {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter an integer value: ");
        int n = Integer.parseInt(c.readLine());
        int copy_n = n, sum = 0;
        
        while (copy_n > 0) {
            sum += copy_n % 10;
            copy_n /= 10;
        }

        System.out.println("Sum of digits of " + n + " is " + sum);
    }
}
