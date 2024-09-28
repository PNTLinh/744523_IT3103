import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows and columns: ");
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n <= 0 || m <= 0) {
                System.out.println("Please enter positive integers.");
                return;
            }

            int[][] matrix1 = new int[n][m];
            int[][] matrix2 = new int[n][m];

            System.out.println("Enter elements for Matrix 1:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements for Matrix 2:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Calculate sum
            int[][] sumMatrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Output results
            System.out.println("ResultMatrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(sumMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
