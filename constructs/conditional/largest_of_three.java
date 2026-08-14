package constructs.conditional;

public class largest_of_three {
    public static void main(String[] args) {
        int a = 100, b = 7, c = 77;

        if (a >= b) {
            if (a >= c)
                System.out.println(a + " is largest");
            else
                System.out.println(c + " is largest");
        } else {
            if (b >= c)
                System.out.println(b + " is largest");
            else
                System.out.println(c + " is largest");
        }
    }
}
