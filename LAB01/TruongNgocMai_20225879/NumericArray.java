import java.util.Arrays;
import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int[] numbers = new int[n];

            System.out.println("Enter " + n );
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Calculate sum
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Sort the array
            Arrays.sort(numbers);

            // Output results
            System.out.println("Sorted numbers: " + Arrays.toString(numbers));
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (double) sum / n);
        }
    }
}
