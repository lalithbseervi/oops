package constructs.conditional;

public class century_year {
    public static void main(String[] args) {
        int year = 2100;

        if (year % 100 == 0)
            System.out.println("Year " + year + " is a century year.");
        else
            System.out.println("Year " + year + " is not a century year.");
    }
}
