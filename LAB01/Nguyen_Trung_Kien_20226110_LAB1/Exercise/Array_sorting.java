import java.util.Arrays;
import java.util.Scanner;

public class Array_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] KienArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            KienArray[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(KienArray));
        Arrays.sort(KienArray);

        System.out.println("Sorted Array: " + Arrays.toString(KienArray));

        int sum = 0;
        for (int num : KienArray) {
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        sc.close();
    }
}
