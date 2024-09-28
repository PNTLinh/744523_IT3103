package week1.FirstProgram;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Handle division by zero for the quotient
        double quotient = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }

        System.exit(0);
    }
}
