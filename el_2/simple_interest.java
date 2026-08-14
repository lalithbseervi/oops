package el_2;

public class simple_interest {
    public static void main(String[] args) {
        int principal = 5000;
        double interest_rate = 0.08; // as percentage
        int time_period = 5;         // in years

        float interest = (float) (principal * interest_rate * time_period);
        float total_amount = (float) (principal * (1 + (interest_rate * time_period)));
        System.out.printf("Interest: %.2f\n", interest);
        System.out.printf("Total Amount: %.2f\n", total_amount);
    }
}
