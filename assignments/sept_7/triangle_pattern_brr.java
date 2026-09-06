package assignments.sept_7;

import java.io.*;

public class triangle_pattern_brr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a positive number: ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));
    }
}
