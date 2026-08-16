package constructs;

public class operators {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // relational operators
        System.out.println("Is Exactly Equal: " + (a == b));
        System.out.println("Is Not Equal: " + (a != b));
        System.out.println("a less than b: " + (a < b));
        System.out.println("a greater than b: " + (a > b));
        System.out.println("a less than or equal to b: " + (a <= b));
        System.out.println("a greater than or equal to b: " + (a >= b));

        // bitwise operators
        System.out.println("a bitwise AND b: " + (a & b));
        System.out.println("a bitwise OR b: " + (a | b));
        System.out.println("bitwise NOT b: " + (~b));
        System.out.println("a bitwise XOR b: " + (a ^ b));
        System.out.println("a left shift b: " + (a << b));
        System.out.println("a right shift b: " + (a >> b));

        // unary operators
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("b-- = " + (b--));
        System.out.println("--b = " + (--b));
    }
}
