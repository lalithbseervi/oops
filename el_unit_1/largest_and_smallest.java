package el_unit_1;

public class largest_and_smallest {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 6, 2 };
        int largest = arr[0], smallest = arr[0];

        for (int a : arr) {
            if (a > largest)
                largest = a;
            else if (a < smallest)
                smallest = a;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
