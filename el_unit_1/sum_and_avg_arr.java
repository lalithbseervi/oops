package el_unit_1;

public class sum_and_avg_arr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 10, -1 };
        int average = 0, sum = 0;
        for (int n : arr)
            sum += n;

        average = sum / arr.length;

        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }
}
