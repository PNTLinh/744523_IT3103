package week1.Exercise;
import java.util.Scanner;

public class Lab64 {
    public static int Month(String monthInput) {
        String[] months = {"tháng 1", "tháng 2", "tháng 3", "tháng 4", "tháng 5", "tháng 6", "tháng 7", "tháng 8", "tháng 9", "tháng 10", "tháng 11", "tháng 12"};
        for (int i = 0; i < months.length; i++) {
            if (monthInput.equalsIgnoreCase(months[i]) ) {
                return i + 1;
            }
        }
        try {
            int month = Integer.parseInt(monthInput);
            return month;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month;
        do {
            System.out.print("Year: ");
            year = scanner.nextInt();
        } while (year <= 0);
        do {
            System.out.print("Month:  ");
            String monthInput = scanner.next();
            month = Month(monthInput);
        } while (month < 1 || month > 12);

        boolean isLeapYear = isLeapYear(year);

        int daysInMonth = getDaysInMonth(month, isLeapYear);


        System.out.println("Tháng " + month + " năm " + year + " có " + daysInMonth + " ngày.");
    }


}
