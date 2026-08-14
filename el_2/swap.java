package el_2;

// Write a Java program to swap two numbers using a temporary variable
// and appropriate data types.

public class swap {
   public static void main(String[] args) {
        int a = 10; int b = 20; int c;
        System.out.println("Before swapping\na: " + a + " b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("After swapping\na: " + a + " b: " + b);
   } 
}
