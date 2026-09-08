package assignments.sept_7;

import java.io.*;

public class factorial_brr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a positive number: ");
        int a = Integer.parseInt(br.readLine());
        int fact = 1;

        for (int i = 1; i <= a; i++)
            fact = fact * i;
        
        System.out.println("Factorial of " + a + " = " + fact);
    }
}
