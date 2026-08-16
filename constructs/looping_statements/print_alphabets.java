package constructs.looping_statements;

public class print_alphabets {
    public static void main(String[] args) {
        int start = 65; int stop = 90;

        for (int i = start; i <= stop; i++) {
            char ch = (char) i;
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }
}
