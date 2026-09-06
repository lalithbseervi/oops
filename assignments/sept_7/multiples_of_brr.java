package assignments.sept_7;

import java.io.*;

public class multiples_of_brr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a positive number: ");
        int num = Integer.parseInt(br.readLine());
        int limit = 10, i = 1;

        while (i <= limit) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
