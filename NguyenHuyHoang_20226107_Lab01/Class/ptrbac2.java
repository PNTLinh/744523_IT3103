// 2.2.6

import java.util.Scanner;

public class ptrbac2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nhập các hệ số từ người dùng
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        // Tính Delta
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Hai nghiệm thực
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("2 nghiem pbiet la:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Một nghiệm kép
            double x = -b / (2 * a);
            System.out.println("nghiem kep cua ptr :");
            System.out.println("x = " + x);
        } else {
            // Nghiệm phức
            double re = -b / (2 * a);
            double im = Math.sqrt(-delta) / (2 * a);
            System.out.println("Nghiem phuc cua ptrinh :");
            System.out.println("x1 = " + re + " + " + im + "i");
            System.out.println("x2 = " + re + " - " + im + "i");
        }
    }
}