import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which problem would you like to solve? Enter a number between 1 and 10.");
        Scanner sc = new Scanner(System.in);
        int problemNumber = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 0};
        int num = 5;

        switch (problemNumber) {
            case 1:
                long startTime = System.nanoTime();
                System.out.println("Result: " + findSmallestNumber(num, arr) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(n)");
                break;

            case 2:
                startTime = System.nanoTime();
                System.out.println("Result: " + calculateAverage(num, arr) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(n)");
                break;

            case 3:
                startTime = System.nanoTime();
                if (isPrime(17)) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Composite");
                }
                System.out.println("Result: " + isPrime(17) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(sqrt(n))");
                break;

            case 4:
                startTime = System.nanoTime();
                System.out.println("Result: " + calculateFactorial(5) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(n)");
                break;

            case 5:
                startTime = System.nanoTime();
                System.out.println("Result: " + calculateFibonacci(17) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(2^n)");
                break;

            case 6:
                startTime = System.nanoTime();
                System.out.println("Result: " + calculatePower(2, 10) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(n)");
                break;

            case 7:
                System.out.println("Result: ");
                reverseArray(num, arr);
                startTime = System.nanoTime();
                System.out.println(
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                                "\nTime complexity: O(n)");
                break;

            case 8:
                System.out.println("Result: ");
                System.out.println(containsOnlyDigits("4dsadsa", 0) ? "YES" : "NO");
                startTime = System.nanoTime();
                System.out.print(
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                                "\nTime complexity: O(n)");
                break;

            case 9:
                startTime = System.nanoTime();
                System.out.println("Result: " + calculateBinomialCoefficient(7, 3) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(2^n)");
                break;

            case 10:
                startTime = System.nanoTime();
                System.out.println("Result: " + findGreatestCommonDivisor(10, 7) +
                        "\nRuntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\nTime complexity: O(log n)");
                break;
        }
    }

    /**
     * This method finds the smallest number in the array by using a recursive algorithm.
     * It takes the last element of the array and compares it with the smallest number found in the rest of the array.
     * arraySize The size of the array. This is used for the recursion.
     * arr The array of numbers.
     */
    public static int findSmallestNumber(int arraySize, int[] arr) {
        if (arraySize == 0) {
            throw new IllegalArgumentException("The array cannot be empty.");
        }

        if (arraySize == 1) {
            return arr[0];
        }

        int smallestNumberInRestOfArray = findSmallestNumber(arraySize - 1, arr);
        return Math.min(arr[arraySize - 1], smallestNumberInRestOfArray);
    }

    /**
     * This method calculates the average of the numbers in the array using a recursive algorithm.
     * It adds the last number to the sum of the rest of the numbers and divides the total by the number of elements.
     * The size of the array. This is used for the recursion.
     * arr The array of numbers.
     */
    public static double calculateAverage(int arraySize, int[] arr) {
        if (arraySize == 0) {
            throw new IllegalArgumentException("The array cannot be empty.");
        }

        if (arraySize == 1) {
            return arr[0];
        }

        double sumOfRestOfNumbers = calculateAverage(arraySize - 1, arr) * (arraySize - 1);
        return (arr[arraySize - 1] + sumOfRestOfNumbers) / arraySize;
    }

    /**
     * This method checks if a number is prime using a deterministic method.
     * It checks if the number is divisible by any number up to its square root.
     * number The number to check.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * This method calculates the factorial of a number using a recursive algorithm.
     * It multiplies the number by the factorial of the number minus one.
     * number The number to calculate the factorial of.
     */
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number cannot be less than 0.");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    /**
     * This method calculates the Fibonacci number at a given position using a recursive algorithm.
     * It adds the Fibonacci numbers at the previous two positions.
     * position The position of the Fibonacci number to calculate.
     */
    public static int calculateFibonacci(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("The position cannot be less than 0.");
        }

        if (position == 0 || position == 1) {
            return position;
        }

        return calculateFibonacci(position - 1) + calculateFibonacci(position - 2);
    }

    /**
     * This method calculates the power of a number using a recursive algorithm.
     * It multiplies the number by itself the specified number of times.
     * base The base number.
     * exponent The exponent.
     */
    public static int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("The exponent cannot be less than 0.");
        }

        if (exponent == 0) {
            return 1;
        }

        return base * calculatePower(base, exponent - 1);
    }

    /**
     * This method reverses the order of the elements in an array using a recursive algorithm.
     * It prints the last element of the array and then reverses the rest of the array.
     * arraySize The size of the array. This is used for the recursion.
     * arr The array of numbers.
     */
    public static void reverseArray(int arraySize, int[] arr) {
        if (arraySize == 0) {
            return;
        }

        System.out.print(arr[arraySize - 1] + " ");
        reverseArray(arraySize - 1, arr);
    }

    /**
     * This method checks if a string contains only digits using a recursive algorithm.
     * It checks if the character at the current position is a digit and then checks the rest of the string.
     * str The string to check.
     * index The current index in the string.
     */
    public static boolean containsOnlyDigits(String str, int index) {
        if (index == str.length()) {
            return true;
        }

        if (!Character.isDigit(str.charAt(index))) {
            return false;
        }

        return containsOnlyDigits(str, index + 1);
    }

    /**
     * This method calculates the binomial coefficient using a recursive algorithm.
     * It uses the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     * n The value of n in the binomial coefficient formula.
     * k The value of k in the binomial coefficient formula.
     */
    public static int calculateBinomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || n < k) {
            throw new IllegalArgumentException("Invalid values for n and k.");
        }

        if (k == 0 || n == k) {
            return 1;
        }

        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }

    /**
     * This method finds the greatest common divisor (GCD) of two numbers using the Euclidean algorithm and a recursive approach.
     * It finds the remainder of the division of the two numbers and then finds the GCD of the second number and the remainder.
     *
     * a The first number.
     * b The second number.
     */
    public static int findGreatestCommonDivisor(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both numbers must be non-negative.");
        }

        if (b == 0) {
            return a;
        }

        return findGreatestCommonDivisor(b, a % b);
    }
}
