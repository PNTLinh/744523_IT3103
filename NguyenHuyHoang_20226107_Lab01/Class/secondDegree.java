// 2.2.6
// he phuong trinh

import java.util.Scanner;

public class secondDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a1: ");
        double a1 = sc.nextDouble();
        System.out.print("b1: ");
        double b1 = sc.nextDouble();
        System.out.print("c1: ");
        double c1 = sc.nextDouble();
        System.out.print("a2: ");
        double a2 = sc.nextDouble();
        System.out.print("b2: ");
        double b2 = sc.nextDouble();
        System.out.print("c2: ");
        double c2 = sc.nextDouble();
        
        double det = a1 * b2 - a2 * b1;
        if (det == 0){
            if (c1 / c2 == a1 / a2) {
                // trung nhau
                System.out.println("vo so nghiem");
            }
            else {
                System.out.println("vo nghiem");
            }
        } 
        else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            System.out.println("Nghiem cua he phuong trinh 1:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
       
    }
}