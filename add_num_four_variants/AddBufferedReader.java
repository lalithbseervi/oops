/**
 * Adder - sums two inputs given from BufferedReader
 */

package add_num_four_variants;

import java.io.*;

class Adder {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, result;

    void take_inputs() throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
    }

    void display_result() {
        result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }
}

public class AddBufferedReader {
    public static void main(String[] args) throws IOException {
        Adder console_adder = new Adder();
        console_adder.take_inputs();
        console_adder.display_result();
    }
}
