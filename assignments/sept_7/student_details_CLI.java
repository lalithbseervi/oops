package assignments.sept_7;

public class student_details_CLI {
    public static void main(String[] args) {
        String name = args[0];
        Integer age = Integer.parseInt(args[1]);
        System.out.println("Student Name: " + name + "\nAge: " + age);
    }
}
