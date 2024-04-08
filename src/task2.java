import java.util.Scanner;

public class task2 {
    /**
     * This method calculates the average of the elements in an integer array.
     *
     * It iterates through the array and sums up all the elements.
     * Then, it calculates the average by dividing the sum by the number of elements (array length).
     * The average is returned as a double data type.
     *
     * @param array The array of integers for which we need to find the average.
     * @return avg The calculated average of the elements in the array.
     */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double avg = findAverage(array);
        System.out.println(avg);
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double avg = (double) sum / array.length;
        return avg;
    }
}
