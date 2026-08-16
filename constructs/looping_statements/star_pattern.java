package constructs.looping_statements;

public class star_pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++)
            System.out.println("* ".repeat(i));

        System.out.println();
    }
}
