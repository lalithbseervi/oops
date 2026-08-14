package constructs.conditional;

public class voting_eligibility {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are ineligible to vote.");
    }
}
