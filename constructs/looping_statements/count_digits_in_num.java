package constructs.looping_statements;

public class count_digits_in_num {
    public static void main(String[] args) {
        int num = 1234, no_of_digits = 0, copy_num = num;

        while (num > 0) {
            num /= 10;
            no_of_digits++;
        }

        System.out.println("Number " + copy_num + " has " + no_of_digits + " digits");
    }
}
