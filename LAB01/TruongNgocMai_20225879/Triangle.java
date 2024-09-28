import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the height of the triangle (n): ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                // Move to the next line after printing one row
                System.out.println();
            }
        } 
    }
}
