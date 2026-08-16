package constructs.conditional;

public class largest_of_two {
    public static void main(String[] args) {
        int a = 5, b = 10, greatest;

        if (a > b)
            greatest = a;
        else
            greatest = b;

        System.out.println("Largest = " + greatest);
    }
}
