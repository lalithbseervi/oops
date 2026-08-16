package constructs.conditional;

public class grade_calc {
    public static void main(String[] args) {
        int marks = 89;
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else if (marks >= 50)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }
}
