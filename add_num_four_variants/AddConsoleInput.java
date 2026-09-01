/**
 * Adder - sums two inputs given from Console
 */

package add_num_four_variants;

import java.io.Console;

class Adder {
    Console c = System.console();
    int a, b, result;

    void take_inputs() {
        a = Integer.parseInt(c.readLine("Enter the value for a: "));
        b = Integer.parseInt(c.readLine("Enter the value for b: "));
    }

    void display_result() {
        result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }
}

public class AddConsoleInput {
    public static void main(String[] args) {
        Adder console_adder = new Adder();
        console_adder.take_inputs();
        console_adder.display_result();
    }
}
