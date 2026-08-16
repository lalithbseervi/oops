package constructs.looping_statements;

public class num_palindrome {
    public static void main(String[] args) {
        int number = 12321, reversed_num = 0, copy_num = number;

        while (copy_num > 0) {
            reversed_num = reversed_num * 10 + copy_num % 10;
            copy_num /= 10;
        }

        if (number == reversed_num)
            System.out.println("Given number is a palindrome");
        else
            System.out.println("Given number is not a palindrome");
    }
}
