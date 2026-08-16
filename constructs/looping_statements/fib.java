package constructs.looping_statements;

public class fib {
    public static void main(String[] args) {
        int terms = 5, n1 = 0, n2 = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
