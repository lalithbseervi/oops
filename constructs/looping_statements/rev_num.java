package constructs.looping_statements;

public class rev_num {
    public static void main(String[] args) {
        int num = 124, rev_num = 0;

        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed num = " + rev_num);
    }
}
