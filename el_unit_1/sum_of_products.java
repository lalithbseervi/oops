package el_unit_1;

public class sum_of_products {
    public static void main(String[] args) {
        int prices[] = { 30, 160, 95, 56 };
        int sum = 0;
        for (int n : prices)
            sum += n;
        System.out.println("Final bill amount: " + sum);
    }
}
