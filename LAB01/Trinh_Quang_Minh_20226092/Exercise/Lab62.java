package week1.Exercise;
import java.util.Scanner;
public class Lab62 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strname = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dheight = keyboard.nextInt();

        System.out.println("Mrs/Ms. " + strname+", "+iAge+" years old. "+"Your height is "+ dheight +"." );
    }
}
