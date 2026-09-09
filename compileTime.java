class PerimeterCalculator {
    static int perimeter(int a) {
        return 4 * a;
    }

    static int perimeter(int l, int b) {
        return 2 * (l + b);
    }

    static double perimeter(float r) {
        return 2 * 3.14159 * r;
    }

    static int perimeter(int a, int b, int c) {
        return a + b + c;
    }
}

public class compileTime {
    public static void main(String[] args) {
        System.out.println("Perimeter of square having length 5 = " + PerimeterCalculator.perimeter(5));
        System.out.println("Perimeter of rectangle having length 5 and breadth 10 = " + PerimeterCalculator.perimeter(5, 10));
        System.out.println("Perimeter of circle having radius = " + PerimeterCalculator.perimeter(5.25f));
        System.out.println("Perimeter of triangle having lengths 5, 6, 7 = " + PerimeterCalculator.perimeter(5, 6, 7));
    }
}
