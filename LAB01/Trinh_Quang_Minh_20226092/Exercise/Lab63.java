package week1.Exercise;
import java.util.Scanner;

public class Lab63 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter n: ");
        int a=scanner.nextInt();
        for (int i=1; i<=a;i++) {
            for (int j=(a-1);j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
    }

