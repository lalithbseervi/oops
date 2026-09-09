package exception_handling;

public class eh_5 {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println(data);
        } catch (Exception E) {
            System.out.println("Can't divide integer by 0");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
    }
}
