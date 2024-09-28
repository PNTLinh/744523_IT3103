package week1.Exercise;
import java.util.Scanner;

public class Lab66 {
    public static void main(String args[])
    {
        int a, b, x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of rows of matrix");
        a = sc.nextInt();
        System.out.println("Number of columns of matrix");
        b  = sc.nextInt();

        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.println("Input elements of first matrix");

        for (  x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                array1[x][y] = sc.nextInt();

        System.out.println("Input the elements of second matrix");

        for ( x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                array2[x][y] = sc.nextInt();

        for ( x = 0 ; x < a ; x++ )
            for ( y = 0 ; y < b ; y++ )
                sum[x][y] = array1[x][y] + array2[x][y];

        System.out.println("Sum of the matrices: ");

        for ( x = 0 ; x < a ; x++ )
        {
            for ( y = 0 ; y < b ; y++ )
                System.out.print(sum[x][y]+"\t");

            System.out.println();
        }
    }
}