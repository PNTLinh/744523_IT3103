import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle (n): ");
        int trungkienit = scanner.nextInt();

        for (int i = 1; i <= trungkienit; i++) {
            for (int j = trungkienit - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        scanner.close();
    }
}
