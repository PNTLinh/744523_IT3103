import java.util.Scanner;

public class DaysOfMonth {
    public enum Month {
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30),
        MAY(31), JUNE(30), JULY(31), AUGUST(31),
        SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }

    public static Month getMonthFromString(String str) {
        switch (str) {
            case "January":
            case "Jan":
            case "Jan.":
            case "1":
                return Month.JANUARY;
            case "February":
            case "Feb":
            case "Feb.":
            case "2":
                return Month.FEBRUARY;
            case "March":
            case "Mar":
            case "Mar.":
            case "3":
                return Month.MARCH;
            case "April":
            case "Apr":
            case "Apr.":
            case "4":
                return Month.APRIL;
            case "May":
            case "May.":
            case "5":
                return Month.MAY;
            case "June":
            case "Jun":
            case "Jun.":
            case "6":
                return Month.JUNE;
            case "July":
            case "Jul":
            case "Jul.":
            case "7":
                return Month.JULY;
            case "August":
            case "Aug":
            case "Aug.":
            case "8":
                return Month.AUGUST;
            case "September":
            case "Sep":
            case "Sep.":
            case "9":
                return Month.SEPTEMBER;
            case "October":
            case "Oct":
            case "Oct.":
            case "10":
                return Month.OCTOBER;
            case "November":
            case "Nov":
            case "Nov.":
            case "11":
                return Month.NOVEMBER;
            case "December":
            case "Dec":
            case "Dec.":
            case "12":
                return Month.DECEMBER;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a month: ");
        String strName = keyboard.nextLine();

        Month month = getMonthFromString(strName);
        if (month == null) {
            System.out.println("Invalid month entered.");
            keyboard.close();
            return; // Exit if the month is invalid
        }

        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();

        // Validate the year
        if (year < 1) {
            System.out.println("Invalid year entered. Year must be greater than 0.");
            keyboard.close();
            return; // Exit if the year is invalid
        }

        int day = month.getDays();
        
        // Check for leap year if February
        if (month == Month.FEBRUARY) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        day = 29; // Leap year
                    }
                } else {
                    day = 29; // Leap year
                }
            }
        }

        System.out.println("Days in " + month + ": " + day);
        keyboard.close();
    }
}
