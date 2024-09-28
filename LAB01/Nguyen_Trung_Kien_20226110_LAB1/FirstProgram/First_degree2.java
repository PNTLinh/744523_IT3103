// Nguyen Trung Kien 20226110
// Dua ra man hinh 1 o message thong bao
// Nhap 2 so a,b 
// In ra man hinh ket qua tinh toan pt bac nhat 2 bien

import java.util.Scanner;
import javax.swing.*;

public class First_degree2 {
    public static void main(String[] args) { 
        System.out.println("Solve first-degree equations (linear system) with two variables");
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
        if (D!=0.0) {
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
}