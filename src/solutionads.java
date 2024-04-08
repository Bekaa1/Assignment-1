import java.util.Scanner;

public class solutionads {

    public static void main(String[] args) {
        System.out.println("Enter the problem number (1 - 10):");
        Scanner scanner = new Scanner(System.in);
        int problemNumber = scanner.nextInt();

        int[] sampleArray = {3,7,8,9,5};
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

    // Find the minimum element in an array
    public static int findMin(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(n - 1, arr));
    }

    // Calculate the average of an array
    public static double calculateAverage(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return (arr[n - 1] + (n - 1) * calculateAverage(n - 1, arr)) / n;
    }

    // Check if a number is prime
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

    // Calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Calculate the power of a number
    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }

    // Reverse an array
    public static void reverseArray(int n, int[] arr) {
        if (n == 1) {
            System.out.print(arr[0] + " ");
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reverseArray(n - 1, arr);
    }

    // Check if a string contains a digit
    public static boolean containsNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Calculate the binomial coefficient
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Calculate the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
