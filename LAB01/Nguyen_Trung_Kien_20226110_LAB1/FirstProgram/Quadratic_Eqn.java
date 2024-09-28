// Nguyen Trung Kien 20226110
// Dua ra man hinh 1 o message thong bao
// Nhap 2 so a,b
// In ra man hinh ket qua tinh toan pt bac 2, neu a=0 quay ve giai pt bac 1

import java.util.Scanner;

public class Quadratic_Eqn {

    static void first_degree(double b, double c) {
        if (b == 0) {
            System.out.println("No solution");
        } else {
            double x = -c / b;
            System.out.println("The solution is: x = " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the quadratic equation solver!");

        Scanner sc = new Scanner(System.in);
        double a, b, c, x, x1, x2;
        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b =");
        b = sc.nextDouble();
        System.out.println("c =");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is a first-degree equation");
            first_degree(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("The equation has a unique root: " + x);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
