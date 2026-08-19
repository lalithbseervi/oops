package inclass_19_08;

public class nature_of_roots {
    public static void main(String[] args) {
        // 1, -4, 4, d == 0
        // 1, -5, 6, d > 0
        // 5, 4, 3, d < 0
        int a = 1, b = -4, c = 4;

        int d = (b * b - 4 * a * c);

        if (d > 0) {
            System.out.println("Roots are real and unequal\nDiscriminant = " + d);
        } else if (d == 0) {
            System.out.println("Roots are real and equal\nDiscriminant = " + d);
        } else {
            System.out.println("Roots are imaginary and unequal\nDiscriminant = " + d);
        }
    }
}
