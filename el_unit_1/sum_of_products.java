package el_unit_1;

import java.util.Scanner;

public class sum_of_products {
    public static void main(String[] args) {
        int array_size = 5;
        int prices[] = new int[array_size];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array_size; i++) {
            System.out.print("Enter price for product " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        for (int n : prices)
            sum += n;
        System.out.println("Final bill amount: " + sum);
    }
}
