package classes_and_objects;

public class sum {
    int a, b;

    void display_sum() {
        System.out.println("Sum of " + a + " + " + b + " = " + (a + b));
    }

    public static void main(String[] args) {
        sum s = new sum();
        s.a = 5;
        s.b = 10;
        s.display_sum();
    }
}
