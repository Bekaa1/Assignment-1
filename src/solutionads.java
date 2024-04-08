import java.util.Scanner;

public class solutionads {

    public static void main(String[] args) {
        System.out.println("Enter the problem number (1 - 10):");
        Scanner scanner = new Scanner(System.in);
        int problemNumber = scanner.nextInt();

        int[] sampleArray = {3,7,10,9,5};
        int arraySize = 5;

        switch (problemNumber) {
            case 1:
                System.out.println("Result: " + findMin(arraySize, sampleArray));
                break;
            case 2:
                System.out.println("Result: " + calculateAverage(arraySize, sampleArray));
                break;
            case 3:
                System.out.println(isPrime(17) ? "Prime" : "Composite");
                break;
            case 4:
                System.out.println("Result: " + factorial(5));
                break;
            case 5:
                System.out.println("Result: " + fibonacci(17));
                break;
            case 6:
                System.out.println("Result: " + power(2, 10));
                break;
            case 7:
                System.out.print("Result: ");
                reverseArray(arraySize, sampleArray);
                break;
            case 8:
                System.out.println("Result: " + (containsNumber("4dsadsa") ? "YES" : "NO"));
                break;
            case 9:
                System.out.println("Result: " + binomialCoefficient(7, 3));
                break;
            case 10:
                System.out.println("Result: " + gcd(10, 7));
                break;
            default:
                System.out.println("Invalid problem number.");
        }
    }

    public static int findMin(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(n - 1, arr));
    }
    /**
     * This method finds the minimum number in an array using recursion.
     * It compares each element of the array to find the smallest value.
     * @param n The number of elements in the array, used for recursion.
     * @param arr The array of numbers.
     * @return The smallest number found in the array.
     */
    public static double calculateAverage(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return (arr[n - 1] + (n - 1) * calculateAverage(n - 1, arr)) / n;
    }
    /**
    * This function calculates the average of an array using recursion.
    * The sum of all elements in the array is calculated and then divided by the total number of elements.
     * @param n The number of elements in the array.
     * @param arr The array of elements.
    * @return The average value of the elements in the array, as a double.
 */

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * This function is designed to identify whether a given number is a prime or composite number.
     * It employs two specific conditions to make this determination.
     * @param num the number that we're evaluating
     * @return true if the number is found to be prime, and false otherwise
     */

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    /**
     * This function calculates the factorial of a given number using recursion.
     * It works by multiplying the given number 'n' by the factorial of 'n-1', and so on,
     * until the base case of 1 is reached. This is equivalent to calculating n! = n*(n-1)*(n-2)*...*1.
     * @param n the number whose factorial is to be calculated
     * @return the factorial of the given number
     */

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /**
     * Calculates the Fibonacci sequence up to a given number using recursion.
     * Returns the sum of all terms up to the given number.
     * @param n the upper limit of the Fibonacci sequence to calculate
     * @return the sum of all terms in the Fibonacci sequence up to the given number
     */

    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }
    /**
     * Calculates the power of a number using recursion.
     * Repeatedly multiplies the base number by itself until the power is reached.
     * @param base the number to be raised to a power
     * @param exponent the power to raise the base number to
     * @return the result of base^power
     */

    public static void reverseArray(int n, int[] arr) {
        if (n == 1) {
            System.out.print(arr[0] + " ");
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reverseArray(n - 1, arr);
    }
    /**
     * This function reverses array using recursion
     * @param arr our array
     * @param n number of elements in the array
     */
    public static boolean containsNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    /**
     * Determines if a string contains any digits.
     * Checks each character using Character.isDigit
     * @param s the string to check
     * @param index the current index being checked
     * @return true if a digit is found, false otherwise
     */

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    /**
     * Calculates the binomial coefficient C(n, k).
     * @param n the value of n in the formula
     * @param k the value of k in the formula
     * @return the result of the calculation
     */

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    /**
     * This function calculates the GCD of two numbers using the Euclidean algorithm and recursion.
     * @param a the first number
     * @param b the second number
     * @return the GCD of the two numbers
     */

}
