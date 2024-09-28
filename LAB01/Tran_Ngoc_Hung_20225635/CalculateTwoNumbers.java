import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification+= strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification+= strNum2;

        double num1 = Double.parseDouble(strNum1), num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        int quotient = (int) (num1 / num2);
        int division = (int) (num1%num2);
        JOptionPane.showMessageDialog(null,"Sum is " + sum);
        JOptionPane.showMessageDialog(null,"Difference is " + difference);
        JOptionPane.showMessageDialog(null,"Product is " + product);
        JOptionPane.showMessageDialog(null,"Quotient is " + quotient);
        System.exit(0);
    }
}