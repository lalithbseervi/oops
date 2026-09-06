package assignments.sept_7;

public class multiples_of_cli {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int limit = 10, i = 1;

        while (i <= limit) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
