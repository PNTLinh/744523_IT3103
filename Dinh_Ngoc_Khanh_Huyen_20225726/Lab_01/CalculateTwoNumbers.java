import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
     public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Sum ";
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1) ;
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2); 
        double sum = num1 + num2;
        double dif = num1 - num2;
        double product = num1 * num2;
        double meo = num1/num2;
        int quotient = (int) Math.floor(meo);
        int div = (int) (num1%num2);
        strNotification += sum + " \n Difference: " + dif + " \n Product: " + product + " \n Quotient: " + quotient + "\n Divisor: "+ div ;

        JOptionPane.showMessageDialog(null,strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
     }
}