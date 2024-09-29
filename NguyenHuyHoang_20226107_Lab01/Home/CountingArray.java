package Home;

import java.util.Scanner;
import java.util.Arrays; //Gói có các hàm xử lý mảng

public class CountingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("n : ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.print("khong hop le ");
            return;
        }

        double[] arr = new double[n]; //Khai báo mảng arr có n phần tử

        for (int i=0;i<n;i++){
            System.out.print("arr["+i+"]: ");
            arr[i] = sc.nextDouble();
        }

        //Sắp xếp mảne tử bé đến lớn
        Arrays.sort(arr);

        //Tính tổng các phần tử trong mảng
        double sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }

        //Tìm số trung bình cộng của các giá trị phần tử trong mảng
        double avg = sum/n;

        //In các kết quả yêu cầu
        System.out.println("sap xep tu be den lon : ");
        for (double i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n tong cac phan tu: "+sum);
        System.out.print("trung binh cong : "+avg);
    }
}