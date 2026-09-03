package strings;

public class StringCreation {
    public static void main(String[] args) {
        int num = 30;
        String s1 = String.valueOf(num);

        System.out.println("Numeric value: " + s1);

        String s2 = new String("STRING DATA");
        String s4 = new String("JAVA");
        String s3 = String.valueOf(s2);

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        System.out.println(s2 + s3);

        StringCreation null_obj = null;
        String fromNull = String.valueOf(null_obj);
    }
}
