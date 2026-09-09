package method_overloading;

public class polymorphism {
    void display(int a) {
        System.out.println("Given value: " + a);
    } 

    void display(double a) {
        System.out.println("Given value: " + a);
    } 

    public static void main(String[] args) {
        polymorphism eg = new polymorphism();
        eg.display(10);
        eg.display(10.99);
    }
}
