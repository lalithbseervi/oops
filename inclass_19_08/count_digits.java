package inclass_19_08;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean is_negative = false;

        if (num < 0) {
            num = -num;
            is_negative = true;
        }

        int no_of_digits = 0, copy_num = num;

        while (num > 0) {
            num /= 10;
            no_of_digits++;
        }

        System.out.println((is_negative ? "-" : "") + copy_num + " has " + no_of_digits + " digits");
    }
}
