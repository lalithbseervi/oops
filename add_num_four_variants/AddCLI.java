/**
 * Adder - sums two inputs given from CLI
 * eg: from root dir, i.e, /media/shared/sem_3/oops/programs, run: 
 * java add_num_four_variants.AddCLI 15 20
 */

package add_num_four_variants;

class Adder {
    int a, b, result;

    void display_result() {
        result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }
}

public class AddCLI {
    public static void main(String[] args) {
        Adder console_adder = new Adder();
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        console_adder.a = a;
        console_adder.b = b;

        console_adder.display_result();
    }
}
