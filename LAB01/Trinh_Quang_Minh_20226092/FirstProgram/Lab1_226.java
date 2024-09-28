package week1.FirstProgram;
import java.util.Scanner;
public class Lab1_226 {
    static void first_degree() {
        Scanner sc = new Scanner(System.in);
        double a , b , x ;
        System.out.println(" a = ");
        a = sc.nextDouble();
        System.out.println(" b =");
        b= sc.nextDouble() ;
        if(a==0) {
            System.out.println("a#0! Please re-enter! ");
            first_degree();
        }
        x=-b/a ;
        System.out.println("x"+"="+x);
        System.exit(0);
    }
    static void system_first_degree() {
        Scanner sc = new Scanner(System.in);
        double a11,a12,b1 ,a21, a22, b2 , x1,x2 ;
        System.out.println(" a11 = ");
        a11 = sc.nextDouble();
        System.out.println(" a12 = ");
        a12 = sc.nextDouble();
        System.out.println(" b1 =");
        b1= sc.nextDouble() ;
        System.out.println(" a21 = ");
        a21 = sc.nextDouble();
        System.out.println(" a22 = ");
        a22 = sc.nextDouble();
        System.out.println(" b2 =");
        b2= sc.nextDouble() ;
        double D, D1,D2 ;
        D = a11*a22 - a21*a12 ;
        D1 = b1*a22-b2*a12 ;
        D2 = a11*b2 - a21*b1;
        if (D!=0) {
            x1=D1/D;
            x2=D2/D;
            System.out.println("x1"+"="+ x1 +"\n");
            System.out.println("x2"+"="+ x2 +"\n");
        }
        else if(D==0 && (D1!= 0 || D2!= 0)) {
            System.out.println("No solution");
        }
        else if(D==0 && D1==0 && D2==0) {
            System.out.println("Infinite Solution: "+ a11+"x1"+"+"+a12+"x2"+"="+b1);

        }
    }
    static void second_degree() {
        Scanner sc = new Scanner(System.in);
        double a , b,c , x ,x1,x2 ;
        System.out.println(" a = ");
        a = sc.nextDouble();
        System.out.println(" b =");
        b= sc.nextDouble() ;
        System.out.println(" c =");
        c = sc.nextDouble() ;
        if(a==0) {
            System.out.println("This is first_degree equation");
            first_degree();
        }
        double delta ;
        delta = b*b-4*a*c ;
        if(delta>0) {
            x1 = (-b + Math.sqrt(delta))/ (2*a) ;
            x2 = (-b - Math.sqrt(delta))/ (2*a) ;
            System.out.println("The equation has two distinct roots: \n");
            System.out.println("x1 =" + x1 +"\n");
            System.out.println("x2 =" + x2 +"\n");
        }
        else if(delta == 0) {
            x = -b/(2*a) ;
            System.out.println("The equation has a unique root: "+ x);
        }
        else if(delta < 0) {
            System.out.println("Can't solution");
        }
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. The first-degree equation (linear equation) with one variable \n");
            System.out.println("2. The system of first-degree equations (linear system) with two variables \n");
            System.out.println("3. The second-degree equation with one variable \n");
            System.out.println("4. Exit \n");

            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose option 1.");
                    first_degree();
                    break;
                case 2:
                    System.out.println("You chose option 2.");
                    system_first_degree();
                    break;
                case 3:
                    System.out.println("You chose option 3.");
                    second_degree();
                    break;
                case 4:
                    System.out.println("Exit program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please re-enter.");
            }
        }


    }
}