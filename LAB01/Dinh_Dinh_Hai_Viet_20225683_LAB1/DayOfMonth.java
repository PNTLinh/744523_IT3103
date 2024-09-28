import java.util.Scanner;
public class DayOfMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int year = sc.nextInt();
		while(year < 0) {
			System.out.println("Must be a positive integer. Try again!");
			System.out.println("Please enter a year: ");
			year = sc.nextInt();
		}
		
		System.out.println("Please enter a month: ");
		int month = sc.nextInt();
		while(month < 1 || month > 12) {
			System.out.println("Must be greater than 0 and smaller than 13. Try again!");
			System.out.println("Please enter a month: ");
			month = sc.nextInt();
		}
		
		int day = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;
		}
		System.out.printf("Month %d year %d has %d days.\n", month, year, day);
		sc.close();
	}
}
