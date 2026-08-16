package constructs.looping_statements;

public class mul_table {
    public static void main(String[] args) {
        int num = 5, stop = 10;
        
        for (int i = 1; i <= stop; i++)
            System.out.println(num + " * " + i + " = " + num * i);
    }
}
