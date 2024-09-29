package Home;

//6.4

import java.util.Scanner;
public class NumberOfDayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap nam : ");
        int year = sc.nextInt();

        System.out.print("Nhap thang: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("khong hop le.");
        } else {
            int daysInMonth = getDaysInMonth(year, month);
            System.out.println("Thang " + month + " nam " + year + " co " + daysInMonth + " ngay.");
        }
    }

    //Hàm (Phương thức) tính số ngày, với đầu vào là tháng và năm
    public static int getDaysInMonth(int year, int month) {
        int days = 0;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29; // Năm nhuận
                    } else {
                        days = 28; // Năm không nhuận
                    }
                    break;
                default:
                    days = 31;
                    break;
            }
        }
        return days;    //Trả về kết quả là ngày
    }
}