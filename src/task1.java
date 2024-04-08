import java.util.Scanner;

public class task1 {
    /**
     * This method returns the smallest number from an array.
     *
     * It uses a for loop to iterate through the array and compares each element with the current minimum value.
     * If an element is smaller than the current minimum, it is updated.
     *
     * Time complexity: O(n), where n is the length of the input array.
     * This is because the for loop iterates through the array once.
     *
     * @param array The array of integers where we need to find the smallest.
     * @return min The smallest integer from the array
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Length of the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified length
        int[] array = new int[n];

        System.out.println("What's the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the findMin function and print the result
        System.out.println("The minimum element is: " + findMin(array));
    }

    public static int findMin(int[] array) {
        int min = array[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
