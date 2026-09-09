package exception_handling;

public class eh_3 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        } catch (Exception e) {
            System.out.println("Parent exception occurred.");
        }
        System.out.println("End of code");
    }
}
