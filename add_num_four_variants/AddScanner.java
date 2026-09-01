/**
 * Adder - sums two inputs given from Scanner
 */

package add_num_four_variants;

import java.lang.*;
import java.util.Scanner;

class Add {
    int a, b, result;
    Scanner sc = new Scanner(System.in);

    void input_nums() {
        System.out.print("Enter the value for a: ");
        a = sc.nextInt();

        System.out.print("\nEnter the value for b: ");
        b = sc.nextInt();
    }

    void display_result() {
        result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }
}

public class AddScanner {
    public static void main(String[] args) {
        Add adder = new Add();
        adder.input_nums();
        adder.display_result();
    }
}
