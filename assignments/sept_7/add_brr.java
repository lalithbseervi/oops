package assignments.sept_7;

import java.io.*;

public class add_brr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter the second number: ");
        int b = Integer.parseInt(br.readLine());

        int result = a + b;
        System.out.println("Sum of " + a + " + " + b + " = " + result);
    }    
}
