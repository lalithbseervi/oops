package user_io;

public class cli_example {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String name = args[2];

        System.out.println("Given name: " + name);

        // System.out.println("First input (a) = " + a);
        // System.out.println("Second input (b) = " + b);

        System.out.println("Sum of a (" + a + ") + b (" + b + ") = " + (a + b));
    }
}
