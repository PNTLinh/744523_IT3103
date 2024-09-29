import java.util.Scanner;
// 
public class ptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        double a = sc.nextDouble();
        System.out.println("Nhap b : ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double result = -b / a;
            System.out.println("Kết quả x: " + result);
        }
    }
}