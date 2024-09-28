import java.util.Scanner;
public class Calculate {

    public static void main(String[] args) {
       
        try (Scanner a = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            String strNum1 = a.nextLine();
            double num1 = Double.parseDouble(strNum1);
            System.out.print("Enter the second number: ");
            String strNum2 = a.nextLine();
            double num2 = Double.parseDouble(strNum2);
            
            
            //result

            System.out.println("Sum: " + (num1+num2));
            System.out.println("diff: " + (num1-num2));
            System.out.println("product: " + (num1*num2));
            if (num2 != 0) {
                System.out.println("quotient: " + (num1/num2));
                
            } else {
                System.out.print("Cannot divide by zero.");
            }
    
        
            
        } 
        System.out.println();
    }
}
