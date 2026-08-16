package constructs.looping_statements;

public class factorial {
    public static void main(String[] args) {
        int n = 4, fact = 1;
        
        while (n > 0) {
            fact *= n;
            n--;
        }

        System.out.println("Factorial = " + fact);
    }
}
