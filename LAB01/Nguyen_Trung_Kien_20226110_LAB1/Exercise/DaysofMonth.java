import java.util.Scanner;

public class DaysofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (e.g., January, Jan, Jan., or a number from 1 to 12): ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Enter the year (e.g., 1999): ");
            int year;
            try {
                year = Integer.parseInt(scanner.nextLine().trim());
                if (year < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year entered. Please enter a non-negative year.");
                continue;
            }

            int days = getDaysInMonth(monthInput, year);
            if (days != -1) {
                System.out.printf("The month %s of year %d has %d days.%n", monthInput, year, days);
                break;
            } else {
                System.out.println("Invalid month entered. Please enter the month again.");
            }
        }
        scanner.close();
    }

    public static int getDaysInMonth(String month, int year) {
        month = month.toLowerCase();

        int monthNumber;
        switch (month) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                monthNumber = 1;
                break;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                monthNumber = 2;
                break;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                monthNumber = 3;
                break;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                monthNumber = 4;
                break;
            case "may":
            case "5":
                monthNumber = 5;
                break;
            case "june":
            case "jun":
            case "6":
                monthNumber = 6;
                break;
            case "july":
            case "jul":
            case "7":
                monthNumber = 7;
                break;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                monthNumber = 8;
                break;
            case "september":
            case "sep":
            case "sept":
            case "sept.":
            case "9":
                monthNumber = 9;
                break;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                monthNumber = 10;
                break;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                monthNumber = 11;
                break;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                monthNumber = 12;
                break;
            default:
                return -1; 
        }

        switch (monthNumber) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; 
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
