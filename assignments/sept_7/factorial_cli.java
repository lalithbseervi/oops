package assignments.sept_7;

public class factorial_cli {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = 1; i <= a; i++)
            fact = fact * i;
        
        System.out.println("Factorial of " + a + " = " + fact);
    }
}
